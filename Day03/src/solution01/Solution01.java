package solution01;

import java.util.Scanner;

public class Solution01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		
		double average = (score1 + score2)/2.0;
		
		if(average >= 70) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		
		
	}

}
