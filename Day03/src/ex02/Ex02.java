package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������� �����Ը� �Է��Ͻÿ�");
		int weight = scan.nextInt();
		int toWalk = scan.nextInt();
		
		//�������� ���� �̻��̰� �����԰� 70�����̸� 
		if (toWalk >= 10000 && weight <= 70) {
			System.out.println("ġŲ ����.&&");
		}
		
		//�������� ���� �̻��̰ų�  �����԰� 70�����̸�
		if (toWalk >= 10000 || weight <= 70) {
			System.out.println("ġŲ���� ||");
		}
		
		int number = scan.nextInt();
		if(number >= 10 && number <= 40) {
			System.out.println("���Դϴ�.");
		}
		
		if(number < 10 || number > 40) {
			System.out.println("���Դϴ�.");
		}
	
	}

}
