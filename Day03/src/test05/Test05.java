package test05;

import java.util.Scanner;

public class Test05 {
 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ ���� �Է��ϼ���");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		
		int check1 = number1%2;
		int check2 = number2%2;
		int check3 = number3%2;
		
		if (check1 == 0) {
			System.out.println(number1 + "�� ¦���Դϴ�.");
		}else {
			System.out.println(number1 + "�� Ȧ���Դϴ�.");
		}
		if (check2 == 0) {
			System.out.println(number2 + "�� ¦���Դϴ�.");
		}else {
			System.out.println(number2 + "�� Ȧ���Դϴ�.");
		}
		if (check3 == 0) {
			System.out.println(number3 + "�� ¦���Դϴ�.");
		}else {
			System.out.println(number3 + "�� Ȧ���Դϴ�.");
		}
		
		System.out.println("\n Bmi������ �Է��Ͻÿ�");
		
		int bmi = scan.nextInt();
		
		if(bmi <= 10) {
			System.out.println("�����Դϴ�.");
		}else if(bmi <= 20) {
			System.out.println("��ü���Դϴ�.");
		}else {
			System.out.println("���Դϴ�.");
		}
		
		System.out.println("\n �������� �Է��Ͻÿ�");
		int grade1 = scan.nextInt();
		int grade2 = scan.nextInt();
		
		double average =(grade1+grade2)/2.0;
		
		if (average >= 70) {
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
		
		System.out.println("\n ������ �Է��ϼ���");
		int ziffer1 = scan.nextInt();
		int ziffer2 = scan.nextInt();
		int ziffer3 = scan.nextInt();
//		
//		if(ziffer1 > ziffer2) {
//			if(ziffer1 > ziffer3) {
//				System.out.println(ziffer1);
//			}else if(ziffer3 >ziffer2){
//				System.out.println(ziffer3);
//			}
//		}else {
//			if(ziffer2 > ziffer3) {
//				System.out.println(ziffer2);
//			}else if(ziffer3 > ziffer1) {
//				System.out.println(ziffer3);
//			}
//		}
		
		
		
		//�濬 ���α׷� �����ؼ� �ڵ��� �Ѵٸ� 
		
		int max = ziffer1;
		
		if(ziffer2 > max) {
			max = ziffer2;
			System.out.println("2�� �� Ŀ�� ��� �Ǿ���");
		}
		if(ziffer3 > max) {
			max = ziffer3;
			System.out.println("3�� �� Ŀ�� ��ü �Ǿ���.");
		}
		
		System.out.println(max);
				
		
		System.out.println("���ϴ� ���� �Է��Ͻÿ�");
		int month = scan.nextInt();
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("��");
			break;
		case 6: case 7: case 8:
			System.out.println("����");
			break;
		case 9: case 10: case 11:
			System.out.println("����");
			break;
		case 12: case 1: case 2:
			System.out.println("�ܿ�");
			break;
		
		default :
			System.out.println("�߸��� �Է� ���Դϴ�.");
			break;
	
		}
	}
}
