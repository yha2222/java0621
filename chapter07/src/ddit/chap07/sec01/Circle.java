package ddit.chap07.sec01;

public class Circle extends Shape {
	//��� �ƴ�
	int radius;
	Point center;
	
	//Shape() {} ������ ��� ����
	//  => �Ű����� ���� super(); => �Ű����� default ������ ȣ��
	//  ==> �Ű����� ���� �� �̸� ����� ��
	Circle(){  		//Circle(){super()} �ε� �����Ǿ� ����
		center = new Point();
	}  
	Circle(int radius, String color, String kind, Point center) {  //�ڽ� Ŭ������ ���� �ִ� ��
		super(color, kind);  //Shape(String color){...}ȣ��
		this.radius = radius;
		this.center = center;
	}
	
	//��� �ƴϰ� ���� �޼ҵ�
	public void getArea() {
		double area = radius * radius * 3.1415926;
		System.out.println("�߽����� ��ǥ: " + center.getLocation());
		System.out.println("������: " + radius);
		System.out.println("���� ����: " + area);
	}
}
