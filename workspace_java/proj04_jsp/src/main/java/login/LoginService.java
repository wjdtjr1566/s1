package login;

import java.util.List;

public class LoginService {
	
		public LoginDTO login(String id, String password) {
			LoginDAO dao = new LoginDAO();
			LoginDTO dto = dao.login(id,password);
			return dto;
		}
		
		public LoginDTO signup(LoginDTO dto) {
			LoginDAO dao = new LoginDAO();
			LoginDTO result = dao.signup(dto);
			return result;
		}
		
		public List selectAll() {
			LoginDAO dao = new LoginDAO();
			List<LoginDTO> result = dao.selectAll();
			return result;
		}
}
	

