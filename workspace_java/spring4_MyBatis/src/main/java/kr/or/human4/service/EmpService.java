package kr.or.human4.service;

import java.util.List;
import java.util.Map;

import kr.or.human4.dto.EmpDTO;

public interface EmpService {
	
	List<EmpDTO> getEmpList();
	EmpDTO getEmp();
	Map getEmpMap();
	EmpDTO selectEmpno(int empno);
	List selectEname(String ename);
	List selectJob(String job);
	List selectJobEname(EmpDTO dto);
	
	int insertEmp2(EmpDTO empDTO);
	int deleteEmp(int empno);
	int updateEmp(EmpDTO empDTO);
	EmpDTO selectEmpOne(int empno);
	List<EmpDTO> search(EmpDTO dto);
	List<EmpDTO> choice(EmpDTO dto);
	
	List<EmpDTO> selectMapper();
}
