package ex01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noodleCup;
		int coke=1500;
		
		noodleCup= 850;
		coke = 1300;
		
		//������ 3���� ����
		
		int sum ;
		sum = noodleCup*3;
		System.out.println("������ 3���� ������"+sum);
		
		int geldhaben=10000;
		
		geldhaben= geldhaben-sum;
		System.out.println("���� ���� �뵷��"+geldhaben);
		
		
		geldhaben =5000;
		System.out.println("����ִ� �������� ������"+(geldhaben/noodleCup));
		
		//������ ������ %
		System.out.println("�������� ��� ���� �ܵ���"+(geldhaben%noodleCup));
		
		
		
		
		

	}

}
