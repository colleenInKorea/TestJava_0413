package test03;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		���� ���ڿ� ��ȯ
//		�Ʒ��� ���� ���� ������ ����� ���� ������ �ִ�.
//		�ش� ������ �Ʒ��� ���� ��������� ǥ���ϴ� ���ڿ��� ��ȯ�ϰ� ����ϼ���.
		
		int year = 2000;
		int month = 11;
		int day = 15;
		
		String numberToString = String.valueOf(year);
		
		System.out.println(numberToString + month + day);
		
//		�Ʒ��� ���� ������ ����� String �� ������ ���� ���̸� ��� �ϼ��� (�ѱ�����)
//		String gradString = "1995";
		String gradString = "1995";
		
		int stringToNumber = Integer.valueOf(gradString);
		System.out.println("1995�� ���� ���̴� " + (2022-stringToNumber));
		
//		 ���� ����
//		 �Ʒ� �迭�� ��ǰ ����� ����Ǿ� �ִ�.
		
		String[] goods = {"�����", "������", "�Ŷ��", "��ī�ݶ�", "������", "������", "�����", "�Ŷ��"};
		int count = 0;
		String keyword = scan.nextLine()
		
		for (int i = 0; i < goods.length; i++) {
			if(goods[i].equals(keyword) ) {
				count++;
			}
		}
		System.out.println(count);
		
		
	}
}
