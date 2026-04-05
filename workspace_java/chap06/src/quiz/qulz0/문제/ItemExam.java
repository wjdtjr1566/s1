package quiz.qulz0.문제;

public class ItemExam {

	public static void main(String[] args) {
        
	 Item item1	=new Item("과자");
	 item1.name();
	 
	 Item item2	=new Item("가방");
	 item2.name();
	 
	 itemProcess b = new itemProcess();
	
        b.run(item2);
        b.run(item1);
	}

}
