package test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�μ��� �Է��Ͻÿ�");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		if(number1 >= 70 && number2 >= 70) {
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
		
		System.out.println("���� �Է��Ͻÿ�.");
		int number3 = scan.nextInt();
		int etwas = number3%3;
		int ziffer = number3%2;
				
		if(etwas == 0 && ziffer == 0) {
			System.out.println(number3+"�� 2�� 3�� ����� �Դϴ�.");
		}
		
		System.out.println("1�� 10 ������ ���� �Է��Ͻÿ�");
		int number4 = scan.nextInt();
		
		if(number4 > 10 || number4 < 1) {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}else {
			System.out.println(number4 + "�� 1�� 10 ������ ���� �Դϴ�.");
		}
		
	}

}
