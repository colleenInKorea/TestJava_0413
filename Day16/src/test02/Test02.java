package test02;

public class Test02 {
	public static void main(String[] args) {
		
		Temperature[] temperatures = new Temperature[2];
		temperatures[0] = new Celsius(26.3, "����");
		temperatures[1] = new Fahrenheit(46.0, "ȭ��");
		
		for (int i = 0; i < temperatures.length; i++) {
			System.out.println(temperatures[i].getUnit() +"�� �ٸ� ������ �ٲٸ� " +temperatures[i].changeUnit() + "�Դϴ�.");
		}
		
		Length[] lengths = new Length[2];
		lengths[0] = new Centimeter(15.0, "��Ƽ����");
		lengths[1] = new Inch(39.4, "��ġ");
		
		for (int i = 0; i < lengths.length; i++) {
			System.out.println(lengths[i].getUnit() + "�� �ٸ� ������ �ٲٸ� " + lengths[i].changeUnit() + "�Դϴ�.");
		}
		
	}

}
