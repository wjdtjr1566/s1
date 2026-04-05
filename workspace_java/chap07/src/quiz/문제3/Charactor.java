package quiz.문제3;

public class Charactor {
	String name;
	int hp; // 체력
	int ap; // 공격력
	int dp; // 방어력 
	int weapon;
	int armor;
	
	Charactor (String name, int hp, int ap, int dp, int weapon,int armor) {
		this.name = name;
		this.hp = hp;
		this.ap = ap;
		this.dp = dp;
		this.weapon = weapon;
		this.armor  = armor;
	}
	
	
	int attack() {
		return ap + weapon; 
	}
	int defense() {
		return dp + armor ; 
	}
	
}
