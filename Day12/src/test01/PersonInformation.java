package test01;

import javax.xml.crypto.Data;

public class PersonInformation {
	String name;
	String birth;
	String gender;
	
	//���� ���ϱ� 
	int getAge(int thisYear) {
//		String yearString = birth.substring(0, 4);
//		int year = Integer.parseInt(yearString);
		
		//���� ����� 
		int year = Integer.parseInt( birth.substring(0, 4)) ;
		return thisYear - year + 1;
		
	}
	void greetig(int thisYear) {
		System.out.println("�ȳ��ϼ���" + name + "�Դϴ�. ");
		System.out.println("���� " + getAge(thisYear) + "�� " + gender + "�Դϴ�. ");
	}
	//���̸� ���ϴ� �Լ�
	int compareAge(PersonInformation person){
		//this
		int thisYear = Integer.parseInt(this. birth.substring(0, 4)) ;
		System.out.println(thisYear);
		int targetYear = Integer.parseInt( person.birth.substring(0, 4)) ;
		System.out.println(targetYear);
		//����� ������ �Ķ���ͷ� ���� ��ü�� ���̰� �� ����. 
		//����� ����� �Ķ���ͷ� ���� ��ü�� ���̰� �� ����. 
		// ����� 0�̸� ���� �����̴�. 
		
		return thisYear - targetYear;
	}
}
