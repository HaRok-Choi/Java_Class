package j04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {
		
		String names = "최하록님, 도경록님, 이다운님, 신수영님";
		StringBuilder sb = new StringBuilder();
		
		String name = names.substring(0, 3);
		String name1 = names.substring(6, 9);
		String name2 = names.substring(12, 15);
		String name3 = names.substring(18, 21);
		
		sb.append(name + '/');
		sb.append(name1 + '/');
		sb.append(name2 + '/');
		sb.append(name3);
		
		System.out.println(sb.toString());
		
		
	}

}
