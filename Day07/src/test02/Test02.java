package test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		�� ���ϱ�
//		���� �Է� �޾Ƽ� 1���� ���� �� �� ������ ���� ���ϴ� �Լ��� ���弼��.
//		��, ���� 100�� ������ ���� �ߴ��ϰ� �� �� ������ ���� �����ϼ���.
		
		System.out.print("���� �Է��ϼ��� : ");
		int number = scan.nextInt();
		System.out.println(getSum(number));
		
		
	}
	 public static int getSum(int number) {
		int result = 0;
		for(int i = 1; i <= number; i++) {
			result += i;
			while(result > 100) {
				return result;
			}
		}
	}
	
	

}
