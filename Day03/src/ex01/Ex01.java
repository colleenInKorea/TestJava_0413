package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�����Ը� �Է��Ͻÿ�.");
		int weight = scan.nextInt();
		
		if (weight <= 70) {
			System.out.println("ġŲ�� ����.");
		}
		if (weight >= 90) {
			System.out.println("���̾�Ʈ�� �սô�.");
		}
		if (weight == 68) {
			System.out.println("���� �����Դ� "+weight+"kg �Դϴ�.");
	
		}
		
		boolean isTrue = weight <= 70;
		System.out.println(isTrue);
		
		
		
	}

}
