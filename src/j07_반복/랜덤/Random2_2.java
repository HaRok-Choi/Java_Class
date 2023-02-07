package j07_반복.랜덤;

import java.util.Random;

public class Random2_2 {

	public static void main(String[] args) {
//		랜덤으로 10개의 값을 뽑고 가장 큰 값을 출력하는 방법
		Random ran = new Random();
//		System.out.println(num);

//		int i = 0, MaxNum = 0;
//		while (i < 10) {
//			i++;
//			int num = ran.nextInt(10);
//			System.out.println(num);
//			if (MaxNum < num) {
//				MaxNum = num;
//			}
//		}
//		System.out.println("최댓값 : " + MaxNum);

		
//		값 3개 비교
		int max = 0;
		int i = 0;

		while (i < 20) {
			int a = ran.nextInt(50) + 1;
			int b = ran.nextInt(50) + 1;
			int c = ran.nextInt(50) + 1;
			if (a != b && a != c && b != c) {
//			a가 b보다 클 때
				if (a > b) {
//				max = a;
					if (c > a) {
						max = c;
					} else {
						max = a;
					}
				}
//			b가 a보다 클 때
				else {
//				max = b;
					if (c > b) {
						max = c;
					} else {
						max = b;
					}
				}
				System.out.println("a의 숫자 : " + a);
				System.out.println("b의 숫자 : " + b);
				System.out.println("c의 숫자 : " + c);
				System.out.println("숫자 3개중 가장 큰수 : " + max);
				System.out.println("--------------------------------");
			}
			i++;
		}
	}
}
