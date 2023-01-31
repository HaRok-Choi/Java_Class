package j02_변수와상수;

public class Constant {
	public static void main(String[] args) {
		
		final int MAX_NUM = 100;
		final int MIN_NUM = 0;
		
		int num = 10;
		System.out.println(num);
		num = 20;
		
//		maxNum = 200;
		
		int num2;
		num2 = 200;
		
		System.out.println("최댓값 : " + MAX_NUM);
		System.out.println("최솟값 : " + MAX_NUM);
		System.out.println("현재값 : " + num);
		
	}
}
