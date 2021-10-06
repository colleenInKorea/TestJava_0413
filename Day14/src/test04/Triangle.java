package test04;

import ex02.PersonInfor;

public class Triangle {
	
	private int height;
	private int width;
	
	
	public Triangle (int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public double calculateErea() {
		double erea = (height * width)/2.0;
		return erea;
	}
	
	@Override
	public String toString() {
		String result = this.width +" �� " + this.height +" �� �ﰢ���� ���̴� " + this.calculateErea();
		return result;
	}
	
	public boolean equals(Object obj) {
		Triangle triAngle = (Triangle)obj;
		//���� �ٸ� �ﰢ�� �ν�
		
		if(this.calculateErea() == triAngle.calculateErea()) {
			return true;
		}
		return false;
	}
}
