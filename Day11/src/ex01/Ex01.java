package ex01;

public class Ex01 {
	public static void main(String[] args) {
		//��ü ���� ���α׷�
		//Object - Oriented Programming
		//(������ O.o.p��� �ٿ��� �̾߱� �Ѵ�. )
		
		//�簢�� ���� ���ϴ� �޼ҵ�� �׿� ���� Ŭ�� ����� 
		Rectangle rect1 = new Rectangle();
		rect1.width = 10;
		rect1.height = 15;
		rect1.count = 3;
		
		// �Ҵ� �Ǿ� �ִ� ���� ����ϴ� �޼ҵ带 �ҷ��� ������ �����Ѵ�. 
		double erea = rect1.calculateErea();
		System.out.println(erea);
		// ������ ���� ���� �� ���ϱ� 
		System.out.println(rect1.calculateEreaCount());
		
		
		
		
		
	}

}
