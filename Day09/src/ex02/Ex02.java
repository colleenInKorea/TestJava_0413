package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		//���ڿ� ���� �ʱ�ȭ
		String text = "Hello World!";
		System.out.println(text);
		
		// ���ڿ� ����
		int number = 10;
		int number2 = 20;
		
		System.out.println("Hello " + number);
		
		String text2 = "hello" + number;
		text2 = "Hello " + (number + number2);
		
		System.out.println(text2);
		
		//���ڿ� �Է�
		Scanner scan = new Scanner(System.in);
		
//		String word = scan.next();
//		System.out.println(word);
		
		String text3 = scan.nextLine();
		// �Է°� \n ���� �Է� �ȴ�. 
		//\n ���� ������ �ڿ� ���α׷��� ������� �����ٰ� ���� �� �� �ִ�. 
		//�ѹ��� scan. nextLine ();�� ����ؼ� ���ڿ��� ���ް� �ϴ� \n �� ���ִ� ���̴�.
		
		System.out.println(text3);
		
		//���ڿ� �迭 
		String[] texts = {"dog", "cats"};
		for (int i = 0; i < texts.length; i++) {
			System.out.println(texts[i]);
		}
	}
}
