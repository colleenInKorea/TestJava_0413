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
        // �⺻ ������ do nothing
    }


    public void showInfo() {
        System.out.println(name + "���� ���� " + height + ", ������ " + weight + "kg �Դϴ�.");
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
