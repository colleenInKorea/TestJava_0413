package test01;

public class IPhone extends IPodTouch {
	// �� �̸��� �ڵ��� ��ȣ ���� �Ǵ� ���� �Է� 
	// �θ� Ŭ������ �״�� ��� ���� �ϱ⶧���� �״�� ����Ѵ�. 
	// �޼��� ���۰� ��ȭ�� ��ɸ� �߰� �ϸ� �ȴ�. 
	

	private String phoneNumber;
	
	public IPhone (String phoneNumber) {
		
		this.setModel("IPhone");
		this.phoneNumber = phoneNumber;
		
	}
	
	 public void sendingMessage(String message, String number) {
        System.out.println(number + "�� " + message + "������");
    }
	 
	 public void callingSomeone (String number) {
		 System.out.println(number + "�� ��ȭ��");
	 }
	 
	public void tellPhoneNumber() {
		System.out.println("��ȭ��ȣ : " + this.phoneNumber);
	}
	
	
	
	

}
