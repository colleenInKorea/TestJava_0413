package test02;

public class SharpPencil extends Pen {//�����潽
	
	private double width; //�汽��
	
	public SharpPencil (int amount, double width) {
		super(amount);
		this.setAmount(amount);
		this.width = width;
	}
	
	
	@Override
	public void settingCondition() {
		System.out.println("���� ������ " + this.getAmount() + "�� �ֽ��ϴ�. �β��� " + this.width + "�Դϴ�.");
	}

}
