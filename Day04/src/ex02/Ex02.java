package ex02;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//70ų�� �̻��� ��� ��� �ݺ��ϴ� while���� ���ÿ�.
		
		System.out.println("�����Ը� �Է��ϼ���.");
		int weight = scan.nextInt();
	
		while (weight > 70) {
			System.out.println("�����");
			//weight = weight - 4;(�Ʒ��� ���¸� �� ���� ����Ѵ�.)
			weight -= 2;
		}
		//do - while �� ���� ���� �ݺ��� 
		/* Ƚ���� ������� �ϴ� ���� ������ �ϴ� ���� 
		 * do{
		 * ���๮}
		 * while(����) �����̴�.
		 */
		
		// Ƚ���ݺ� 5��;
		
		int i = 0;
		while(i < 5) {
			System.out.println("Hello world!!"+i);
			i++; // i = i + 1
		}
		
		i = 5;
		while(i > 0) {
			System.out.println("Hallo"+i);
			i--; //i = i - 1
		}
		
		int count =10;
		i = 0;
		while(i < count) {
			System.out.println("replay");
			i++;
		}
		
		//�ձ��ϱ�
		//1���� 10������ ���� ���ϱ�(������ ���� ���ϱ�)
		int sum = 0;
		i = 1;
		while(i < 11) {
			sum += i; //sum = sum + i;
			System.out.println("log"+sum);
			i++;
		}
		
		System.out.println(sum);
		
		//���� �ۿ��� ����Ѵ�. (����ȭ �ؾ��Ѵ�.)
		
		//ī��Ʈ ����
		//¦���� ������ ����Ͻÿ� (1-10)
		int count1 = 0;
		i = 1;
		while(i <= 10) {
			if(i % 2 == 0) {
				count1++;
				System.out.println("log"+count1);
			}
			i++;
		}
		System.out.println(count1);
	}
}
