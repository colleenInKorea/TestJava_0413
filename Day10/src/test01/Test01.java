package test01;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
//		���� �ܾ �Է� �ް� 'e' �� � ��� �ִ��� ��� �ϼ���.
		
		System.out.println("�ܾ �Է� �ϼ��� : ");
		String word = scan.nextLine();
		
		int count =0 ;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println();
//		�Ʒ� ���ڿ����� A �� B�� �ٲ㼭 ��� �ϼ���
		
		String gradString = "My grade is A";
		String changeGradString = gradString.replace("A", "B");
		System.out.println(changeGradString);
		
//		�Ʒ��� ���� ��ȭ��ȣ�� ���� �Ǿ� ������ ��¿��ÿ� ���� ���·� -�� �����Ͽ� ����ϼ���.
		
		String phoneNumber = "01012345678";
		String partPhoneNumber1 = phoneNumber.substring(0, 3);
		String partPhoneNumber2 = phoneNumber.substring(3, 7);
		String partPhoneNumber3 = phoneNumber.substring(7);
		
		System.out.print(partPhoneNumber1 + "-" + partPhoneNumber2 + "-" + partPhoneNumber3);
		System.out.println();
//		�Ʒ��� ���� ��������� ����� String �� ������ ���� ���̸� ��� �ϼ��� (�ѱ�����)
		String gradString1 = "19950721";
		String partGradString = gradString1.substring(0, 4);
		int stringToNumber = Integer.valueOf(partGradString);
		
//		int birth = Integer.parseInt(gradString1);
//		int year = birth/10000;
		
		System.out.println("1995����� ���̴� " + (2022 - stringToNumber) + "�Դϴ�.");
		
//		�Ʒ� ���ڿ��� �ܾ� ������ ��� �ϼ���.(�ߺ� ����)
		
		String sentence = "To be, or Not to Be. That Is The Question";
		String[] words = sentence.split(" ");
		
		System.out.println(words.length);
		
		
		
		
	}

}
