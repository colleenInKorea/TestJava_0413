package test03;

public class ChangeToInch extends ChangeUnit {
	
//	public ChangeToInch(double unit, String unitName) {
//		super(unit, unitName);
//	}
	
	public ChangeToInch(String originUnit, String newUnit) {
		super(originUnit, newUnit);
	}

	@Override
	public String changeUnit (double input) {
		double result = input/2.54;
		return this.getOriginUnit() + " " + input + "��  " + this.getNewUnit() + "�� ��ȯ�ϸ� " + result + "�Դϴ�. " ;
	}

}
