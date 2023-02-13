package j09_클래스.접근지정자.user;

public class UserMain {
	public static void main(String[] args) {
		
		/*
		 * userId -> harok
		 * userName -> 최하록
		 * 
		 * 1. 전체 생성자 써서 값 주입
		 * 2. 각각 생성자 써서 값 주입
		*/
		
		User user = new User("harok", "최하록");
		User user2 = new User();
		
		user.Show();		
		
		user2.setUserId("harok");
		user2.setUserName("최하록");
		System.out.println(user2.getUserId());
		System.out.println(user2.getUserName());
		
	}
}
