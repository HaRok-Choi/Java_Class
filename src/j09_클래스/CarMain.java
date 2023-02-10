package j09_클래스;

public class CarMain {

	public static void main(String[] args) {
		
		/*
		 * 실습
		 * Car라는 클래스 생성
		 * 	company
		 * 	model
		 * 	color
		 * 
		 * 메소드 showInfo()
		 * 	회사명:
		 * 	모델명:
		 * 	색상 : 
		 * 
		 * 3대(car1,car2,car3) 만들기
		 * 
		 * 각각 주입하고 showInfo 찍어서 값 확인
		*/
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.company = "Hyundai";
		c1.model = "Sonata";
		c1.color = "White";
		
		c2.company = "Kia";
		c2.model = "k5";
		c2.color = "Black";
		
		c3.company = "Hyundai";
		c3.model = "Avante";
		c3.color = "Grey";
		
		c1.showInfo();
		System.out.println("===================");
		c2.showInfo();
		System.out.println("===================");
		c3.showInfo();
		
//		System.out.println(new Car());
		
	}

}
