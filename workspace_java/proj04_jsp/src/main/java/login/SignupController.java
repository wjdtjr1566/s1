package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/signup do post실행");

		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		// 파라메터 확보 
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String phonenumber = request.getParameter("phonenumber");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		
		LoginService service = new LoginService();
		LoginDTO dto = new LoginDTO();
		dto.setId(id);
		dto.setPassword(password);
		dto.setName(name);
		dto.setPhonenumber(Integer.parseInt(phonenumber));
		dto.setAge(Integer.parseInt(age));
		dto.setAddress(address);
		
		LoginDTO dto1 = service.signup(dto);
		
		
	
	}

}
