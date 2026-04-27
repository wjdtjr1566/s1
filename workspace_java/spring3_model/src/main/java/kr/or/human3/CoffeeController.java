package kr.or.human3;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CoffeeController {
	 // 퀴즈 푸는중 
//		@RequestMapping(value="/quiz", method=RequestMethod.GET)
//		public String quiz() {
//			System.out.println("/quiz 실행됨");
//			return "quiz";
//		}
		  @RequestMapping(value="/quiz", method=RequestMethod.GET)
		public String quizPost(HttpServletRequest request, HttpServletResponse response ,String coffee, Integer count, Model model) throws UnsupportedEncodingException {
			System.out.println("/quiz GET 실행됨");
			
//			response.setContentType("text/html; charset=utf-8;");
//			request.setCharacterEncoding("utf-8");
			
			if ( coffee == null || count == null) {
				return "quiz";
			}
			
			int price = 0; 
			
			if("아아".equals(coffee)) {
				price = 2000;
			} else if ("얼박사".equals(coffee)) {
				price = 3000;
			}
			System.out.println("price " + price);
			
			
			int total = price * count;
	        model.addAttribute("coffee", coffee);
	        model.addAttribute("count", count);
	        model.addAttribute("total", total);
	        System.out.println("coffee"+ coffee);
	        System.out.println("count" + count);
	        System.out.println("total" + total);
	       
	        return "quiz";
		}
		  
		  @RequestMapping("/quizorder")
		  @ResponseBody
		  public Map<String, Object> quizorder(String coffee, Integer count) {

		      int price = 0;

		      if ("아아".equals(coffee)) {
		          price = 3000;
		      } else if ("얼박사".equals(coffee)) {
		          price = 4000;
		      }
		      System.out.println("price" +price);

		      int total = price * count;
		      System.out.println("total" + total);

		      Map<String, Object> map = new HashMap<String, Object>();
		      map.put("coffee", coffee);
		      map.put("count", count);
		      map.put("total", total);
		      System.out.println("coffee" + coffee);
		      System.out.println("count" + count);
		      System.out.println("total" + total);

		      return map;
		  }
		
}
