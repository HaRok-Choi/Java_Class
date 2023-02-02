package j04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {

		String names = "최하록님, 도경록님, 이다운님, 신수영님";
		StringBuilder sb = new StringBuilder();

		String name = names.substring(0, 3);
		String name1 = names.substring(6, 9);
		String name2 = names.substring(12, 15);
		String name3 = names.substring(18, 21);

		sb.append(name + '/' + name1 + '/' + name2 + '/' + name3);
		System.out.println(sb.toString());
		
		String city = "진구, 서구, 북구";
		int index = city.indexOf("구");
		System.out.println(index);
		int index2 = city.indexOf("구", index + 1);
		System.out.println(index2);
		
//		실습
		StringBuilder sb2 = new StringBuilder();
		int index3 = names.indexOf("님");
		sb2.append(names.substring(index3 - 3, index3));
		
		index3 = names.indexOf("님", index3 + 1);
		sb2.append("/");
		sb2.append(names.substring(index3 - 3, index3));
		
		index3 = names.indexOf("님", index3 + 1);
		sb2.append("/");
		sb2.append(names.substring(index3 - 3, index3));
		
		index3 = names.indexOf("님", index3 + 1);
		sb2.append("/");
		sb2.append(names.substring(index3 - 3, index3));
		System.out.println(sb2);
		
//		문제
		StringBuilder sb4 = new StringBuilder();
		sb4.append(names);
		
		int index4 = sb4.indexOf("님");		
		sb4.delete(index4, index4 + 3);
		index4 = sb4.indexOf("님");
		sb4.delete(index4, index4 + 3);
		index4 = sb4.indexOf("님");
		sb4.delete(index4, index4 + 3);
		index4 = sb4.indexOf("님");
		sb4.delete(index4, index4 + 3);
		
		System.out.println("문제 : " + sb4);
	}

}
