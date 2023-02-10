package j09_클래스.생성자;

public class ConstructorEx2 {

	String hat;
	int pants;
	
//	NoArgsConstructor
	public ConstructorEx2() {
		
	}
	
//	RequireArgsConstructor
	public ConstructorEx2(String hat) {
		this.hat = hat;
	}
	
//	RequireArgsConstructor
	public ConstructorEx2(int pants) {
		this.pants = pants;
	}

//	AllArgsConstructor
	public ConstructorEx2(String hat, int pants) {
		super();
		this.hat = hat;
		this.pants = pants;
	}
	
	
	
	
	
	
}
