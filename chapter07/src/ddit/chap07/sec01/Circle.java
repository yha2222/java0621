package ddit.chap07.sec01;

public class Circle extends Shape {
	//상속 아님
	int radius;
	Point center;
	
	//Shape() {} 떄문에 사용 가능
	//  => 매개변수 없는 super(); => 매개변수 default 생성시 호출
	//  ==> 매개변수 없는 거 미리 써놔야 함
	Circle(){  		//Circle(){super()} 인데 생략되어 있음
		center = new Point();
	}  
	Circle(int radius, String color, String kind, Point center) {  //자식 클래스만 갖고 있는 값
		super(color, kind);  //Shape(String color){...}호출
		this.radius = radius;
		this.center = center;
	}
	
	//상속 아니고 고유 메소드
	public void getArea() {
		double area = radius * radius * 3.1415926;
		System.out.println("중심점의 좌표: " + center.getLocation());
		System.out.println("반지름: " + radius);
		System.out.println("원의 면적: " + area);
	}
}
