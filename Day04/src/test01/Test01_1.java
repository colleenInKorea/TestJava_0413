package test01;

import java.util.Scanner;

public class Test01_1 {

	public static void main(String[] args) {
		//���չ��� 1��
		Scanner scan = new Scanner(System.in);
		
		
//				System.out.println("���� �Է��Ͻÿ�");
//				int ziffer = scan.nextInt();
				int sum = 0;
				
				int i = 1;
//				while(i <= ziffer) {
//					sum += i;
//					i++;
//				}
//				System.out.println("����"+ sum);
//				
//				i = 0;
//				int number = 0;
//				while(i < 5) {
//					System.out.println((i+1)+"��° ���� �Է��Ͻÿ�");
//					int zahl = scan.nextInt();
//					number += zahl;
//					i++;
//				}
//				System.out.println("������ " + number + "����� "+(number/5.0));
				
				System.out.println("���� �Է��Ͻÿ�.");
				int number1 =scan.nextInt();
				
				if(number1 <= 10) {
					i = 1;
					sum = 1;
					while(i <= number1) {
						sum *= i;
						i++;
					}
				}else {
					System.out.println("�߸��Ȱ��� �Է��Ͽ����ϴ�.");
				}
				
				System.out.println(number1+"! = "+ sum);
				
//				i = 0;
//				int number1 = 0;
//				while(i < 5) {
//					System.out.println((i+1)+"��° ���� �Է��Ͻÿ�");
//					int zahl1 = scan.nextInt();
//					zahl1 = number1;
//					
//					i++;
//				}
//				������ �ؾ� �Ұ� ���� ���� 
				

	}

}
