package test02;

public class FountainPen extends Ballpen {
	
	 private String color; // ������ ��
	 
	 public FountainPen (int amount, String color) {
			super(amount, color);
			this.setAmount(amount);
			this.setColor(color);
	} 
		
//		public String getColor() { 
//	        return color; 
//	    }
//	    public void setColor(String color) { 
//	        this.color = color; 
//	    }
	    
//	    @Override
//		public void settingCondition() {
//			System.out.println("���� ������ " + this.getAmount() + "�� �ֽ��ϴ�. ���� " + this.color + "�Դϴ�.");
//		}

}
