package test05;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� ���� �Է��Ͻÿ�");
		int number1= scan.nextInt();
		int frist= number1/1000;
		int second= (number1%1000)/100;
		int thrid = ((number1%1000)%100)/10;
		int forth = (((number1%1000)%100)%10);	
		 
		System.out.println(frist+"\n"+second+"\n"+thrid+"\n"+forth);
		System.out.println(forth+"\n"+thrid+"\n"+second+"\n"+frist);
		System.out.println("�հ��"+(frist+second+thrid+forth)+"�Դϴ�.");
		

		System.out.println("���ڸ� ���� �Է��Ͻÿ�");
		int number2= scan.nextInt();
		int erst = number2/100;
		int zweite = (number2%100)/10;
		int dritte = (number2%100)%10;
		
		System.out.println("���: "+dritte+zweite+erst);
	}

}
