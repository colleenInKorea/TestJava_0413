package test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		���� �Է� �޾Ƽ� 1���� �Է� ���� �������� ���� ����ϼ���.
		int number1 = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= number1; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();
		
//		�ݺ������� 5���� ���� �Է� �޾Ƽ� ���հ� ����� ����ϼ���.
		//���հ��� ���� ����(�ʱ�ȭ)
		sum = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println((i+1) + "��° ���� �Է��Ͻÿ� : ");
			int number2 = scan.nextInt();
			sum += number2; //sum = sum + number2;
		}
		System.out.println("����: " + sum + "���: "+ (sum / 5.0));
		System.out.println();
		
//		���丮���� 1���� �� �������� ��� ���� ���̰� �Ʒ��� ���� ǥ���ȴ�.
//		5! = 1 * 2 * 3 * 4 * 5
//		7! = 1 * 2 * 3 * 4 * 5 * 6 * 7
//
//		���� �Է� �ް� �� ���� ���丮���� ����ϼ���.
//		�Է� �޴� ���� �ִ밪�� 10�̴�.
		
		int fatorial = 1;
		System.out.println("���� �Է��Ͻÿ�");
		int number = scan.nextInt();
		for (int i = 1; i <= number; i++) {
			fatorial = fatorial * i;
		}
		System.out.println(fatorial);
		
//		�ݺ������� 5���� ���� �Է� �޾Ƽ� �ּ� ���� ����ϼ���.
//		�Է°��� �ִ� ���� 1000 �Դϴ�.
		//�ٽ� �����ϱ�(min��...)
		int min = 1000;
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "��° ���� �Է��Ͻÿ� : ");
			int ziffer = scan.nextInt();
			
			if(min >= ziffer) {
				min = ziffer;
			}
		}
		System.out.println(min);
		System.out.println();
		
//		���� �Է� �޾Ƽ� �� ���� ����� ��� ����ϼ���.
		System.out.print("���� �Է��Ͻÿ�: ");
		int number4 = scan.nextInt();
		
		for(int i = 1; i <= number4; i++) {
			if(number4 % i == 0) {
				System.out.print(i+" ");
			}
		}
		
		
	}
}
