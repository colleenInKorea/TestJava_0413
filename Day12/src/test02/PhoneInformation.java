package test02;

public class PhoneInformation {
	
	private String brand;
	private String modelName;
	private String modelCode;
	private String phoneNumber;
	
	public PhoneInformation(String brand, String modelName, String modelCode, String phoneNumber) {
		
		this.brand =brand;
		this.modelName =modelName;
		this.modelCode = modelCode;
		this.phoneNumber = phoneNumber;
		
	}
	
	public void callingSomeone() {
		System.out.println(this.getPhoneNumber() + "�� ��ȭ�� �̴ϴ�. �Ѹ�������....");
	}
	public void sendingSomeone() {
		System.out.println(this.getPhoneNumber() + "�� \"�ڴ�?\" �޼����� �����մϴ�. ");
	}
	

	public String getBrand() {
		return brand;
	}
	public String getModelName() {
		return modelName;
	}
	public String getModelCode() {
		return modelCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

	
	
	
}
