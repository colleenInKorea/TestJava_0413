package test02;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
//		���ڿ� ������ ���� ���� �Ʒ� ������ �ܾ �ϳ��� �����ϼ���.
//		�� ������ �̿��ؼ� �Ʒ� ���� ó�� ����ϼ���
		String text = " Oh ";
		String text1 = " My ";
		String text2 = " God ";
		
		System.out.println(text + text1 + text2);
		
//		id�� �Է� �ް�, �Ʒ��� ���� ȯ�� �޽����� ����ϼ���.
//		Welcome! id
		
		Scanner scan = new Scanner(System.in);
		 String id = scan.next();
		 System.out.println("Welcome " + id);
		
		 System.out.println();
		 
//		 �Ʒ��� ���� ������ �Է� �ϰ�, �� ������ �ܾ �ϳ��� ���ڿ� �迭�� �����ϼ���.
//		 ����� �ܾ ���ٿ� �ϳ��� ����ϼ���.
//		 String[] texts = {"Why", "So", "Serious"};
//		 for (int i = 0; i < texts.length; i++) {
//			System.out.println(texts[i]);
//		}
		 
		 String[] texts1 = new String[3];
		 
		 for (int i = 0; i < texts1.length; i++) {
			 String texts1[i] = scan.next();
			 System.out.print(texts1[i] + " ");
		 }
		 
		
		
	}

}
