package test01;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		
//		��
//		�� �� Class �� �����ϼ���.
//		��� ������ �Ʒ��� ���� �ϼ���.
//		������
//
//		�޼ҵ�� �Ʒ� �� �����ϼ���
//		���� ���ϱ�, �ѷ� ���ϱ�, ������ ���� ���� ���ϱ�
//
//		pi�� 3.14
//
//		�� Class�� �̿��Ͽ� �������� 8�� ���� ��ü�� �����, �Ʒ� ������ ��� �ϼ���.
		Circle circle = new Circle();
		circle.count = 25;
		circle.radius = 8;
		
		System.out.println("���� ���̴� " + circle.erea());
		System.out.println("���� �ѷ��� " + circle.round());
		System.out.println("���� ������ ���� ���̴� " + circle.countCircleErea());
		
		System.out.println();
//		��ǰ ����
//		��ǰ ���� Class�� ���� �ϼ���.
//		��ǰ ���� Class �� ���ؼ� �Ʒ� ������ ��� �ϼ���.
		
		ManagementProduction snack = new ManagementProduction();
		
		snack.price = 1550;
		snack.productionName = "����� ";
//		int[] dates = {2022, 03, 02};
		snack.expirationDate = "2022-03-02";
		
		System.out.println("�̸� : " + snack.productionName);
		System.out.println("���� : " + snack.price);
		System.out.println("��������� " + snack.expirationDate);
		
		System.out.println("��ǰ 5���� ������ "+ snack.countPrice(5));
		System.out.println("��ǰ 13���� ������ "+ snack.countPrice(13));
		
		if (snack.availableSale("2021-05-11")) {
			System.out.println("�Ǹ� ���� ��ǰ");
		}else {
			System.out.println("�Ǹ� �Ұ� ��ǰ");
		}
		
		
	}

}
