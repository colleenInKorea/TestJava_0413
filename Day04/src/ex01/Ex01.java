package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//1�� �̸� �Ұ�� 2���̸� ���� 3���̸� ġŲ ���ܴ̿� ���
		int ranking = scan.nextInt();
		
		switch (ranking) {
		case 1:
			System.out.println("�Ұ��");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("ġŲ");
			break;

		default:
			System.out.println("���");
			break;//default �ؿ� �ִ� break�� ���� �Ƚᵵ �������� �ֱ� ������ ���ص� �ȴ�. 
			//case�� �� 1���� ���� ��� ���� ���� ���� �ʴ´� . �������� ��츦 ���� �����ִ�.
		}
	}

}
