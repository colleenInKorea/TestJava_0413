package test03;

public class Test03 {
	public static void main(String[] args) {
		
//		�� �� Class �� �����ϼ���.
//		�п����� �л� ������ ���� �л� Class �� �����ϼ���.
//		�����ڿ� ���������ڸ� �̿��ؼ� ĸ��ȭ ö�п� �°� ���� �ϼ���.
//		��� ������ �Ʒ��� ���� �ϼ���.
//		������
//		�޼ҵ�� �Ʒ� �� �����ϼ���
//		���� ���ϱ�, �ѷ� ���ϱ�, ������ ���� ���� ���ϱ�
//		pi�� 3.14
//
//		�� Class�� �̿��Ͽ� �������� 8�� ���� ��ü�� �����, �Ʒ� ������ ��� �ϼ���.
		
		Circle circle = new Circle();
		circle.radius = 3;
		int count = 8;

		System.out.println("�� " + count + " ���� ���̴� " + circle.countDimensions(count));
		System.out.println("���� �ѷ��� " + circle.round());
		System.out.println("���� ���̴� " + circle.getDimensions());
		
		System.out.println();
		
//		��ǰ ���� Class�� ���� �ϼ���.
//		�п����� �л� ������ ���� �л� Class �� �����ϼ���.
//		�����ڿ� ���������ڸ� �̿��ؼ� ĸ��ȭ ö�п� �°� ���� �ϼ���.
//		��ǰ ���� Class �� ���ؼ� �Ʒ� ������ ��� �ϼ���.
//		��������� �� ������ �ʾ��� ��� "�Ǹ� ���ɻ�ǰ", ��������� ������ ��� "�Ǹ� �Ұ� ��ǰ"
		
		ManagementProduction shrimpSnack = new ManagementProduction("�����", 1300, "2021-03-02");
		
		System.out.println("�̸�: " + shrimpSnack.getName());
		System.out.println("���� : " + shrimpSnack.getPrice());
		System.out.println("������� : " + shrimpSnack.getExpirationDate());
		
		System.out.println("��ǰ 5���� ���� : " + shrimpSnack.getPrice(5) + "���Դϴ�.");
		System.out.println("��ǰ 13���� ���� : " + shrimpSnack.getPrice(13) + "���Դϴ�.");
		
		if (shrimpSnack.availableSale("2021-05-11")) {
			System.out.println("�Ǹ� ���� ��ǰ");
		}else {
			System.out.println("�Ǹ� �Ұ� ��ǰ");
		}
		
		
		
	}

}
