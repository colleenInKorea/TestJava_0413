package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է��Ͻÿ�");
		int number1 = scan.nextInt();
		
		if(number1 > 10) {
			System.out.println(number1 +"�� 10���� Ů�ϴ�.");
		}else if(number1 == 10) {
			System.out.println(number1+"�� 10�� �����ϴ�.");
		}else if(number1 < 10) {
			System.out.println(number1+"�� 10���� �۽��ϴ�.");
		}
		
		System.out.println("�μ��� �Է��Ͻÿ�");
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		if(number2 == number3) {
			System.out.println("=");
		}else if(number2>number3) {
			System.out.println(">");
		}else if (number2 < number3) {
			System.out.println("<");
		}
		
		System.out.println("������ �Է��Ͻÿ�.");
		int grade = scan.nextInt();
		if (grade >= 70) {
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
		
		System.out.println("���� �Է��Ͻÿ�");
		int number4 = scan.nextInt();
		int etwas= number4%2;
		if(etwas == 0) {
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ�� �Դϴ�.");
		}
		
	}

}
