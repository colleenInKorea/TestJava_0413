package test02;

public class Test02 {
	public static void main(String[] args) {
		
//		������ �����ϰ� ���̸� ����ϴ� ��, �ﰢ��, �簢�� Class �� ���� �ϼ���.
//		Shape ��� �ϴ� Class �� �θ�� ������ Shape Class �� �� ���� Class �� �����ϼ���.
//		Shape �迭�� ��ü�� ��Ƽ� ��ĳ����, �ٿ�ĳ������ ����ؼ� �Ʒ��� ���� ��� �ϼ���.
//		������ pi �� 3.14 �� ����ϼ���.
		
		Shape[] shape = new Shape[3];

        // upcasting
        shape[0] = new Triangle(8, 10);
        shape[1] = new Rectangle(7, 13);
        shape[2] = new Circle(12);
        
        
        //���
        for (int i = 0; i < shape.length; i++) {
        	
        	// �ʱ� ���� Ǭ ���
        	//1��
//			if(shape[i] instanceof Triangle) {
//				System.out.println("�ﰢ���� ���̴� " + shape[i].calculateErea() + "cm^2 �Դϴ�.");
//			}
//			if(shape[i] instanceof Rectangle) {
//				System.out.println("�簢���� ���̴� " + shape[i].calculateErea() + "cm^2 �Դϴ�.");
//			}
//			if(shape[i] instanceof Circle) {
//				System.out.println("���� ���̴� " + shape[i].calculateErea() + "cm^2 �Դϴ�.");
//			}
        	
        	//���ٷ� ���̱�
        	//Ŭ������ �޼ҵ�� ȣ�� �ϱ� 
        	System.out.println(shape[i].getName() + "�� ������ ���� "+ shape[i].calculateErea() +"cm^2 �Դϴ�. ");
        
        	
		}
		
		
		
	}
}
