package test02;

public abstract class Test02 {

	public static void main(String[] args) {
		
//		35 ~ 40 ���� ��� �ϼ���
		int number = 35;
		for(int i = 0; i < 6; i++) {
			System.out.print(number + i + " ");
		}
//		5 ~ -5 ���� ����ϼ���
		number = 5;
		for(int i = 0; i < 11; i++) {
			System.out.println(number - i);
		}
		
//		1 ~ 50 ���̿� 3�� ����� ����ϼ���.
		for(int i = 0; i < 51; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		
		
 		

	}

}
