package j09_클래스.생성자;

public class ConstructorMain {
	
	public static void main(String[] args) {
		
		ConstructorEx ce1 = new ConstructorEx();
		ConstructorEx ce2 = new ConstructorEx("최하록");
		System.out.println(ce2.name);
		
		ConstructorEx ce3 = new ConstructorEx(1002);
		System.out.println(ce3.birth);
		
		ConstructorEx ce4 = new ConstructorEx("최하록", 1002);
	}
}
