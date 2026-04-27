package kr.or.human3;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalorieController {
	
	@RequestMapping("/calorie/main")
	public String main(HttpSession session, Model model) {
		System.out.println("/cal.do 실행");
		
		 Integer bodyCal = (Integer) session.getAttribute("bodyCal");
		if ( bodyCal==null ) {
			bodyCal = 0;
			session.setAttribute("bodyCal", bodyCal);
		}
		
		 model.addAttribute("bodyCal", bodyCal);
		 
		return "calorie";
	}
	
	// 먹기 
	@RequestMapping("/calorie/eat")
	public String eat(int foodCal, HttpSession session, Model model) {
		
		System.out.println("/eat 실행");
		 Integer bodyCal = (Integer) session.getAttribute("bodyCal");
		 
		 if ( bodyCal==null ) {
				bodyCal = 0;
			}
		 
		 bodyCal += (int)(foodCal * 0.2);
		 
		 session.setAttribute("bodyCal", bodyCal);
		 
		 model.addAttribute("bodyCal", bodyCal);
		return "calorie";
	}
		// 운동 
	
	  @RequestMapping("/calorie/exercise")
	    public String exercise(int exerciseCal, HttpSession session,Model model) {
		  
		  System.out.println("/exercise 실행");
	        Integer bodyCal = (Integer) session.getAttribute("bodyCal");

	        if (bodyCal == null) { 
	        	bodyCal = 0;
	        }

	        // 운동 칼로리만큼 감소
	        bodyCal = bodyCal - exerciseCal;

	        
	        if (bodyCal < 0) {
	            bodyCal = 0;
	        }

	        session.setAttribute("bodyCal", bodyCal);
	        
	        model.addAttribute("bodyCal", bodyCal);

	        return "calorie";
	    }
	
	
}
