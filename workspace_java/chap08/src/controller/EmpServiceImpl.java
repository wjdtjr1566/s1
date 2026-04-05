package controller;

import java.util.ArrayList;
import java.util.List;

public class EmpServiceImpl implements EmpService {
	
	EmpDAO empDAO = new EmpDAOImpl();
	
	@Override
	public List getEmpno() {
		
		List<Integer> list = empDAO.selectEmpno();
		
		List list2 = new ArrayList(); 
		for (int i =0; i<list.size(); i++) {
			if (list.get(i) >= 3000) {
				list2.add(list.get(i));
				
			}
		}
		return list2;
		
	}
	

}
