package empService;

import java.util.List;

import empDAO.EmpDAO;

public class EmpService {
	public List getlist() {
		EmpDAO dao = new EmpDAO();
		List list = dao.selectAll();
		return list;
	}
}
