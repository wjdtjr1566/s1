package login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/login")
public class LoginController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("/login do post실행");

		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");

		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		System.out.println("id: " + id);
		System.out.println("pw: " + password);
		
		// DB에서 모든 목록 가져오기
		LoginService service = new LoginService();
		LoginDTO dto = service.login(id,password);
		
		if ( dto != null) {
			HttpSession session = request.getSession();
		    session.setAttribute("loginUser", dto);
			System.out.println("로그인 성공");
			
			response.sendRedirect("/proj04_jsp/main.jsp");
		} else {
			System.out.println("로그인 실패");
			
			response.sendRedirect("/proj04_jsp/login_.jsp?msg=1");
			
		}

	}

}
