package test01;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		
		
//		[2][3] ũ���� �迭�� ���弼��.
//		�ݺ����� �̿��ؼ�, ��� ���� 10�� �ְ� ����ϼ���.
		int[][] numbers = new int [2][3];
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = 10;
				System.out.print (numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		[3][4] ũ���� �迭�� ���弼��.
//		�ݺ����� �̿��ؼ�, �Ʒ��� ���� �� �迭�� 1~4�� ���� �ϰ�, ����ϼ���.
		int[][] numbers1 = new int[3][4];
		for (int i = 0; i < numbers1.length; i++) {
			for (int j = 0; j < numbers1[i].length; j++) {
				numbers1[i][j] = j + 1;
				System.out.print(numbers1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
//		[3][3] ũ���� �迭�� ���弼��.
//		�ݺ����� �̿��ؼ�, ù �迭�� 1, �ι�° �迭�� 2, ����° �迭�� 3 ���� ä��� ��� �ϼ���.
		int[][] numbers2 = new int [3][3];
		
		for (int i = 0; i < numbers2.length; i++) {
			for (int j = 0; j < numbers2[i].length; j++) {
				numbers2[i][j] = i + 1;
				System.out.print(numbers2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		

		//[5][5] ũ���� �迭�� ���弼��.
		//��� ���� 0���� �ʱ�ȭ �ϼ���.
		//�ݺ����� �̿��ؼ�, �Ʒ��� ���� + ��ġ�� 1�� �Է� �ϰ� ����ϼ���.
		int[][] numbers3 = new int [5][5];
		
		for (int i = 0; i < numbers3.length; i++) {
			for (int j = 0; j < numbers3[i].length; j++) {
				if(i == 2 || j == 2) {
					numbers3[i][j] = 1;
				}else {
					numbers3[i][j] = 0;
				}
				System.out.print(numbers3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
//		[3][3] ũ���� �迭�� ���弼��.
//		�ݺ����� �̿��ؼ�, �Ʒ��� ���� ���·� ���ڸ� ���ʷ� �����ϰ� ��� �ϼ���.
		int[][] ziffere = new int [3][3];
		
		//(���� 1)
//		int number = 1;
//		for (int i = 0; i < ziffere.length; i++) {
//			for (int j = 0; j < ziffere[i].length; j++) {
//				ziffere[i][j] = number ;
//				System.out.print( ziffere[i][j] + " ");
//				number ++;
//			}
//			System.out.println();
//		}
		
		//(���� 2)
		for (int i = 0; i < ziffere.length; i++) {
			for (int j = 0; j < ziffere[i].length; j++) {
				ziffere[i][j] = (j + 1) + (i * 3) ;
				System.out.print( ziffere[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		[3][3] ũ���� �迭�� ���弼��.
//		�ݺ����� �̿��ؼ�, �Ʒ��� ���� ���·� ���ڸ� ���ʷ� �����ϰ� ��� �ϼ���.
		
		int[][] ziffere1 = new int [3][3];
		for (int i = 0; i < ziffere1.length; i++) {
			for (int j = 0; j < ziffere1[i].length; j++) {
				ziffere1[i][j] = (i + 1) + (j * 3);
				System.out.print( ziffere1[i][j] + " ");		
			}	
			System.out.println();
		}
		
//		int count = 1;
//		for (int i = 0; i < ziffere1.length; i++) {
//			for (int j = 0; j < ziffere1[i].length; j++) {
//				ziffere1[j][i] = count;
//				count++;
//				System.out.print( ziffere1[j][i] + " ");
//			}	
//			System.out.println();
//		}
		
		
	}

}
