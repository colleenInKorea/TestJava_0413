package ex02;

public class Ex02 {
	public static void main(String[] args) {
		
		PersonInfor kim = new PersonInfor("�����", 22);
		PersonInfor jang = new PersonInfor("���α�", 23);
		System.out.println(kim);
		System.out.println(jang);
		
		if (kim.equals(jang)) {
			System.out.println("�λ���� ���� ���");
		}else {
			System.out.println("�λ���� �ٸ� ���");
		}
	}
}
