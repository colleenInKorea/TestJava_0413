package test06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in);
		
		List<Person> personList = new ArrayList<>();
		while (true) {
			
			System.out.println("1 : �Է�  2: ���  3: ����   4: ����");
			int putIn = scan.nextInt();
			
			if(putIn == 4) {
				System.out.println("���� �մϴ�.");
				break;
			}
			
			switch (putIn) {
				case 1:
					System.out.println("�̸��� ��������� �Է��Ͻÿ�.");
					String name = scan.next();
					int birth = scan.nextInt();
					
					personList.add(new Person(name, birth));
					break;
					
				case 2:
					System.out.println(personList);
					
					break;
					
				case 3:
					System.out.println("������ ���� �̸��� ���ÿ�.");
					String person = scan.next();
					personList.remove(person);
					System.out.println("���� ����");
					break;
					
				//	case 4:
				//		System.out.println("���� �մϴ�. ");
				//		break;
					
				default:
					System.out.println("�߸� �Է� �Ͽ����ϴ�. ");
					break;
				}
			}
		}
	}


