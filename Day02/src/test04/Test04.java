package test04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�μ��� �Է��Ͻÿ�.");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		System.out.println("�μ��� ����"+(number1*number2)+"\n �μ��� ���� "+(number1+number2)+"\n �μ��� ����"+(number1-number2)+"\n �μ��� �������� ����"+(number1/number2)+"�Դϴ�.");
		
		System.out.println("\n �μ��� �Է��Ͻÿ�");
		int number3 = scan.nextInt();
		int number4 = scan.nextInt();
		System.out.println("�μ��� ���� ����"+(number3/number4)+"�̰� �������� "+(number3%number4)+"�Դϴ�.");
		
		System.out.println("\n���簢���� �Ѻ��� ���̸� �Է��Ͻÿ�");
		int width = scan. nextInt();
		System.out.println("���簢���� ���̴�"+(width*width)+"�Դϴ�.");
		
		System.out.println("\n �ﰢ���� �غ��� ���̸� �Է��Ͻÿ�");
		int width1 =scan.nextInt();
		int height = scan.nextInt();
		System.out.println("�ﰢ���� ���̴� "+(width1*height/2.0)+"�Դϴ�.");
		
		System.out.print("\n X:");
		int sample1 =scan.nextInt();
		System.out.print("\n Y:");
		int sample2 =scan.nextInt();
		
		//�ٲ�ġ�� �ϴ� ��쿡 swap�� ����Ѵ�. ������ �Ѱ��� ���� �ӽ� ���� �Ŀ� ���� �ٲ� ġ�� �ϸ� �ȴ�. 
		int tmp = sample1 ;
		sample1 =sample2;
		sample2 = tmp;
		
		System.out.println("X:"+sample1+" Y:"+sample2);
		
		System.out.println("�ʸ� �Է��ϼ���");
		int second = scan.nextInt();
		System.out.println(second+"��"+(second/60)+"���̰�"+(second%60)+"���Դϴ�.");
		
		
	}

}
