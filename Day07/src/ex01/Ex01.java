package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//�Լ� �����(����)
//		1. ������ ����ǰ�? /�̸� ����(������ noun, �Լ��� verb)
//		2. ����� �������ΰ�? / �ް����� (parameter)����		
//		3. ����� ������ ���ΰ�? / return type
		
		System.out.println(getNoodlesPrice(5, 1500));
		
		printHelloWorld();
	}
	
	public static int getNoodlesPrice(int count) {
		int result = 850 * count;
		return result;
	}
	 //�������̵� 
	//* override =���� �̸��� �Լ��� �ٸ� �Ķ���ͷ� ������ �Ҽ� �ִ�. 
	
	public static int getNoodlesPrice(int count, int price) {
		int result = price * count;
		return result;
	}
	
	//���� Ÿ�ԶǴ� �Ķ���Ͱ� ���� Ÿ�� �Լ� ����� 
	//��� ���带 �ι� ����ϴ� �Լ�
	public static void printHelloWorld() {
		System.out.println("Hello World");
		return;//�Լ��� �����ϰ� ������ void���� ���� ����Ѵ�. 
		
	}
}
