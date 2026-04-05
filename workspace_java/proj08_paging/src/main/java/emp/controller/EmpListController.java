package emp.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;


@WebServlet("/list")
public class EmpListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		int size = 10; // 페이지당 표시
		int page = 1; // 현재 페이지
		
		String sSize = request.getParameter("size");
		String sPage = request.getParameter("page");
		
		try {
			size = Integer.parseInt(sSize);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		// 같이 있으면 처음꺼 오류 시 두번째도 안되니까 분리
		try {
			page = Integer.parseInt(sPage);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		EmpDTO empDTO = new EmpDTO();
		empDTO.setSize(size);
		empDTO.setPage(page);
				
		
		// DB 조회
//		EmpService service = new EmpService();
//		List<EmpDTO> list = service.getlist(empDTO);
//		System.out.println( "list.size: " +list.size());
		
		Map map = (Map)empService.getListEmp(empDTO);
		map.put("size", size);
		map.put("page", page);
		request.setAttribute("map", map);
		
//		request.setAttribute("list", list);
		request.setAttribute("size", size);
		request.setAttribute("page", page);
		
		// jsp 로 보냄 
		request.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(request, response);
		
	
	}

	
}
