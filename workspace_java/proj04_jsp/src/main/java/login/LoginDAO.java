package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;




public class LoginDAO {
	public LoginDTO login(String id, String password) {
		

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		// 1. DB 접속
		LoginDTO loginDTO = null;
		try {
			// context.xml에 있는 DB정보로 커넥션 풀을 가져온다
			Context ctx = new InitialContext();
			// DataSource : 커넥션 풀 관리자
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

			// DB 접속 (그런데 이제 커넥션 풀로)
			conn = dataFactory.getConnection();

			
			// 2. SQL 준비
//			String query = "select * from todo where todo_id="+ todo_id; 
			String query = "select * from join_ where id=? and password=?"; // 변수 방식
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			ps.setString(2, password);

			// 3. 실행 및 결과 확보
			rs = ps.executeQuery();
			
			// 4. 결과 활용
			if (rs.next()) {
				loginDTO = new LoginDTO();
				loginDTO.setId(rs.getString("id"));
				loginDTO.setName(rs.getString("name"));
				loginDTO.setPhonenumber(rs.getInt("phonenumber"));
				loginDTO.setAddress(rs.getString("address"));
				loginDTO.setPassword(rs.getString("password"));
				loginDTO.setAge(rs.getInt("age"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return loginDTO;

	}

	
	// select 할거야 
public List<LoginDTO> selectAll() {
		
	 	List<LoginDTO> list = new ArrayList<>();

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		// 1. DB 접속
		LoginDTO loginDTO = null;
		try {
			// context.xml에 있는 DB정보로 커넥션 풀을 가져온다
			Context ctx = new InitialContext();
			// DataSource : 커넥션 풀 관리자
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

			// DB 접속 (그런데 이제 커넥션 풀로)
			conn = dataFactory.getConnection();

			
			// 2. SQL 준비
			String query = "select * from join_"; 
			ps = conn.prepareStatement(query);
			

			// 3. 실행 및 결과 확보
			rs = ps.executeQuery();
			
			// 4. 결과 활용
			while (rs.next()) {
				loginDTO = new LoginDTO();
				loginDTO.setId(rs.getString("id"));
				loginDTO.setName(rs.getString("name"));
				loginDTO.setPhonenumber(rs.getInt("phonenumber"));
				loginDTO.setAddress(rs.getString("address"));
				loginDTO.setPassword(rs.getString("password"));
				loginDTO.setAge(rs.getInt("age"));
				
				list.add(loginDTO);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return list;

	}
	
	

	
public LoginDTO update(LoginDTO dto) { 
		

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		// 1. DB 접속
//		LoginDTO loginDTO = null;
		try {
			// context.xml에 있는 DB정보로 커넥션 풀을 가져온다
			Context ctx = new InitialContext();
			// DataSource : 커넥션 풀 관리자
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

			// DB 접속 (그런데 이제 커넥션 풀로)
			conn = dataFactory.getConnection();

			
			// 2. SQL 준비
			String query = "update JOIN_ (id, password, address, phonenumber, age, name)"+
						   " VALUES(?, ?, ?, ?, ?, ?)"; // 바꿔야함 
			ps = conn.prepareStatement(query);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPassword());
			ps.setString(3, dto.getAddress());
			ps.setLong(4, dto.getPhonenumber());
			ps.setInt(5, dto.getAge());
			ps.setString(6, dto.getName());
			
			

			// 3. 실행 및 결과 확보
			int result = ps.executeUpdate();
			System.out.println("update 결과:"+ result);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
		return dto;
		
		

	}

public LoginDTO signup(LoginDTO dto) { // 여기는 insert 
	

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	// 1. DB 접속
//	LoginDTO loginDTO = null;
	try {
		// context.xml에 있는 DB정보로 커넥션 풀을 가져온다
		Context ctx = new InitialContext();
		// DataSource : 커넥션 풀 관리자
		DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

		// DB 접속 (그런데 이제 커넥션 풀로)
		conn = dataFactory.getConnection();

		
		// 2. SQL 준비
		String query = "INSERT INTO JOIN_ (id, password, address, phonenumber, age, name)"+
					   " VALUES(?, ?, ?, ?, ?, ?)";
		ps = conn.prepareStatement(query);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPassword());
		ps.setString(3, dto.getAddress());
		ps.setLong(4, dto.getPhonenumber());
		ps.setInt(5, dto.getAge());
		ps.setString(6, dto.getName());
		
		

		// 3. 실행 및 결과 확보
		int result = ps.executeUpdate();
		System.out.println("insert 결과:"+ result);
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	return dto;
	
	

}
	
}


