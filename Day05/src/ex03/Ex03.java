package ex03;

public class Ex03 {

	public static void main(String[] args) {
		
// ��ø �ݺ��� ����
		//��ġ������ 30ȸ�� 3�� �ݺ�
//		for(int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 30; j++) {
//				System.out.println("���X���X");
//			}
//		}
		
		for(int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 30; j++) {
				System.out.println(i + "��Ʈ "+ j + "��°");
			}
		}
// 0-9���� 5�� ���
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		// 00 01 02 03 04 05...
		// 10 11 12 13 14 15 ..
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i +""+ j + " ");
			}
		System.out.println();
		}
		
		//***** x 5�� ǥ�� 
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		 
	}

}
