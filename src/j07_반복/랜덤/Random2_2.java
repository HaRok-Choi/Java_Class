package j07_반복.랜덤;

import java.util.Random;

public class Random2_2 {

	public static void main(String[] args) {
//		랜덤으로 10개의 값을 뽑고 가장 큰 값을 출력하는 방법
		Random ran = new Random();
//		System.out.println(num);
		
		int i = 0;
		int MaxNum = 0;
		while (i < 10) {
			i++;
			int num = ran.nextInt(10);
			System.out.println(num);
			if (MaxNum < num) {
				MaxNum = num;
			} 
		}
		System.out.println("최댓값 : " + MaxNum);
		
//		값 3개 비교
		
	}

}
