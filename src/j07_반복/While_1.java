package j07_반복;

public class While_1 {
	public static void main(String[] args) {
		
		int i = 0;	// 초기문
		
		System.out.println("프로그램 스따뚜");
		while (i < 10) {	// 조건문, (웬만하면 반복횟수를 적어주기)
			System.out.println((i+1) + "바퀴 돌았습니다.");	// 실행문
			i++;	// 후처리문
		}
		System.out.println("프로그램 종료");
		
		/*
		 * while문 기본구조
		 * while(조건문) {
		 * 			<수행할 문장1>;
		 * 			<수행할 문장2>;
		 * 			...
		 * }
		*/
	}
}
