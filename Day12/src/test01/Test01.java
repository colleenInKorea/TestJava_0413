package test01;

public class Test01 {
	public static void main(String[] args) {
		
		PersonInformation kim = new PersonInformation();
		kim.name = "�����";
		kim.birth ="19990426";
		kim.gender="���� ";
		
		System.out.println("�̸�: " + kim.name);
		System.out.println("�������: " + kim.birth);
		System.out.println("����: " + kim.gender);
		
		kim.greetig(2021);
		
		PersonInformation yu = new PersonInformation();
		
		yu.name = "���缮";
		yu.birth = "19981104";
		yu.gender = "����";
	
		System.out.println("������� ���缮 ���� " + (yu.getAge(2021) - kim.getAge(2021)) + "�� ���� ����. ");
		
		kim.compareAge(yu);
		
	}
}
