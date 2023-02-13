package j09_클래스.접근지정자.student;

public class Student {

	private String name;
	private int stuYear;
	private int age;
	private String add;
	private String phone;

//	private 변수에 값을 주입하는 방법1
//	[생성자를 통한 값 주입]
	public Student(String name, int stuYear, int age, String add, String phone) {
		this.name = name;
		this.stuYear = stuYear;
		this.age = age;
		this.add = add;
		this.phone = phone;
	}
	
//	private 변수에 값을 주입하는 방법2
//	[Setter를 통한 값 주입]
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStuYear() {
		return stuYear;
	}

	public void setStuYear(int stuYear) {
		this.stuYear = stuYear;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Student() {
		
	}
	
	
	
}
