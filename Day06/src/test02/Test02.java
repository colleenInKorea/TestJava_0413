package test02;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
//		�� ���� �Է� �޾Ƽ� �μ��� ���� ��ŭ�� �������� ����ϼ���.
		System.out.println("�ܼ��� ������ �Է��Ͻÿ� : ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		for(int i = number1; i <= number2; i++ ) {
			for (int j = 1; j <= 9; j++) {
				System.out.println( i + "X" + j +" = " + (i * j));
			}
		}
		System.out.println();
		
//		���� �Է� �ް� �� �� ����ŭ �Ʒ� ����ó�� *�� ����ϼ���
	   System.out.print("����� �� ���� �Է��Ͻÿ�: ");
	   int number3 = scan.nextInt();
	   
	   for(int i = 0; i < number3; i++) {
		   for (int j = 0; j < number3-i; j++) {
			   System.out.print(" ");
		   }
		   for(int j = 0; j < (2*i)+1; j++) {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   
//	   �𷡽ð��� ũ�⸦ ��Ÿ���� Ȧ���� ����(3 <= n < 99)�� �Է¹ް� �𷡽ð� ����� ����ϼ���.
//	   *+*+*
//	   -*+*-
//	   --*--
//	   -*+*-
//	   *+*+*
	  
	   System.out.println(" �𷡽ð��� ũ�⸦ �Է��Ͻÿ� (3 <= n < 99) : ");
	   int level = scan.nextInt();
	   int half = level / 2;
	   
	   
	   for(int i = 0; i < half + 1; i++ ) {
		   //�տ� �ִ� -�� ���� ��� 
		   for(int j = 0; j < i; j++) {
			   System.out.print("-");
		   }
		   //�߰��� *, +�� �����Ƽ� ��� ��� (¦���� Ȧ�� ����)
		   for(int j = 0; j < (half - i)*2 + 1; j++) {
			   if(j % 2 == 0) {
				   System.out.print("*");
			   }else {
				   System.out.print("+");
			   } 
		   }
		   //���� -���·� ����ִ� ��
		   for(int j = 0; j < i; j++) {
			   System.out.print("-");
		   }
		   
		   System.out.println();
	   }
	   
	   //�𷡽ð��� �ؿ� �κ� �۾� 
	   for(int i = 0; i < half; i++) {
		   //���ﰢ������ -���
		   for(int j = 0; j < half - i - 1; j++) {
			   System.out.print("-");
		   }
		   // �Ƕ�̵����·� *, + �۾� �ϱ� 
		   for(int j = 0; j < (i + 1 ) * 2 + 1; j++) {
			   if(j % 2 == 0) {
				   System.out.print("*");
			   }else {
				   System.out.print("+");
			   }
		   }
		   // ���� �κ� - ���
		   for(int j = 0; j < half - i - 1; j++) {
			   System.out.print("-");
		   }
		   System.out.println();
	   }
		
//		�ﰢ���� ũ�⸦ ��Ÿ���� ���� ���� 3 <= n <= 99�� �Է¹ް� ���� �ﰢ���� ����ϼ���.
//				�Է� ����
//
//				���� �ﰢ���� ũ�⸦ �Է��ϼ���: 3
//				��� ����
//
//				1
//				2 4
//				3 5 6
		
		System.out.println(" ���� �ﰢ���� ũ�⸦ �Է��Ͻÿ�: ");
		int size =scan.nextInt();
		int number = 0;
		// ���η� ���� �����ϱ� 
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < i + 1; j++) {
				number++;
				System.out.print(number +" ");
				
			}
			System.out.println();
		}
		System.out.println();
	   //���� ����ó�� �����ϰ� ���� ��, 
		for(int i = 0; i < size; i++) {
			 number = i+1;
			for(int j = 0; j < i + 1; j++) {
				System.out.print(number +" ");
				number += (size - 1) - j;
			}
			System.out.println();
		}
	}
}
