package ex01;

public class Ex01 {
	public static void main(String[] args) {
		
		//������ �迭
//		int[][] scores = {
//			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
//			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
//			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
//			    {65, 63, 57, 87, 88, 92, 78, 85, 70, 68},
//			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
//			};
		//int[][] scores = new scores[2][3];
		//��� �迭�� ��� ���� ���������� ���� �ϸ� �ȴ�. 
		// ū�Ϳ��� ���� ������ ���ٰ� ���� �ϴ� ���� �ſ� ���� ���̴�.
		
		//����
		//5���� �л� 3���� ���� ����
		
		int[][] scores= {
				{90, 65, 85},
				{50 ,99 ,98},
				{56, 85, 100},
				{65, 85, 90},
				{32, 100, 100}
		};
		
		System.out.println("3��° �л��� �ι�° ����" + scores[2][1]);
		System.out.println("2��° �л��� 1��° ����" + scores[1][0]);
		System.out.println("5��° �л��� 3��° ����" + scores[4][2]);
		
		//�ݺ������� ���
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+ " ");
			}
			System.out.println();
		}
		
		//�л��� ��� ���ϱ�
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			System.out.println(sum/3.0);
		}
		
	}

}
