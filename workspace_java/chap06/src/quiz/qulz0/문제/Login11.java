package quiz.qulz0.문제;

public class Login11 {
	String id;
	String password;
	
	Login11[] members;
	 
	Login11(String id,String password) { //id 와 password를가진 생성자 만듦
		this.id=id;
		this.password=password;
	}
	Login11(Login11[] members) {
		this.members=members;
	}
    boolean login(String id, String password) {
        for (int i = 0; i < members.length; i++) {
            if (members[i].id.equals(id) &&  
                members[i].password.equals(password)) {
                return true;
            }
        }
        return false;
    }
}
	
	
	


