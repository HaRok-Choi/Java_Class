package j07_반복;

import java.util.Scanner;

public class While_3 {
	public static void main(String[] args) {
		
		/*
		 * 실습
		 * 반복횟수 : 10
		 * n 변수 저장
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반복 횟수 : ");
		int n = sc.nextInt();
		int i = 0;
		
		while (i < n) {
			i++;
			System.out.println("i = " + i);
		}
		
		/*
		 * 실습2
		*/
		i = 0;	// 초기화후 다시 10번 반복
		
		while (i < n) {
			System.out.println("i = " + (n-i));
			i++;
		}
		
		
		
		
		
		
		
		
	}
}
