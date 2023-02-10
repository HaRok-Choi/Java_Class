package j09_클래스;

public class Car {
	
	String model;
	String company;
	String color;
	
	/*
	 * 생성자는 무조건 주소값을 리턴한다.
	 * 생성자는 무조건 클래스와 이름이 동일해야한다.
	 * 기본생성자는 생략이 가능하다.
	*/
	
	public Car() {
		System.out.println("기본 생성자 호출");
	}
	
	void showInfo() {
		System.out.println("회사명 : " + company);
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
	}
}
