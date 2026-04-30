package kr.or.human4.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.human4.dao.EmpDAO;
import kr.or.human4.dto.EmpDTO;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpDAO empDAO;
	
	@Override
	public List<EmpDTO> getEmpList() {
		List<EmpDTO> result = empDAO.selectAllEmp();
		
		return result;
	}

	@Override
	public EmpDTO getEmp() {
		EmpDTO empDTO = empDAO.selectOneEmp();
		return empDTO;
	}
	
	@Override
	public Map getEmpMap() {
		Map map = empDAO.selectOneEmpMap();
		return map;
	}
	
	@Override
	public EmpDTO selectEmpno(int empno) {
		EmpDTO empDTO = empDAO.selectEmpno(empno);
		return empDTO;
	}
	
	@Override
	public List selectEname(String ename) {
		List list = empDAO.selectEname(ename);
		return list ;
	}
	
	@Override
	public List selectJob(String job) {
		List list = empDAO.selectJob(job);
		return list ;
	}

	@Override
	public List selectJobEname(EmpDTO empDTO) {
		List list = empDAO.selectJobEname(empDTO);
		return list ;
	}
	
	@Override
	public int insertEmp2(EmpDTO empDTO) {
		int result = empDAO.insertEmp2(empDTO);
		return result ;
	}
	
	@Override
	public int deleteEmp(int empno) {
		int result = empDAO.deleteEmp(empno);
		return result;
	}
	
    @Override
    public int updateEmp(EmpDTO empDTO) {
        int result = empDAO.updateEmp(empDTO);
        return result;
    }
    
    @Override
    public EmpDTO selectEmpOne(int empno) {
        EmpDTO empDTO = empDAO.selectEmpOne(empno);
        return empDTO;
    }

	@Override
	public List<EmpDTO> search(EmpDTO dto) {
		List<EmpDTO> result = empDAO.search(dto);
		return result;
	}
	
	@Override
	public List<EmpDTO> choice(EmpDTO dto) {
		List<EmpDTO> result = empDAO.choice(dto);
		return result;
	}
	
	

}
