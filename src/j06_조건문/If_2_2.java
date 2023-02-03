package j06_조건문;

public class If_2_2 {

	public static void main(String[] args) {
		/*
		 * 문제
		 * 돈이 3천원 이상있고 카드가 있다면 택시를 타고,
		 * 돈이 3천원 미만이거나 카드만 있다면 버스를 타라
		 * 그렇지않으면 걸어가라
		*/
		int money = 2000;
		boolean isCard = true;
		
		if(money >= 3000 && isCard) {
			System.out.println("택시를 타라.");
		}else if(money < 3000 || isCard){
			System.out.println("버스를 타라.");
		}else {
			System.out.println("걸어가라.");
		}
		
		
	}
}
