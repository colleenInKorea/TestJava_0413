package test03;

public class HealthInfor {
	
	protected String name;
    protected double height;
    protected double weight;

    public HealthInfor (String name, double height, double weight) {
    	this.name = name;
    	this.height = height;
    	this.weight = weight;
    }
    
    public HealthInfor() {
        // 기본 생성자 do nothing
    }


    public void showInfo() {
        System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + "kg 입니다.");
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

}
