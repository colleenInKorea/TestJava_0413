package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Ƚ���� �Է��Ͻÿ�. ");
//Ƚ�� ���� �ޱ�
		int count = scan.nextInt();
//ī��Ʈ �� ���� i �Է�
		int i = 0;
		while(i < count) {
			System.out.println("�� �ƴϾ�");
			i++;
		}
		
//���� �Է� �ް� �� ������ ���� 0 ���� ���پ� ī��Ʈ �ٿ��� ��� �ϰ� �������� "�߻�"�� ����ϼ���.	
		
		System.out.println("ī��Ʈ �ٿ��� �Է��ϼ���");
		int count1 = scan.nextInt();
//		while(count1 >= -1) {
//			if(count1 == -1) {
//				System.out.println("�߻�");
//			}else {
//				System.out.println(count1);
//			}
//			count1--; //i = i - 1
//		}
// ���� �ݺ������� ���� �ʿ䰡 ���� ���. �ȳ־ �ȴ�. i�� ���� �� ��� ������ �� Ȯ�� �ؾ� �Ѵ�.
		
		while(count1 >= 0) {
			System.out.println(count1);
			count1--; //i = i - 1
		}
		System.out.println("�߻�");
		
//���� �Է� �ް� �� ������ ���� 0 ���� ���پ� ī��Ʈ �ٿ��� ��� �ϰ� �������� "�߻�"�� ����ϼ���.	
		
		System.out.println("���� �Է��Ͻÿ�");
		int number = scan.nextInt();
		int sum = 0;
		
		i = 1;
		while(i <= number) {
			if(i % 2 == 0) {
				sum += i;
			}
				i++;
		}
		System.out.println("���Ѱ���"+sum);
		
//while�� �̿��Ͽ� 5�� ���� ���� �Է� �ް� ����ϼ���.
		
		i = 0;
		while(i < 5) {
			System.out.println("�Է�: ");
			int number1 = scan.nextInt();
			System.out.println("��� :"+number1);
			i++;
		}
		
//������ 2���� ����ϼ���
		
		i = 1;
		while(i <= 9) {
			System.out.println("2X"+i+"="+(2*i));
			i++;
		}
		
	
	}

}
