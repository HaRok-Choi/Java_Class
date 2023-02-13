package j09_클래스.접근지정자.student;

public class StudentMain {

	public static void main(String[] args) {
		Student std = new Student("최하록", 4, 26, "부산", "010-1234-5678");
		
		Student std2 = new Student();
		std2.setName("최하록");
		std2.setStuYear(4);
		std2.setAge(26);
		std2.setAdd("부산");
		std2.setPhone("010-1234-5678");
		System.out.println(std2.getName());
		System.out.println(std2.getStuYear());
		System.out.println(std2.getAge());
		System.out.println(std2.getAdd());
		System.out.println(std2.getPhone());
	}

}
