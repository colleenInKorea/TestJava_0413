package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//Ƚ�� �ݺ�
		//Hello World!! �ݺ� 5ȸ
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello World!");
		}
		
		//���� ��� (1 - 5)
		for(int i = 1; i <= 5; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//ī��Ʈ �ٿ�
		//5-0
		for(int i = 5; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		//�Է� ���� �� ��ŭ �ݺ�
		int count = scan.nextInt();
		for(int i = 0; i < count; i++) {
			System.out.println("Hello");
		}
		
		int weight = scan.nextInt();
		//70�̻��� ��� �ݺ��
		for( ; weight >= 70; weight -= 2) {
			System.out.println("�����");
		}
		
		//�� ���ϱ�
		int sum = 0;
		//1 - 10
		for(int i = 1; i <= 10; i++) {
			sum += i;//sum = sum+i; ���� �����Ѵ�. 
		}
		System.out.println(sum);
		
		//for(;;){  } => ���� �ݺ� ��Ų��. 
		//while (true) {  }�̶� ����. 
		
	
		
	}

}
