package test03;

public class CheckWeightInfor extends HealthInfor {
	
	public CheckWeightInfor (String name, double height, double weight) {
		super(name, height, weight);
	}
	
	public void calculateWeight() {
		double standardWeight = (this.getHeight() - 100) * 0.9;
		double BMI = (this.getWeight() - standardWeight)/ standardWeight *100;
		
		if(BMI < 10) {
			this.showInfo();
			System.out.println("정상입니다.");
		}else if (BMI < 20 || BMI > 10) {
			this.showInfo();
			System.out.println("과체중입니다.");
		}else {
			this.showInfo();
			System.out.println("비만입니다.");
		}
	}

}
