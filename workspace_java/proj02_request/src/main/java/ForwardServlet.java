

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/forward의 doGet 실행"); // 서버 콘솔에 실행 로그 출력
		response.setContentType("text/html; charset=utf-8;");
		request.setCharacterEncoding("utf-8");
		
		String text = request.getParameter("text");
		System.out.println("text: " + text);
		
//		String item = (String)request.getAttribute("item");
//		System.out.println("item: " +item);
		
		// 어차피 이동한 곳에서 응답하느라
		// 지금 넣어봐야 소용없음 
		response.getWriter().println("/forward의 응답 [GET]");
		
		request.setAttribute("item", "롱소드");
		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("another");
//		dispatcher.forward(request, response);
		request.getRequestDispatcher("another").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/forward의 doPost 실행");
		response.setContentType("text/html; charset=utf-8;");
		request.setCharacterEncoding("utf-8");
		
		String text = request.getParameter("text");
		System.out.println("text: " + text);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("another");
		dispatcher.forward(request, response);
		
		
	}

}
