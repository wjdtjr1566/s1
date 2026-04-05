package todo.service;

import java.util.List;

import todo.DAO.TodoDAO;
import todo.DTO.TodoDTO;

public class  TodoService{
	
	public List getList() {
		// TodoDAO의 selectAll을 호출하고
		// 그 list를 return 해주세요.
		
		TodoDAO dao = new TodoDAO();
		 List list = dao.selectAll();
		return list;
	}
	
	public TodoDTO getTodo(int todo_id) {
		TodoDAO todoDAO = new TodoDAO();
		TodoDTO todoDTO = todoDAO.selectOne(todo_id);
		return todoDTO;
		
	}
	public int getaddTodo(TodoDTO todoDTO) {
		TodoDAO todoDAO = new TodoDAO();
		int a =todoDAO.insertTodo(todoDTO);
		return a;
	}
	
	public int updatetodo(TodoDTO DTO) {
		TodoDAO todoDAO = new TodoDAO();
		return todoDAO.updateTodo(DTO);
	
	}
	
	public int deletetodo(int todo_id) {
		TodoDAO todoDAO = new TodoDAO();
		return todoDAO.deletetodo(todo_id);
	
	}
}
