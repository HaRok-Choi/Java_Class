package j06_조건문;

public class If_3 {

	public static void main(String[] args) {
		
		int x = 9, y = -13;
		String result = null;
		
		if (x > 0 && y >0) {
			result = "제 1사분면";
		} else if(x < 0 && y > 0) {
			result = "제 2사분면";
		} else if(x < 0 && y < 0) {
			result = "제 3사분면";
		} else if(x > 0 && y < 0) {
			result = "제 4사분면";
		}
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("결과 : " + result);
	
	}
}
