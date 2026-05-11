package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import com.example.demo.dto.EmpDTO;

public interface EmpDAO {
	
	List<EmpDTO> selectAllEmp();
	public EmpDTO selectOneEmp();
	public Map selectOneEmpMap();
	public EmpDTO selectEmpno(int empno);
	public List selectEname(String ename);
	public List selectJob(String job);
	public List selectJobEname(EmpDTO dto);
	public int insertEmp2(EmpDTO dto);
	public int deleteEmp(int empno);
	public int updateEmp(EmpDTO dto);
	public EmpDTO selectEmpOne(int empno);
	
	List search(EmpDTO dto);
	List choice(EmpDTO dto);
	
}
