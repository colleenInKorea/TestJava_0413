package ex02;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//��Ƽ Thread ����� ���
		
		//Thread Ŭ���� ���
		ThreadExtends thread1 = new ThreadExtends("***");
		ThreadExtends thread2 = new ThreadExtends("###");
//		thread1.run();
		
		//thread����
		thread1.start();
		thread2.start();
		System.out.println("main thread");
		
		//thread1 �� ���� �ɶ����� ��� �Ѵ�. �׵ڿ� ����
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		ThreadImpli ti1 = new ThreadImpli("@@@");
		ThreadImpli ti2 = new ThreadImpli("&&&");
		//Runnable ���� ���̽��� ��� 
		Thread thread3 = new Thread(ti1);
		Thread thread4 = new Thread(ti2);
		
		thread3.start();
		thread4.start();
		
		
	}

}
