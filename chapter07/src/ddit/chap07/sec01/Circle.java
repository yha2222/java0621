package ddit.chap07.sec01;

public class Circle extends Shape {

	int radius;
	Point center;
	
	Circle(){  		//Circle(){super()}
		center = new Point();
	}  
	Circle(int radius, String color, String kind, Point center) {
		super(color, kind);  //Shape(String color)
		this.radius = radius;
		this.center = center;
	}
	
	public void getArea() {
		double area = radius * radius * 3.1415926;
		System.out.println("�߽����� ��ǥ: " + center.getLocation());
		System.out.println("������: " + radius);
		System.out.println("���� ����: " + area);
	}
}
