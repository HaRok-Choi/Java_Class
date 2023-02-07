package j07_반복;

public class Continue2 {

	public static void main(String[] args) {

//		String a = " ";
//		System.out.println(a.equals(" "));
//		
//		String b = "";
//		System.out.println(b);
//		String c = "최하록";
//		b = b + c;
//		System.out.println(b);
//		String d = "김종학";
//		b += d;
//		System.out.println(b);

		/*
		 * 실습 tempAdd를 출력하면 아래와 같이 나오도록 하시오.
		 */

		String add = "부산 동래구 사직동 중앙대로";
		String tempAdd = "";

		for (int i = 0; i < add.length(); i++) {
			String subAdd = add.substring(i, i + 1);
			if (subAdd.equals(" ")) {
				continue;
			} else {
				tempAdd += subAdd;
			}
		}
		System.out.println(tempAdd);

	}
}
