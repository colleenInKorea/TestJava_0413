package ex03;

public class Ex03 {
	public static void main(String[] args) {
		
		//���� ���ڿ�
		String numberString = "30";
		String numberString1 = "20";
		
		System.out.println(numberString + numberString1);
		
		int number1 = Integer.parseInt(numberString1);
		int number2 = Integer.parseInt(numberString);
		
		System.out.println(number1 + number2);
		
		//���� => ���ڿ�
		
		number1 = 5;
		number2 = 10;
		
		//�ļ����� ���ؼ� ���� ���̴� ģ��
		numberString = number1 + "";
		numberString1 = number2 + "";
		
		System.out.println(numberString + numberString1);
		
		//�������� ���
		
		numberString = String.valueOf(number1);
		
		//���ڿ� ��
		String word1 = new String( "cat");
		String word2 = "cat";
		
		//���ڿ��� ���� ��?
		
		if(word1 == word2) {
			System.out.println("�� ���ڿ��� ���� ");
		}else {
			System.out.println("�ι��ڿ��� �ٸ���. ");
		}
		
		// ���ڿ� �� ��� 
		if (word1.equals(word2)) {
			System.out.println("���ƿ�");
		}else {
			System.out.println("�޶��");
		}
		
	}

}
