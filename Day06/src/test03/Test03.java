package test03;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		�ڸ��� ���
//		���� �Է� �ް� �ش� ���� �� �ڸ� ������ ����ϼ���.
//		�Է� ����
//
//		���� �Է� �ϼ���  : 432153
//		
		System.out.print(" ���� �Է��Ͻÿ� : ");
		int number = scan.nextInt();
		int count = 0;
		
		while (number != 0) {
			number /= 10;
			count++;
		}
		System.out.println(count);
		
//		 �޷� ��� �ϱ�
//		 2020�� 7�� 1���� �������̴�.
//		 �Ʒ��� ���� 2020�� 7�� �޷��� ����ϼ���.
//		 ��� ����
//		  2020 / 7 
//
//		   S   M   T   W   T   F   S 
//		               1   2   3   4 
//		   5   6   7   8   9  10  11 
//		  12  13  14  15  16  17  18 
//		  19  20  21  22  23  24  25 
//		  26  27  28  29  30  31
		
		System.out.println("2020 / 07 ");
		System.out.println();
		System.out.println("S  M  T  W  T  F  S");
		
		int day = -2;
		 for(int i = 0; i <5; i++) {
			 
			 for(int j = 0; j < 7; j++) {
				 if(day > 0) {
					 if(day < 10) {
						 System.out.print(" ");
					 }
					 System.out.print(day+ " ");
				 }else {
					 System.out.print("   ");
				 }
				 
				 day++;
				 if(day > 31) {
					 break;
				 }
			 }
			 System.out.println();
		 }
		

		
		
	}
}
