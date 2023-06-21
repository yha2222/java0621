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
		System.out.println("반지름: " + radius);
		System.out.println("중심점 좌표: " + center.getLocation());
		System.out.println("원 면적: " + area);
	}
}
