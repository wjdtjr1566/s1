package kr.or.human4.dto;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class EmpDTO {
	
	private int empno;
	private String ename;
	private String job;
	private Integer mgr;
	private Date hiredate;
	private int sal = Integer.MIN_VALUE;
	private Integer comm;
	private int deptno;
	private Map map;
	
	private int size = 10;
	private int page = 1;
	private int start = 0;
	private int end;
	
	private String type;
	private String keyword;
	
	private List empnos;	
	
}
