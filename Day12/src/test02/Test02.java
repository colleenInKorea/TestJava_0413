package test02;

public class Test02 {
	public static void main(String[] args) {
//		�л� ��ü
//		�п����� �л� ������ ���� �л� Class �� �����ϼ���.
//		�����ڿ� ���������ڸ� �̿��ؼ� ĸ��ȭ ö�п� �°� ���� �ϼ���.
//		��� ������ �Ʒ��� ���� �ϼ���.
//		�̸�, �б�, ��ȭ��ȣ, ����
//
//		����� Class �� ������� �� ���� ��ü�� �����Ͽ�, �Ʒ��� ���� ����ϼ���
//		��� ������ ���� �� ���� �����Ӱ� �ۼ��ϼ���.
//		��� ���뿡 ���缭 ������ ����� �����ϰ� ȣ�� �ϼ���.
		
		StudentInformation lee = new StudentInformation("Lee do-gyeong", "dima", "01032705908", "java");
		
		System.out.println(lee.getLesson() + " ���� : " + lee.getUniversity() + lee.getName() + "�л�");
		lee.setUniversity("�Ѿ���б�");
		System.out.println(lee.getLesson() + " ���� : " + lee.getUniversity() + lee.getName() + "�л�");
		
		System.out.println();
	
		lee.sendMessage();
		lee.getLessonInformation();
		
		
//		������s10 Class �� �����ϼ���.
//		�����ڿ� ���������ڸ� �̿��ؼ� ĸ��ȭ ö�п� �°� ���� �ϼ���.
//		��� ������ �Ʒ��� ���� �ϼ���.
//		������, �𵨸�, �Ϸù�ȣ, ��ȭ��ȣ
//
//		����� Class �� ������� ��ü�� �����Ͽ�, �Ʒ��� ���� ����ϼ���
//		��� ������ ���� �� ���� �����Ӱ� �ۼ��ϼ���.
//		��� ���뿡 ���缭 ������ ����� �����ϰ� ȣ�� �ϼ���.
		System.out.println();
		
		PhoneInformation gallaxy10  = new PhoneInformation("�Ｚ", " Gallaxy10 ", "1234567890", "010-111-2222");
		
		System.out.println(gallaxy10.getBrand() + "���� ������ " + gallaxy10.getModelName() + "�Դϴ�.");
		System.out.println("��ȭ ��ȣ : " + gallaxy10.getPhoneNumber());
		System.out.println("�Ϸ� ��ȣ : " + gallaxy10.getModelCode());
		
		System.out.println();
		
		gallaxy10.setPhoneNumber("010-1234-5678");
		gallaxy10.callingSomeone();
		gallaxy10.setPhoneNumber("010-9876-5432");
		gallaxy10.sendingSomeone();
		
	}

}
