package j09_클래스.생성자;

public class ConstructorMain2 {

	public static void main(String[] args) {
		
		ConstructorEx2 ce22 = new ConstructorEx2("nike");
		ConstructorEx2 ce23 = new ConstructorEx2(3);
		ConstructorEx2 ce24 = new ConstructorEx2("nike", 3);
		
		/*
		 * 기본 생성자는 생략이 가능
		 * 생성자 오버로딩 이후 기본생성자를 사용하기 위해서는
		 * 무조건 명시를 해줘야 함.
		*/
		
		
	}

}
