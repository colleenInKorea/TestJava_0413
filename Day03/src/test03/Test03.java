package test03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ�");
		int number = scan.nextInt();
		if (number > 0) {
			System.out.println("����Դϴ�.");
		}else if (number == 0) {
			System.out.println( number + "�� 0�� �����ϴ�.");
		}else if (number < 0) {
			System.out.println("�����Դϴ�.");
		}
		
		System.out.println("������ �Է��Ͻÿ�");
		int grade = scan.nextInt();
		
		if (grade >= 90) {
			System.out.println("A");
		}else if (grade >= 80) {
			System.out.println("B");
		}else if (grade >= 70) {
			System.out.println("C");
		}else if (grade >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}

}
