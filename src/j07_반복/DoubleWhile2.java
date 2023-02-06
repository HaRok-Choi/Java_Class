package j07_반복;

public class DoubleWhile2 {

	public static void main(String[] args) {
//		중첩반복
		/*
		 * 1교시 1분 2분 ... 50분 10분 쉬는시간 1분 2분 ... 10분 쉬는시간 2교시, 3교시, 4교시
		 */
		int i = 0;
		while (i < 4) {
			i++;
			System.out.println(i + "교시");
			int j = 0;
			while (j < 60) {
				j++;
				if (j < 50) {
					System.out.println("\t" + j + "분");
				} else if (j == 50) {
					System.out.println("\t10분 쉬는시간");
				} else {
					System.out.println("\t" + (j - 50) + "분");
				}
			}
		}
	}
}
