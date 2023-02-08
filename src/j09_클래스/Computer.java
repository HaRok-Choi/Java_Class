package j09_클래스;

public class Computer {

	int year;
	String company;
	String cpu;
	int ram;
	String graphic;
	
	void showInfo() {
		System.out.println("제조년 : " + year + "년");
		System.out.println("제조사 : " + company + "년");
		System.out.println("CPU : " + cpu + "년");
		System.out.println("RAM : " + ram + "년");
		System.out.println("GraphicCard : " + graphic + "년");
		System.out.println();
	}
}
