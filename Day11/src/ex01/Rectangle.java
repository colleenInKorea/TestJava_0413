package ex01;

public class Rectangle {
	int width;
	int height;
	int count;
	
	double calculateErea () {
		double calculateErea = width * height;
		return calculateErea;
	}
	
	double calculateEreaCount() {
		double calculateEreaCount = count *( width * height);
		return calculateEreaCount;
	}
	
	// ��� �Լ�
	void printRectangle() {
		System.out.println("���� : " + width + " ���� : " + height);
	}

}
