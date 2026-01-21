package quiz.qulz0.문제;

public class Emp {
   int num;
   String name;
   String position;
   int sal;
   int mgr;
   
   Emp(int num,String name,String position,int sal, int mgr) {
	   this.num =num;
	   this.name =name;
	   this.position =position;
	   this.sal =sal;
	   this.mgr =mgr;
	   
   }
//   int numTitle(int num) {
//	   return this.num;
//   }
//   String nameTitle(String name) {
//	   return this.name;
//   }
//   String positionTitle(String position) {
//	   return this.position;
//   }
//   int salTitle(int sal) {
//	   return this.sal;
//   }
//   int mgrTitle(int mgr) {
//	   return this.mgr;
//   }
   
   // 모든 정보 출력 
   void info() {
	System.out.print("사번 : "+num+" ");
	System.out.print("이름 : "+name+" ");
	System.out.print("직급 : "+position+" ");
	System.out.print("연봉 : "+sal+" ");
	System.out.println("mgr : "+mgr);
	
	
	
   }
}  
