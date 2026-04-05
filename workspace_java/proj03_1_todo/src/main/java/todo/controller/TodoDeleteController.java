package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.service.TodoService;


@WebServlet("/todo/delete")
public class TodoDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 System.out.println("/todo/delete 실행");

		int todo_id = Integer.parseInt(request.getParameter("todo_id"));

        TodoService service = new TodoService();
        service.deletetodo(todo_id);

        response.sendRedirect("http://localhost:8080/proj03_1_todo/todo");
        
        System.out.println("todo_id: " + todo_id);

	      
	}

}
