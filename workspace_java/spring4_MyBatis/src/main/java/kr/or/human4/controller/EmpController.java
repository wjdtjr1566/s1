package kr.or.human4.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.human4.dto.EmpDTO;
import kr.or.human4.service.EmpService;

@Controller
public class EmpController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	
	@Autowired
	EmpService empService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("/list 실행");
		
		List<EmpDTO> list = empService.getEmpList();
		System.out.println("EmpController: list: " + list);
		
		model.addAttribute("list",list);
		
		return "emp";
	}
	
	@RequestMapping("/one")
	public String one(Model model) {
		System.out.println("/one 실행");
		
		EmpDTO empDTO = empService.getEmp();
		System.out.println("/one empDTO : " + empDTO);
		
		model.addAttribute("empDTO",empDTO);
		
		return "emp";
	}
	
	@RequestMapping("/map")
	@ResponseBody
	public Map empmap() {
		System.out.println("/map 실행");
		
		Map map = empService.getEmpMap();
		System.out.println("/oneMap: map : " + map);
		
//		model.addAttribute("map",map);
		
		return map;
	}
	
	@RequestMapping("/getEmpno")
	public String getEmpno(
			@RequestParam(value="empno", required=false)
			int empno,Model model
		) {
		System.out.println("/getEmpno 실행");
		
		System.out.println("empno: "+ empno);
		EmpDTO empDTO = empService.selectEmpno(empno);

		model.addAttribute("empDTO",empDTO);
		
		return "result";
	}
	
	@RequestMapping("/getEname")
	public String getEname(
			@RequestParam(value="ename", required=false)
			String ename,Model model
		) {
		System.out.println("/getEmpno 실행");
		
		System.out.println("ename: "+ ename);
		
		logger.info("/getEmpno 실행");
		logger.warn("warn:ename: "+ ename);
		logger.error("error:ename: "+ ename);
		
		 List list = empService.selectEname(ename);

		model.addAttribute("list",list);
		
		return "result";
	}
	
	@RequestMapping("/getJob")
	public String getJob(Model model,
			@RequestParam(value="job", required=false)
			String job
		) {
		System.out.println("/getJob 실행");
		
		
		logger.info("job: " + job);
		
		 List list = empService.selectJob(job);

		model.addAttribute("list",list);
		
		return "result";
	}
	
	@RequestMapping("/getJobEname")
	public String getJobEname(
			Model model,
			EmpDTO empDTO
		) {
		System.out.println("/getJobEname 실행");
		
		
		logger.info("jobEname: " + empDTO);
		
		 List list = empService.selectJobEname(empDTO);

		model.addAttribute("list",list);
		
		return "result";
	}
	
	@RequestMapping("/join.do")
	public String join() {
		System.out.println("/join.do 실행");
		
		return "join";
	}
	
	@RequestMapping("/joinEmp2")
	public String joinEmp2(Model model,
			EmpDTO empDTO
		) {
		System.out.println("/joinEmp2 실행");
		
		logger.info("empDTO: " + empDTO);
		
		int result = empService.insertEmp2(empDTO);
		
		if( result < 1) {
			model.addAttribute("msg", "가입안됨");
			model.addAttribute("msg_code", "1");
		}
		
		return "redirect:/list";
	}
	
    @RequestMapping("/delete")
    public String delete(int empno) {
        empService.deleteEmp(empno);
        return "redirect:/list";
    }
    
    @RequestMapping("/update")
    public String update(EmpDTO dto) {
        empService.updateEmp(dto);
        return "redirect:/list";
    }
    
    @RequestMapping("/detail")
    public String detail(int empno, Model model) {
        EmpDTO empDTO = empService.selectEmpOne(empno);
        model.addAttribute("empDTO", empDTO);
        return "empdetail";
    }
    
    // 로그인 로그아웃 세션사용해서 만들기 
    // 로그인 jsp도 만들어야함 
    
    @RequestMapping("/search")
	public String search(Model model,
			@ModelAttribute("empDTO")
			EmpDTO empDTO) {
    	model.addAttribute("empDTO", empDTO);
		System.out.println("/list 실행");
		System.out.println("empDTO" + empDTO);
		
		List<EmpDTO> list = empService.search(empDTO);
		System.out.println("/list: list: " + list);
		
		model.addAttribute("list",list);
		
		return "emp";
	}
    
    @RequestMapping("/choice")
  	public String choice(Model model,
  			@ModelAttribute("empDTO")
  			EmpDTO empDTO) {
      	model.addAttribute("empDTO", empDTO);
  		System.out.println("/choice 실행");
  		System.out.println("empDTO" + empDTO);
  		
  		List<EmpDTO> list = empService.choice(empDTO);
  		System.out.println("/list: list: " + list);
  		
  		model.addAttribute("list",list);
  		
  		return "emp";
  	}
    
    @RequestMapping("/mapper")
  	public String mapper(Model model) {
    	List<EmpDTO> list = empService.selectMapper();
    	
    	model.addAttribute("list", list);
    	return "emp";
    	
    }
    
    





}


