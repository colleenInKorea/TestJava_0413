package ex02;


import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
//		�����͸� ������ ���� �����ϰ�, �����ϰ�, Ž���ϱ� ���� ����� �ڷ� ���� ��� �Ѵ�.
//		Java ���� ��� ������ �ڷᱸ���� Collection �̶�� �Ѵ�.
		
//		List
//		�迭�� ���� ���� Ÿ���� �������� �ڷḦ �����ϴ� �ڷᱸ��.
//		�迭�̰��� �޸� ����� ���� ������ �������� �����Ͽ���.
//		�⺻ Ÿ���� ��� �Ұ��� �ϰ� ��ü���·θ� ���� �����ϴ�.
//		generic�� Ȱ��ּ� Ÿ���� �������� Ȯ���Ѵ�.
//		ArrayList<Integer> integerList = new ArrayList<>();	
		
		//����Ʈ����
		ArrayList<Integer> integerList = new ArrayList<>();
		
		//�� �߰�
		integerList.add(20);
		integerList.add(50);
		
		System.out.println(integerList);
		
		//�� ����
		integerList.add(1, 30);
		System.out.println(integerList);
		
		//���ϳ��� Ȯ�� 
		Integer number = integerList.get(2);
		int number2 = integerList.get(0);
		System.out.println(number);
		System.out.println(number2);
		
		//�� ����
		integerList.set(1, 10);
		System.out.println(integerList);
		
		//�� ����
		integerList.remove(2);
		System.out.println(integerList);
		
		//��� ����
		integerList.clear();
		System.out.println(integerList);
		
		//���ڿ� ����Ʈ
		List<String> stringList = new ArrayList<>();
		stringList.add("�б�");
		stringList.add("����");
		
		System.out.println(stringList);
		
		
	}
}
