package test02;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
//		�����̸��� ����� ���ڿ� �迭���� jpg ������ ����� ����ϼ���.
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		
		int count = 0;
		for(int i = 0; i < files.length; i++) {
			if(files[i].endsWith("jpg")) {
				count++;
			}
		}
		
		System.out.println("jpg ������ ������ " + count);
		
//		���� �ܾ� ��� ����.
//		�Ʒ��� ���� 4���� ������ �����ϰ�, ���ڿ��� �������� �Է��� �޴´�.
//		100�� ���� �������� �������� ����Ѵ�.
//			1. �¸��� ����� �Է��ϼ��� :
//			2. ����� ����� �Է� �ϼ��� :
//			3. ��ǻ�͸� ����� �Է� �ϼ��� :
//			4. ��Ʈ���� ����� �Է��ϼ��� :
		int grade = 0;
		
		System.out.print("1. �¸��� ����� �Է��ϼ��� :");
		String answer = scan.nextLine();
		if(answer.equals("victory")) {
			grade = 25;
		}
		
		System.out.println("2. ����� ����� �Է� �ϼ��� :");
		String answer1 = scan.nextLine();
		if(answer1.equals("love")) {
			grade += 25;
		}
		
		System.out.println("3. ��ǻ�͸� ����� �Է� �ϼ��� :");
		String answer2 = scan.nextLine();
		if(answer2.equals("computer")) {
			grade += 25;
		}
		
		System.out.println("4. ��Ʈ���� ����� �Է��ϼ��� :");
		String answer3 = scan.nextLine();
		if(answer3.equals("notebook")) {
			grade += 25;
		}
		
		System.out.println(grade + "�� �Դϴ�.");
//		
//		ȸ�� ��ΰ� �Ʒ��� ���� ���ڿ��� ���� �Ǿ� �ִ�. ���� �̸��� � ���� ����ϼ���.
		String membersString = "������:�۰�ȣ:���켺:�̹�ȣ:�۰�ȣ:�̹���:�̹���:������:�̺���:������:�̹���";
		
		// ���ڿ� Ư�� ���ڿ� �������� ������. [�ɰ���]
		String[] names = membersString.split(":");
		
		//�ߺ� ã�� ����
		//ã�� ����� ���� 
		
		int equalsCount = 0;
		for (int i = 0; i < names.length; i++) {
			 count = 0;
			for (int j = i + 1; j < names.length; j++) {
				//���� ó�� 
				if(names[i].equals("")) {
					continue;
				}
				
				//���� �̸��� 2�� �̻� �ִ� ��� ����Ѵ�. 
				if(names[i].equals(names[j])) {
					names[j] = "";
					count++;
				}
			}
			//������ ������� ���� �̸��� ��츦 ã�� �� ���� ������ ���� �������Ѽ� ���� ó�� �ϴ� ���� �ո����̴�. 
			//�̹��� ���� ��� ���� ��� �ϴ� ���� ���� ����. 
			if(count >= 1) {
				equalsCount ++;
			}
		}
		
		System.out.println(equalsCount + "���� ���������� ���� �մϴ�.");
		
		
		
		
		
	}

}
