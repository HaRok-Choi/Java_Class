package j07_반복.랜덤;

import java.util.Random;

public class Random2 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int rNum = ran.nextInt(10);
		System.out.println(rNum);
		
		int i = 0;
		while (i < 10) {
			i++;
			int rNum2 = ran.nextInt(10);
			System.out.println(rNum2);
		}
	}

}
