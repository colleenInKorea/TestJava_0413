package test03;

public class Circle {
//	�� �� Class �� �����ϼ���.
//	�п����� �л� ������ ���� �л� Class �� �����ϼ���.
//	�����ڿ� ���������ڸ� �̿��ؼ� ĸ��ȭ ö�п� �°� ���� �ϼ���.
//	��� ������ �Ʒ��� ���� �ϼ���.
//	������
//	�޼ҵ�� �Ʒ� �� �����ϼ���
//	���� ���ϱ�, �ѷ� ���ϱ�, ������ ���� ���� ���ϱ�
//
//	pi�� 3.14
//
//	�� Class�� �̿��Ͽ� �������� 8�� ���� ��ü�� �����, �Ʒ� ������ ��� �ϼ���.
	
	int radius;
	private double pi = 3.14;

	public double getDimensions() {
		double dimensions = radius * radius * pi;
		return dimensions;
		
	}
	
	public double round() {
		double round = 2 * radius * pi;
		return round;
		
	}
	
	public double countDimensions(int count) {
		double countDimensions = count * (radius * radius * pi);
		return countDimensions;
		
	}
	

}
