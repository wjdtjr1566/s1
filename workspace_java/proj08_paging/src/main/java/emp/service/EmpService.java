package emp.service;

import java.util.HashMap;
import java.util.List;

import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

public class EmpService {
	EmpDAO dao = new EmpDAO();
	
	public map getlist(EmpDTO empDTO) {
		
		int size = empDTO.getSize();
		int page = empDTO.getPage();
		
		int start = 0, 
			end = 0;
		
		end = size * page;
//		start = (page-1) * (size+1);
		start = end - (size-1);
		
		empDTO.setEnd(end);
		empDTO.setStart(start);
		
		
		
		Map map = new HashMap();
		  map.put("list",list);
		  map.put("totalCount",totalCount);
		  
		return map;
	}
}

