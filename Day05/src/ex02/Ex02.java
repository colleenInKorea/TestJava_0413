package ex02;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//break ����
		int i = 0;
		while(true) {
			if(i == 5) {
				break;
			}
			System.out.println("Hello World");
			i++;
		}
		
		//continue ���� : 3�� ����϶� ¦�� ����Ͻÿ�.
//		for(i = 1; i <= 10; i++) {
//			if (i % 3 == 0) {
//				System.out.println("¦");
//			}else {
//				System.out.println(i);
//			}
//		}
		
		for(i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.println("¦");
				continue;
			}
				System.out.println(i);
		}
		
	}
}
