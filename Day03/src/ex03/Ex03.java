package ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int weight = 80;
		
		if (weight <= 70) {
			System.out.println("ġŲ����");
		}else {
			System.out.println("������ ����");
		}
		
		if(weight <= 70) {
			System.out.println("ġŲ����");
		}else if (weight <= 75) {
			System.out.println("�߰��������");
		}else if (weight <= 80) {
			System.out.println("������ ����");
		}else {
			System.out.println("�����");
		}
	}

}
