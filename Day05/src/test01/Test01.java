package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
//		35 ~ 40 ���� ��� �ϼ���
		int number = 35;
		for(int i = 0; i < 6; i++) {
			System.out.print((number + i) + " ");
		}
		System.out.println();
		
//		5 ~ -5 ���� ����ϼ���
		number = 5;
		for(int i = 0; i < 11; i++) {
			System.out.print((number - i) + " ");
		}
		System.out.println();
		
//		1 ~ 50 ���̿� 3�� ����� ����ϼ���.
//		for(int i = 0; i < 51; i++) {
//			if (i % 3 == 0 && i > 1) {
//				System.out.print(i + " ");
//			}
//		}
		for (int i = 3; i < 51; i += 3) {
			System.out.print(i + " ");;
		}
		System.out.println();

//		1 ~ 100 ���̿� 7�� ��� ������ ���ϼ���.
		int count1 = 0;
//		for(int i = 1; i <= 100; i++) {
//			if (i % 7 == 0) {
//				count1++;
//			}
//		}
//		System.out.println("7�� ����� ������ "+count1);
		
		for (int i = 7; i < 100; i += 7) {
			count1++;
		}
		System.out.println("7�� ����� ������ " + count1);
		System.out.println();
		
//		���� �Է� �޾Ƽ� �ش��ϴ� �ܼ��� �������� ��� �ϼ���.
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է��Ͻÿ�");
		int count = scan.nextInt();
		for(int i = 1; i <= 9; i++) {
			System.out.println(count + "X" + i + "= " +(count * i));
		}
		
//		for�� �̿��ؼ� 5���� ���� �Է� �ް� ���� ū���� ����ϼ���
		int number1 = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("���� �Է� �ϼ���: ");
			int number2 = scan.nextInt();
		    if (number1 <= number2) {
		    	number1 = number2;
		    }
		}
		System.out.println(number1);
		
		
	}

}
