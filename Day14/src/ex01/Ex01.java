package ex01;

public class Ex01 {
	public static void main(String[] args) {
		//Inheritance ��� 
		// protected �� ����� �� �� �ִ�. 
		//Override(������ )
		
		//���� (��ӿ� ���Ͽ� ���� �غ���)
		
		StudentInformation lee = new StudentInformation("lee do-dyeong", "19980219", "Dima");
		//����� �ϸ� �θ� Ŭ�󽺿� �ִ� �żҵ带 ��� �Ҽ� �ִ�. 
		lee.greeting();
		
		PersonInformation I = new PersonInformation("�̵���", "19980219");
		//�ڽ� Ŭ������ �θ� Ŭ������ �ν� �Ѵ�. �Ϲ����� �������� ������ �ְ� �޴� �ٰ� ���� �ϴ� ���� �� ���ϴ�. 
		
	}

}
