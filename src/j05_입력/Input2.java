package j05_입력;

import java.util.Scanner;

public class Input2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		int birth = 0;
		String add = null;
		String phone = null;
		
//		문제
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("생일 : ");
		birth = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("주소 : ");
		add = sc.nextLine();
		
		System.out.print("연락처 : ");
		phone = sc.next();
		
		System.out.println("사용자의 이름은 " + name + "이고 생일은 " + birth + "입니다.");
		System.out.println("주소는 " + add + "에 거주중입니다.");
		System.out.println("연락처는 " + phone + "입니다.");
	}
}
