package login;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");

		// DB에서 모든 목록 가져오기
		LoginService service = new LoginService();
		List<LoginDTO> list = service.selectAll();

		System.out.println("list size:" + list.size());

		
		request.setAttribute("list", list);

		
		request.getRequestDispatcher("/userlist.jsp").forward(request, response);
		

	}

}
