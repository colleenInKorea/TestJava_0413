package test01;

public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println("�۸�!!");	
	}
	
	public void wagsItsTail() {
		System.out.println("������");
	}

}
