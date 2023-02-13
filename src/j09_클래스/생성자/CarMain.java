package j09_클래스.생성자;

public class CarMain {

	public static void main(String[] args) {

		Car c1 = new Car("Hyundai", "Sonata", "White");
		Car c2 = new Car("Kia", "k5", "Black");
		Car c3 = new Car("Hyundai", "Avante", "Grey");

		c1.showInfo();
		c2.showInfo();
		c3.showInfo();

	}

}
