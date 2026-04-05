package todo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DTO.TodoDTO;
import todo.service.TodoService;

@WebServlet("/todo/detail")
public class TodoDetailController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("/todo/detail doGet 실행");
		// 요청의 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		// 응답의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");

		try {
			// "todo_id" 받아서 출력하기
			String todo_id = request.getParameter("todo_id");
			System.out.println("todo_id: "+todo_id);
			
			int nTodo_id = Integer.parseInt(todo_id);
			
//			nTodo_id를 service --> DAO 까지 보낼꺼임
			TodoService todoService = new TodoService();
			TodoDTO todoDTO = todoService.getTodo(nTodo_id);
			
			System.out.println(todoDTO);
			
			PrintWriter out = response.getWriter();
//			out.println("<a href=/proj03_1_todo/todo>"+ "목록으로" +"</a>");
			out.println("<a href=../todo>"+ "목록으로" +"</a>");
			out.write("<br> todo_id:" + todoDTO.getTodo_id());
			out.write("<br> duedate:" + todoDTO.getDuedate());
			out.write("<br> done:" + todoDTO.getDone());
			out.write("<br> content:" + todoDTO.getContent());
			out.write("<br> ctime:" + todoDTO.getCtime());
			out.write("<hr>");
			out.write("<a href='/proj03_1_todo/todo/modify?todo_id=" + todoDTO.getTodo_id()+"'>수정페이지로 이동</a><br>");

			out.write("<form method='post' action='/proj03_1_todo/todo/delete'>");
			out.write("<input type='hidden' name='todo_id' value='" + todoDTO.getTodo_id() + "'>");
			out.write("<button>삭제</button>");
			out.write("</form>");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
