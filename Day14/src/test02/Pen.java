package test02;

public class Pen {
	
	private int amount;
	
	public Pen (int amount) {
		this.amount = amount;
	}
	
	public int getAmount() { 
        return amount; 
    }

    public void setAmount (int amount) {
        this.amount = amount; 
    }
    
    public void settingCondition() {
		System.out.println("���� ������ " + amount + "�� �ֽ��ϴ�. ");
	}

}
