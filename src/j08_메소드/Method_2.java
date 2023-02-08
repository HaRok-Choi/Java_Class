package j08_메소드;

public class Method_2 {
	
//	메소드
//	리턴값 없고, 매개변수도 없는 메소드
	public static void test1() {
		System.out.println("test1 메소드 호출");
	}
	/*
	 * void는 리턴값이 없다는 뜻
	*/
	
//	리턴값 없고 매개변수 1개 있는 메소드
	public static void test2(int num) {
		System.out.println("num : " + num);
		System.out.println("test2 메소드 호출");
	}
	
//	리턴값 없고 매개변수 2개 있는 메소드
	public static void test3(int num, int num2) {
		System.out.println("num : " + num);
		System.out.println("num2s : " + num2);
		System.out.println("test3 메소드 호출");
	}
	
//	리턴값 없고 매개변수 없는 메소드
	public static int test4() {
		System.out.println("test4 호출");
		return 100; 
	}
	
	public static String test5(String name, int index) {
		System.out.println(name);
		System.out.println(index);
		return name + index;
	}
	
	public static void main(String[] args) {
		test1();
		test2(10);
		test3(10,02);
//		test4();
		int a = test4();
		System.out.println();
		System.out.println(a);
		System.out.println();
		System.out.println(test4());
		System.out.println();
		
		String result = test5("최하록", 1);
		System.out.println();
		System.out.println(result);
		System.out.println();
		System.out.println(test5("최하록", 1));
		
 
	}
	
}
