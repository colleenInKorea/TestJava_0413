package test03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���̸� �Է��Ͻÿ�");
		int age =scan.nextInt();
		
		System.out.println("\n�̸��� �̵��� ���̴� "+age+"�Դϴ�.");
		
		System.out.println("\n�� ���� �Է��Ͻÿ�");
		int number1 =scan.nextInt();
		int number2 = scan.nextInt();
		
		System.out.println(number1+"+"+number2+"="+(number1+number2));
		System.out.println(number1+"-"+number2+"="+(number1-number2));
		
		System.out.println("\n �ܼ��� �Է��ϼ���.");
		int simple =scan.nextInt();
		System.out.println(simple+"x1="+(simple*1));
		System.out.println(simple+"x2="+(simple*2));
		System.out.println(simple+"x3="+(simple*3));
		System.out.println(simple+"x4="+(simple*4));
		System.out.println(simple+"x5="+(simple*5));
		
		System.out.print("\n ���� ���� ���� �Է� �Ͻÿ� :");
		int diameter=scan.nextInt();
		int radius = diameter/2;
		System.out.println("\n ���� ���̴� "+(radius*radius*3.14)+"�Դϴ�.");
	
		
		
		
		
	}

}
