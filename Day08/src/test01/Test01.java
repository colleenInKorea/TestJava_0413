package test01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		�ΰ��� index�� �Է� �޾Ƽ�, �ش��ϴ� index�� ���� ���� ��ü �ؼ� �迭�� ����ϼ���.
//		int[] numbers = {3, 5, 2, 10, 39};
		
		int[] numbers = {3, 5, 2, 10, 39};
		System.out.print("�ΰ��� index�� �Է� �ϼ���(0 <= n < 5) : ");
		int index1 = scan.nextInt();
		int index2 = scan.nextInt();
		int moment = 0;
		
		moment = numbers[index1];
		numbers[index2]= numbers[index1];
		numbers[index2]= moment;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		1 ~ 10 ���� ���ʷ� ����� �迭�� �����, ������ �� ��� �� ����� ��� �ϼ���.
//		��Ʈ
//		rand() �Լ��� �̿��ؼ�, 0��° index�� ���� rand() ��° index�� ���� ���� ��ü �ϸ� �ȴ�.
		
		int[] ziffere = {1, 2, 3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
		int temporary =0;
		Random rand = new Random();

		for (int i = 0; i < 100; i++) {
		    int randomNumber = rand.nextInt(10);
		    // swap ����
		    temporary = ziffere[randomNumber];
		    ziffere[randomNumber] = ziffere[0];
		    ziffere[0]= temporary;
		    
		}
		System.out.println(Arrays.toString(ziffere));
		
//		�Ʒ� �迭�� 1 ~ 9 �� ���ڵ��� ���µ� �ϳ��� ���� ���� �ִ�.
//		���� ���� ã�Ƽ� ����ϼ���.
		int[] numbers2 = {4, 6, 3, 8, 2, 9, 1, 5};
		int sum = 0;
		for (int i = 0; i < numbers2.length; i++) {
			sum += numbers2[i];
		}
		
	    System.out.println("���� ���� "+ (45 - sum) + "�Դϴ�.");
	    
//	    1 ~ 5 ���� �ȿ� ���ڰ� �迭�� �ߺ��Ǿ� ���� �Ǿ� �ִ�.
//	    1 ~ 5 ������ ���ڰ� ���� �� ���� ���� �Ǿ� �ִ��� ��� �ϼ���.
	    
	    //tip. �迭�� �ΰ� ����ؼ� ���� �ϸ� �����ϴ�. 
	    int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
	    int[] count = new int[5];
	   
	    	 for(int i = 0; i < numbers3.length; i++) {
	    		   count[numbers3[i]-1]++; // number3[i] �� ���� count[i]���� ���� 0~9 
	    		  }
	    	 
	    	 for(int i =0; i < count.length; i++) {
	    		   System.out.println((i + 1) + " : " + count[i]); // ī��Ʈ ����� ���� ����
	    		  }

	    	
		
	    
	    
	}

}
