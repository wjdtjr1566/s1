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

@WebServlet("/todo/modify")
public class TodoModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/modify doGet 실행");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		String todo_id = request.getParameter("todo_id");
		System.out.println("todo_id: " +todo_id);
		
		int nTodo_id = Integer.parseInt(todo_id);
		
//		nTodo_id를 service --> DAO 까지 보낼꺼임
		TodoService todoService = new TodoService();
		TodoDTO todoDTO = todoService.getTodo(nTodo_id);
//		TodoDetailController tdc = new TodoDetailController();
		
		
		 
		PrintWriter out = response.getWriter();
	
			
		out.write("<form method='post' action='update'>");
		out.write("Todo_id: "+"  <input type='text' name='todo_id' value='" + todoDTO.getTodo_id()+"'>" + "<br><br>");
		out.write("Duedate: "+"<input type='date' name='duedate' value='" + todoDTO.getDuedate()+"'>" + "<br><br>");
		out.write("done: "+"  <input type='text' name='done' value='" + todoDTO.getDone()+"'>" + "<br><br>");
		out.write("content: "+"  <input type='text' name='content' value='" + todoDTO.getContent()+"'>"  +"<br><br>");
		out.write("ctime: "+"  <input type='text' name='ctime'value='" + todoDTO.getCtime()+"'>"+"<br><br><br><br>");
		out.write("<input type='submit' value='수정버튼'>");
		out.write("</form>");
		
//		response.sendRedirect("../todo/update");
		
//     <input type= text value="1234" 
	}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			System.out.println("do post 실행");
			// 요청의 한글 깨짐 방지
			request.setCharacterEncoding("utf-8");
			// 응답의 한글 깨짐 방지
			response.setContentType("text/html; charset=utf-8;");
			
			String content = request.getParameter("content");
			String done = request.getParameter("done");
			String todo_id = request.getParameter("todo_id");
			System.out.println("content: "+ content);
			TodoDTO todoDTO = new TodoDTO();
			todoDTO.setContent(todoDTO.getContent());
			todoDTO.setDone(todoDTO.getDone());
			todoDTO.setTodo_id(todoDTO.getTodo_id());
			
			TodoService todoservice = new TodoService();
			todoservice.updatetodo(todoDTO);
			
			response.sendRedirect("/proj03_1_todo/todo");
			
			
		
		
		
	}

}
