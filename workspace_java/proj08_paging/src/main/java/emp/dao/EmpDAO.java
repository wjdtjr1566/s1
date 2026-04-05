package emp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp.dto.EmpDTO;

public class EmpDAO {
	public List<EmpDTO> selectAll(EmpDTO empDTO) {
		List<EmpDTO> list = new ArrayList<EmpDTO>();

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// JNDI 방식
			// context.xml에 있는 DB정보로 커넥션 풀을 가져온다
			Context ctx = new InitialContext();
			// DataSource : 커넥션 풀 관리자
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// DB 접속 (그런데 이제 커넥션 풀로)
			conn = dataFactory.getConnection();

			// SQL 준비
//			String query = "SELECT * FROM ("
//					+ "SELECT rownum AS rnum, e.* FROM ("
//					+ "   SELECT emp.* FROM EMP"
//					+ "   ORDER BY hiredate"
//					+ "	) e"
//					+ ")"
//					+ "WHERE rnum >= ? AND rnum <= ?";
				ps = new LoggableStatement(conn,
					 "SELECT * FROM ("
					+ "SELECT rownum AS rnum, e.* FROM ("
					+ "   SELECT emp.* FROM EMP"
					+ "   ORDER BY hiredate"
					+ "	) e"
					+ ")"
					+ "WHERE rnum >= ? AND rnum <= ?"
					);
			
//			ps = conn.prepareStatement(query);
			ps.setInt(1, empDTO.getStart());
			ps.setInt(2, empDTO.getEnd());
			
			System.out.println( ((LoggableStatement)ps).getQueryString());

			// SQL 실행 및 결과 확보
			rs = ps.executeQuery();

//			print (rs,response);

			// 결과 활용
			while (rs.next()) { // 다음거 없으면 반복 끝!

				int empno = rs.getInt("empno");
				System.out.println("empno " + empno);
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				Integer comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");

				EmpDTO dto = new EmpDTO();
				
				dto.setEmpno(empno);
				dto.setEname(ename);
				dto.setJob(job);
				dto.setMgr(mgr);
				dto.setHiredate(hiredate);
				dto.setSal(sal);
				dto.setComm(comm);
				dto.setDeptno(deptno);
				
				System.out.println(empDTO);

				list.add(dto);

			}
			System.out.println(list);

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
		System.out.println("list.size(): " + list.size());
		return list;
	}
	
	public int selectEmpTotal() {
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		int totalCount = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// JNDI 방식
			// context.xml에 있는 DB정보로 커넥션 풀을 가져온다
			Context ctx = new InitialContext();
			// DataSource : 커넥션 풀 관리자
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// DB 접속 (그런데 이제 커넥션 풀로)
			conn = dataFactory.getConnection();

			// SQL 준비
//			String query = "SELECT * FROM ("
//					+ "SELECT rownum AS rnum, e.* FROM ("
//					+ "   SELECT emp.* FROM EMP"
//					+ "   ORDER BY hiredate"
//					+ "	) e"
//					+ ")"
//					+ "WHERE rnum >= ? AND rnum <= ?";
				ps = new LoggableStatement(conn,
					"SELECT count(*) cnt From emp"
					);
			
//			ps = conn.prepareStatement(query);
//			ps.setInt(1, empDTO.getStart());
//			ps.setInt(2, empDTO.getEnd());
			
			System.out.println( ((LoggableStatement)ps).getQueryString());

			// SQL 실행 및 결과 확보
			rs = ps.executeQuery();

//			print (rs,response);

			// 결과 활용
			if (rs.next()) { // 다음거 없으면 반복 끝!

				totalCount = rs.getInt("cnt");
				
//				System.out.println(empDTO);

				

			}
			System.out.println(list);

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
		System.out.println("list.size(): " + list.size());
		return totalCount;
	}
}
