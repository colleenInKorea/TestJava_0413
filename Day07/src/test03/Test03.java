package test03;

public class Test03 {

	public static void main(String[] args) {
//		�Ʒ� �迭�� �̿��ؼ� ������ Ǫ����.
//		�迭�� ������ 0 �ΰ��� ���� �ϼ���
		
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		numbers[3]= 6;
		
//		�迭�� ���� ������ ����ϼ���.
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
//		�迭�� ���� �ݴ� ����(����)�� ����ϼ���.
		for(int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		�迭�� ¦����° ��ġ�� �ִ� ������ ��� �ϼ���.
//		for(int i = 0; i < numbers.length; i++) {
//			if(i % 2 == 1) {
//				System.out.print(numbers[i] + " ");
//			}
//		}
		
		// ����ȭ �� ���� 
		for(int i = 1; i < numbers.length; i+=2) {
				System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
//		�迭�� ���� 2�� ��� �ִ� index�� ����ϼ���.
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 2) {
				System.out.println("2�� �� �ִ� index : " + i);
				//���� �ݺ��� �� �ʿ䰡 ���� ������ break�� ���ִ� ���� ���� ����. 
				break;
			}
		}
		
//		�迭�� ���� ���� ū���� ��� �ϼ���
		int max = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("�ִ밪�� " + max);
		
//		�迭�� ���� ���� �������� ����� index�� ����ϼ���.
		// ����ȭ �� Ǯ�� [�����Ѵ�� ���̴� �� ���� ����.]
		
		int information = 0;
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[information] > numbers[i]) {
				numbers[information] = numbers[i];
				information= i;	
			}
		}
		
//		int min = numbers[0];
//		int information = 0;
//		for(int i = 1; i < numbers.length; i++) {
//			if(min > numbers[i]) {
//				min = numbers[i];
//				information= i;	
//			}
//		}
		
		
		System.out.println("�������� ���� index�� " + information + "�Դϴ�.");
		
		
//		�迭�� ��� ���� ���� ��� �ϼ���
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		System.out.println("���� ���� " + sum);

	}

}
