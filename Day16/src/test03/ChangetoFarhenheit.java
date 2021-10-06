package test03;

public class ChangetoFarhenheit extends ChangeUnit {
	
//	public ChangetoFarhenheit(double unit, String unitName) {
//		super(unit, unitName);
//	}
	
	public ChangetoFarhenheit(String originUnit, String newUnit) {
		super(originUnit, newUnit);
	}

	@Override
	public String changeUnit(double input) {
		double result = (input * 9/5.0) + 32;
		return this.getOriginUnit() + " " + input + "��  " + this.getNewUnit() + "�� ��ȯ�ϸ� " + result + "�Դϴ�. ";
	}

}
