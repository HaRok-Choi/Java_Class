package j02_변수와상수;

public class Cast {
	public static void main(String[] args) {

//		업캐스팅 : 묵시적 형변환
//		문자 < 정수 < 실수
		char a = 'A';
		int b = a;
		double c = b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
//		다운캐스팅 : 명시적 형변환
		int d = (int)c;
		System.out.println(d);
		
//		문제: c를 char 자료형으로 다운캐스팅
		char e = (char)d;
		System.out.println(e);
		
		char k = (char)c;
		System.out.println(k);
		
	}
}
