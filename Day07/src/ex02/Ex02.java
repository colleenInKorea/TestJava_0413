package ex02;

public class Ex02 {

	public static void main(String[] args) {

		// �迭 Array 
		//������ ������ �����ؾ� �ϴ� ��� ���� ����Ѵ�. 
		// ����� ���ÿ� �ʱ�ȭ �ϴ� ����� ������ ���� Ȯ���ϴ� ����� �ִ�. 
//		int[] scores = {89, 93, 91, 93, 92, 78, 90, 90, 93, 90};
//		int[] numbers = new int[10];
//		scores[i]�� ���·� �迭�� �ִ� ���ڿ� ������ �����ϴ�.(�迭�� ������ ��, 0 ���� �����Ѵ�.)
		
		int[] scores = {100, 99 ,98 ,97 ,96, 95};
		int[] numbers = new int[5];
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "��° ���� " + scores[i]);
		}
		
		System.out.println();
//		�迭 �� ��� ���ϱ�
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("����� " + sum/(double)scores.length);
		
		//�ְ��� ���ϱ�
		int max = scores[0];
		for(int i =0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}
		}
		System.out.println("�ִ밪�� "+ max);

		
	}

}
