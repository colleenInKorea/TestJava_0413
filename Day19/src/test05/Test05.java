package test05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<String> fruitsList = new ArrayList<>(); 
		
		while (true) {
			
			
			System.out.println("1 : �Է�  2: ���  3: ����   4: ����");
			int putIn = scan.nextInt();
			
			if(putIn == 4) {
				System.out.println("���� �մϴ�.");
				break;
			}
			
			switch (putIn) {
			case 1:
				System.out.println("������  �Է� �Ͻÿ�");
				String name = scan.next();
				fruitsList.add(name);
				break;
				
			case 2:
				System.out.println(fruitsList);

				break;
				
			case 3:
				System.out.println("������ ���� �̸��� ���ÿ�.");
				String fruit = scan.next();
				fruitsList.remove(fruit);
				System.out.println("���� ����");
				break;
				
//			case 4:
//				System.out.println("���� �մϴ�. ");
//				break;

			default:
				System.out.println("�߸� �Է� �Ͽ����ϴ�. ");
				break;
			}
		}
		
	}

}
