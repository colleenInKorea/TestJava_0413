package ex01;

public class Dog extends Animal{
	
	public Dog(String name){
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println("�۸�");
		
	}
	
	public void fishTail() {
		System.out.println("�κ�κ�");
	}
}
