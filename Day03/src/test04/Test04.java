package test04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		 System.out.println("1~7 ������ ��¥�� �Է��Ͻÿ�");
		int days = scan.nextInt();
	
				
		switch (days) {
		case 1 :
			System.out.println(days+"���� �������Դϴ�.");
			break;
		case 2 :
			System.out.println(days+"���� ������Դϴ�.");
			break;
		case 3 :
			System.out.println(days+"���� �ݿ����Դϴ�.");
			break;
		case 4 :
			System.out.println(days+"���� ������Դϴ�.");
			break;
		case 5 :
			System.out.println(days+"���� �Ͽ����Դϴ�.");
			break;
		case 6 :
			System.out.println(days+"���� �������Դϴ�.");
			break;
			
		case 7 :
			System.out.println(days+"���� ȭ�����Դϴ�.");
			break;
			
		default :
			System.out.println("�߸��Էµ� ���Դϴ�.");
			break;
		
		}
		
		
		
	}
}
