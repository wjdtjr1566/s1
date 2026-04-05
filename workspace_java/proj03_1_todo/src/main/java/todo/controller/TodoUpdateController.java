package todo.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DTO.TodoDTO;
import todo.service.TodoService;


@WebServlet("/todo/update")
public class TodoUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/update do Post 실행");
		System.out.println("do post 실행");
		// 요청의 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		// 응답의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
		
		String todo_id = request.getParameter("todo_id");
		String content = request.getParameter("content");
		String done = request.getParameter("done");
		String ctime = request.getParameter("ctime");
		String duedate = request.getParameter("duedate");
		
		 int done1 = Integer.parseInt(done);
		 int td = Integer.parseInt(todo_id);
//		 Date dDate = Date.valueOf(duedate);
		
		TodoDTO todoDTO = new TodoDTO();
		
		todoDTO.setContent(content);
		todoDTO.setDone(done1);
		todoDTO.setTodo_id(td);
//		todoDTO.setDuedate(dDate);
		
		
		TodoService todoservice = new TodoService();
		int count = todoservice.updatetodo(todoDTO);
		System.out.println("업데이트 결과:" + count);
		response.sendRedirect("detail?todo_id=" + todo_id);
		
	}

}
