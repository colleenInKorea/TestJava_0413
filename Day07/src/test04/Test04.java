package test04;

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		index �� ���� ���ʷ� �Է� �޾Ƽ�, �Ʒ� �迭�� �ش��ϴ� index�� ���� �ٲٰ� ��� �ϼ���.
		int[] numbers = {3, 5, 2, 10, 39};
		System.out.print("������ index�� ���� �Է��ϼ��� : ");
		int order = scan.nextInt();
		int number = scan.nextInt();
		
		numbers[order]= number;
		for (int i = 0; i < numbers.length; i++ ) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		//�Ʒ��� ���� O �� X�� ä�� ����� ����� �迭�� �ִ�.
//		100�� ���� �������� ������ �¾Ҵ��� ����ϼ���.
		char[] scores = {'X','O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
		
		int count = 100;
		for(int i = 0; i < scores.length; i++) {
			if (scores[i] == 'X') {
				count -= 10;
			}
		}
		
		System.out.println("ä������� " + count + "�� �Դϴ�.");
		
//		�Ʒ� �迭�� ���� ��, ȭ, ��, ��, ��, ��, �� 7�ϰ��� �Ƹ�����Ʈ�� �� �ð��� ��Ÿ����.
//		�ñ� ������ �Ʒ��� ������ 7�� ���� ���� �� �ӱ��� ���� ����ϼ���.
		
//		���� �ñ� : 8500��
//		�ָ�(��,��) �ñ� : 9500��
		
		int[] works = {3, 5, 5, 3, 5, 3, 5};
		
		int pay = 0;
		int pay1 = 0; 
		int sum = 0;
		for(int i = 0; i < works.length-2; i++) {
			 pay = works[i] * 8500;
			 sum += pay;	
		}
		
		for(int i = works.length-1; i > works.length -3; i--) {
			pay1 = works[i] * 9500;
			sum += pay1;
		}
		
		System.out.println("�����ϰ�  �� �ӱ��� " + sum + " �� �Դϴ�. ");
		
		
//		�ݺ����� �̿��ؼ� A~Z �� �迭�� �����ؼ� ��� �ϰ�, 'V' �� ���° ���ĺ����� ��� �ϼ���.
		char[] alphabets= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		for (int i = 0; i < alphabets.length; i++) {
			if (alphabets[i] == 'V') {
				System.out.println("v�� " + (i + 1) + "��° �Դϴ�.");
				break;
			}
		}
		
//		���̰� 5�� int �迭�� �����.
//		���� ���� ������ �Է� �����鼭, �Է� ���� ���� ¦�� �϶���, �迭�� �����Ѵ�.
//		�迭�� �������� �Է��� �ߴ��ϰ�, ����� ������ ����Ѵ�.
		
		int[] numbers1 = new int[5];
		int i = 0; 
		
		while(true) {
			if(i >= numbers1.length) {
				break;
			}
			System.out.print("���� �Է��Ͻÿ� : ");
			int number1 = scan.nextInt();
				if(number1 % 2 == 0) {
					numbers1[i] = number1;
					i++;
				}
		}
		
		System.out.println(Arrays.toString(numbers1));
	
		
		}

	}
	


