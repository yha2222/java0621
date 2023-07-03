package pddit.chap07.sec09;

public class Cylinder extends Circle {

	double height;
	
	Cylinder(){
		
	}
	
	Cylinder(Circle circle, double height){
		super(circle.radius, circle.PI);
		this.height = height;
	}
	
	Cylinder(double radius, double PI, double height){
		super(radius, PI);
		this.height = height;
	}
	
	public static void main(String[] args) {
		Cylinder cd1 = new Cylinder();
		cd1.radius = 2.8;
		cd1.height = 5.6;
		cd1.print();
		
		Cylinder cd2 = new Cylinder(new Circle(2.8), 5.6);
		cd2.print();
	}
	
	//원기둥의 부피 
	public double getVolume() {
		return radius * radius * height * PI;
	}
	
	public void print() {
		System.out.println("원: " + getArea());
		System.out.println("원통의 부피: " + getVolume());
	}

}
