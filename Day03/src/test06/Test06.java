package test06;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� ������ �Է��Ͻÿ�");
		int grade1 = scan.nextInt();
		int grade2 = scan.nextInt();
		
		double average = (grade1 + grade2)/2.0;
		
		if (grade1 <= 50 || grade2 <= 50) {
			System.out.println("����");
		}else if(average >= 60) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		
		System.out.println("\n �⵵�� �Է��Ͻÿ�");
		int year = scan.nextInt();
		int etwas = year%4;
		int etwas1 = year%100;
		int etwas2 = year%400;
		
		//���� Ǭ �ڵ� �ٽ� �����ϱ� 
		
//		if(etwas == 0 ) {
//			if(etwas1 == 0) {
//				System.out.println("������ �ƴմϴ�.");
//			}else if(etwas2 == 0) {
//				System.out.println("�����Դϴ�.");
//			}
//		}else {
//			System.out.println("������ �ƴմϴ�.");
//		}
		
		if(etwas2 == 0 || (etwas == 0 && etwas1 != 0)) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("������ �ƴմϴ�.");
		}
		
		System.out.println("\n ������ �����Դϴ�. 1���� 3 ������ ���� �Է��Ͻÿ�");
		int girl = scan.nextInt();
		System.out.println("ö���� ���� �Դϴ�. 1���� 3 ������ ���� �Է��Ͻÿ�");
		int boy = scan.nextInt();
		
//		if(girl < boy) {
//			if (boy == 3 && girl ==1) {
//				System.out.println("���� �̰��.");
//			}else {
//				 System.out.println("ö���� �̰��.");
//			}
//		}else if(girl == boy) {
//			System.out.println("�����ϴ�.");
//		}else {
//			if (boy == 1 && girl == 3) {
//				System.out.println("ö���� �̰��.");
//			}else {
//				 System.out.println("���� �̰��.");
//			}
//		}
		
		if(girl == boy) {
			System.out.println("�����ϴ�.");
		}else if (boy == 3 && girl ==1 ||
				boy == 2 && girl == 3 ||
				boy == 1 && girl == 2 ) {
			System.out.println("���� �̰���ϴ�.");
		} else {
			System.out.println("ö���� �̰���ϴ�. ");
		}
		
		
		System.out.println("�ð��� ���� �Է��Ͻÿ�");
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		
		if(minute >= 45) {
			System.out.println(hour+"��"+(minute-45)+"��");
		}else {
			System.out.println((hour-1)+"��"+(minute+15)+"��");
		}
		
		System.out.println(" ���� ������, �������� ���¸� �Է��Ͻÿ�. (������ ��� 1, �ƴѰ�� 0)");
		int frist = scan.nextInt();
		int second = scan.nextInt();
		int third = scan.nextInt();
		int forth = scan.nextInt();
		int number = (frist + second + third + forth);
		
		switch(number) {
		case 0:
			System.out.println("��");
			break;
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("��");
			break;
			
		default:
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			break;
			
		}
	}

}
