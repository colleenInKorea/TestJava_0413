package ex01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
	
		// ���� ���ϱ� 
		String text = " Hello";
		
		int length = text.length();
		System.out.println(length);
		System.out.println(text.length());
		
		//����Ȯ���ϱ� 
		//char 'a' 'c' 'b'
		//String "abc"
		char character = text.charAt(3);
		
		System.out.println(character);
		
		//charAt �� �̿��ؼ� �ݺ������� ���ڿ� ���
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i) + " ");
		}
		
		//���ڿ� �ڸ���
		String phoneNumber = "01012345678";
		
		//12345678
		String partString = phoneNumber.substring(3);
		System.out.println(partString);
		
		//010
		partString = phoneNumber.substring(0, 3);
		System.out.println(partString);
		
		//1234
		partString = phoneNumber.substring(3, 7);
		System.out.println(partString);
		
		//5678
		partString = phoneNumber.substring(7);
		System.out.println(partString);
		
		//Ư�����ڷ� ����
		 text = "���α�";
		 if(text.startsWith("��")) {
			 System.out.println("�达 �Դϴ�.");
		 }
		 
		 if(text.endsWith("�α�")) {
			 System.out.println("�̸��� �α��Դϴ�.");
		 }
		 
		 //���ڿ� �Ϻ� �ٲٱ�
		 String replaceText = text.replace("��", "��");
		 System.out.println(replaceText);
		
		 //���ڿ� �ɰ���
		 text = "���α�, ���缮, ����, Ȳ����, ����ȣ";
		 String[] names = text.split(",");
		 
		 System.out.println(Arrays.toString(names));
		 
	}
}
