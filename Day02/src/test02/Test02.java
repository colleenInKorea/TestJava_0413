package test02;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1=90;
		int count2=80;
		char grade1= 'A';
	    char grade2='B';
	    double mark1=4.0;
	    double mark2=3.0;
		
		System.out.println("���輺����"+count1+"�� �̻��̸�\'"+grade1+"\'�����̰� ������"+mark1+"�̴�.");
		System.out.println("���輺����"+count2+"�� �̻��̸� \'"+grade2+"\'�����̰� ������"+mark2+"�̴�.");
		
		int number1 = 33;
		double number2 = 35.325;
		System.out.println("�μ��� ����"+(number1*number2));
		
		int days =943;
		System.out.println("943�ð���"+(days/24)+"��"+(days%24)+"�ð��Դϴ�.");
		
	    int width =8;
	    int height=9;
	    
	    System.out.println("���� 9�� �ʺ� 8�� �簢�� ���̴�"+(width*height));
	    System.out.println("���� 9�� �ʺ� 8�� �ﰢ�� ���̴�"+(width*height/2));
	    
		int korean =93;
		int math=88;
		int english = 94;
		
		System.out.println("���� ������"+korean+" ����������"+math+" ����������"+english);
		System.out.println("�� ������ ��������� "+((korean+math+english)/3.0));
		
		int temper =30;
		System.out.println("���� 30���� ȭ��"+(9.0/5*temper+32)+"�Դϴ�.");
		
	}

}
