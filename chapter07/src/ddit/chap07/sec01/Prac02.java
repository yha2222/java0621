package ddit.chap07.sec01;

public class Prac02 extends Prac01 {
	int radius;
	Prac03 center;
	
	Prac02(){
		center = new Prac03();
	}
	
	Prac02(int radius, String color, String kind, Prac03 center){
		super(color, kind);
		this.radius = radius;
		this.center = center;
	}
	
	public void getArea() {
		double area = radius*radius*3.1415926;
		System.out.println("������: " + radius);
		System.out.println("�߽��� ��ǥ: " + center.getLocation());
		System.out.println("�� ����: " + area);
	}
}
