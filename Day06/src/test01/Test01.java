package test01;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
//		�ΰ��� �ֻ����� ��������, ���� �� �ִ� ��� ����� ���� ��� �ϼ���.
		for(int i = 1; i < 7; i++) {
			for(int j = 1; j < 7; j++) {
				System.out.print("(" + i + ", " + j + ")");
			}
		System.out.println();
		}
		
//		�������� 2�ܿ��� ���� 9�� ���� ��� ����ϼ���.
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println( i + "X" + j +" = " + (i * j));
			}
		}
		
		System.out.println();
		
//		�Ʒ� ����ó�� *�� ����ϼ���
//		*
//		**
//		***
//		****
//		*****
		
		for(int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		�Ʒ� ����ó�� *�� ����ϼ���
//		*****
//		****
//		***
//		**
//		*
		
		for(int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//		
//			*
//		   **
//		  ***
//		 ****
//		*****
		
		for(int i = 1; i <= 5; i++) {
			for (int j = 5; j > 0; j--) {
				if(j > i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
//		
//		 	*
//		   ***
//		  *****
//		 *******
//		*********
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (2*i)+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//		
	}

}
