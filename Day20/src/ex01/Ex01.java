package ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		String str = "string";
		int[] numbers = {1, 2};
		
		try {
			System.out.println(str.isEmpty());
			str.length();
			int number = numbers[3];
			foolish();
		}catch (Exception e) {
			System.out.println("���ܰ� ������ϴ�. ");
			System.out.println( e);
		}
//		catch (NullPointerException e) {
//			System.out.println("null�� ��ü�� ���ٽõ��� �߽��ϴ�.");
//			
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("�迭�� ������ �Ѿ���ϴ�. ");
//		}
		
		
	}
	
	public static void foolish() throws Exception{
		throw new Exception();
		
	}
	
}
