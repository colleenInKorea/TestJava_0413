package test03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
//		���� ������ break�� �̿��ؼ� Hello World�� 8�� ��� �ϼ���.
		int i = 0;
		while(true) {
			if(i == 8) {
				break;
			}
			System.out.println("Hello World!");
			i++;
		}
		
//		continue �� �̿��ؼ� 1~10 ���� �� �߿� ¦���� ��� �ϼ���.
		for( i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println();
		
//		���� �Է� �ް� continue �� �̿��ؼ� 1~ 100���� ������ ���߿� �Է� ���� ���� ����� ��� �ϼ���
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է��Ͻÿ�: ");
		int number = scan.nextInt();
		for( i = 1; i <= 100; i++) {
			
			if (i % number != 0) {
				continue;
			}
			
			System.out.print(i + " ");
		}
		System.out.println();
		
//		���� ������ ���ؼ� �ݺ������� ���� �Է��� �ް� 0�� �Է� �Ǿ����� �ݺ����� ���� ������ �ϼ���.
//		�Է��� ������ "��"�� ����ϼ���
		
		while(true) {
			System.out.print("���� �Է��Ͻÿ�: ");
			int number1 = scan.nextInt();
			if (number1 == 0) {
				break;
			}
		}
		System.out.println("The End");
	
		
		

	}

}
