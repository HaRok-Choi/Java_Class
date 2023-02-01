package j04_문자열;

public class String1 {

	public static void main(String[] args) {
		
		System.out.println("ㅎㅇ");
		System.out.println("\"ㅎㅇ\"ㅎㅇㅎ\nㅇ");
		System.out.println("오늘\t날씨\t따듯");
		
//		\가 이스케이프 문자이다.
		
		String address = "부산시 남구 대연동";
		
		int index1 = address.indexOf("동");
		System.out.println(index1);
		
		String address2 = "부산시 동래구 사직동";
		
		int index2 = address2.indexOf("동");	// 인덱스 번호부터.
		System.out.println(index2);
		
		int index3 = address2.lastIndexOf("동");	// 마지막부터 인덱스 번호부터.
		System.out.println(index3);
		
		String subAddress = address2.substring(0, 3);	// 문자 자르는 것.
		System.out.println(subAddress);
		
		String subAddress2 = address2.substring(0, 4);
		System.out.println(subAddress2);
		
//		문제
		String add = "부산광역시 서구 부민동";
		int index4 = add.indexOf("부");
		int index5 = add.lastIndexOf(" ");
		String subAdd = add.substring(index4, index5);
		System.out.println(subAdd);
		
		String replaceAddress = add.replace(' ', '-');	// replace : 문자를 교체 해줌.
		System.out.println(replaceAddress);
		
		String replaceAddressAll = add.replaceAll(" 서", " 북");	// replaceAll : 문자열을 바꿀 수 있음.
		System.out.println(replaceAddressAll);
		
//		문제
		String phoneNumbers = "010/4214/1172,010/1234/5678";
//		방법1(가라)
		String rePhone = phoneNumbers.replaceAll("010/4214/1172,010/1234/5678", "011-4214-1172/011-1234-5678");
		System.out.println(rePhone);
//		방법2
		String rePhone1 = phoneNumbers.replaceAll("010", "011");
		rePhone1 = rePhone1.replace('/', '-');
		rePhone1 = rePhone1.replace(',', '/');
		System.out.println(rePhone1);
//		방법3
		String rePhone2 = phoneNumbers.replaceAll("010", "011").replace('/', '-').replace(',', '/');
		System.out.println(rePhone2);
		
		
		
	}

}
