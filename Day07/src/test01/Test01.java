package test01;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		 2�� ���� �Լ�
//		 ������ �Է� �޾Ƽ� 2������ ����� �����ִ� �Լ��� ����� ȣ���� ���� ����ϼ���.
//		 hint ) �Լ� ���� - public static int getSquared(int x)

		System.out.print(" �������� ���� ���ڸ� �Է��Ͻÿ�: ");
		int number = scan.nextInt();
		
		System.out.println(number + "�� ������  " + getSquared(number) + "�Դϴ�.");
		System.out.println();
//		4���� ���� �޾Ƽ� ����� �����ִ� �Լ��� ����� ȣ���� ���� ����ϼ���.
//		hint ) �Լ� ���� - public static double getAverage(int score1, int score2, int score3, int score4)
		
		System.out.print(" ������ �Է��Ͻÿ� : ");
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		int score3 = scan.nextInt();
		int score4 = scan.nextInt();
		
		System.out.println("�����  " + getAverage(score1, score2, score3, score4));
		System.out.println();
//		��� ������ ��� �Լ�
//		�� ���� �޾Ƽ� ��� �������� ����ϴ� �Լ��� ���弼��. (���ϰ� ����)
//		hint ) �Լ� ���� - public static void printQuotientRemainder(int number1, int number2)

		System.out.print("���ڿ� ���� ���� �Է��ϼ���: ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		printQuotientRemainder(number1, number2);
		
//		Ȧ¦ �Լ�
//		������ �Է� �޾Ƽ� ¦���� 0 Ȧ���� 1�� ���� �ִ� �Լ��� ���弼��.
		System.out.println("���ڸ� �Է��ϼ���: ");
		int ziffer = scan.nextInt();
		System.out.println(checkUp(ziffer));

	} 
	
	public static int getSquared (int number) {
		int result = number * number;
		return result;
	}
	
	public static double getAverage(int score1, int score2, int score3, int score4) {
		double result = (score1 + score2 + score3 + score4)/4.0;
		return result;
	}
	
	public static void printQuotientRemainder(int number1, int number2) {
		int result1 = number1 / number2;
		int result2 = number1 % number2;
		
		System.out.println("��� �������� " + result1 + ", " + result2);
		return ;
	}
	
	public static int checkUp (int ziffer) {
		
		return ziffer%2;
	}
	
}
