package test03;

public class Test03 {

	public static void main(String[] args) {
		
//		�ڵ��� ��ü
//		�ڵ��� Class �� �����ϼ���.
//		��� ������ �Ʒ��� ���� �ϼ���.
//		������, �𵨸�, ��ȭ ��ȣ
//
//		����� Class �� ������� �� ���� ��ü�� �����Ͽ�, ���� ���� ��, ����ϼ���
//		��� ������ ���� �� ���� �����Ӱ� �ۼ��ϼ���.
		
		CellPhoneDate[] dates = new CellPhoneDate[2];
		CellPhoneDate samsung = new CellPhoneDate();
		CellPhoneDate apple = new CellPhoneDate();
		
		dates[0] = samsung;
		dates[1] = apple ;
		
		dates[0].brand = "samsung";
		dates[0].phoneName ="������s10e";
		dates[0].phoneNumber = "01012345678";
		
		dates[1].brand = "apple";
		dates[1].phoneName ="iPhoneSE";
		dates[1].phoneNumber = "0109876543";
		
		for (int i = 0; i < dates.length; i++) {
			System.out.println(dates[i].brand);
			System.out.println(dates[i].phoneName);
			System.out.println(dates[i].phoneNumber);
		}
		
		System.out.println();
		
//		�л� Class�� �����ϼ���.
//		��� ������ �Ʒ��� ���� �ϼ���.
//		�̸�, ������, ����, ��ȭ��ȣ
		
		
		StudentDate[] information = new StudentDate[2];
		StudentDate someone1 = new StudentDate();
		StudentDate someone2 = new StudentDate();
		
		information[0] = someone1;
		information[1] = someone2;
		
		information[0].name ="���缮";
		information[0].age = 21;
		information[0].subject ="java";
		information[0].phoneNumber ="01023453223";
		
		information[1].name ="��ȿ��";
		information[1].age = 23;
		information[1].subject ="java";
		information[1].phoneNumber ="01096482734";
		
		for (int i = 0; i < information.length; i++) {
			System.out.println(information[i].name);
			System.out.println(information[i].age);
			System.out.println(information[i].subject);
			System.out.println(information[i].phoneNumber);
		}
		
		

	}

}
