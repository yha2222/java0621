package pddit.chap07.sec09;

public class DriveExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //자동형변환 : Vehicle vehicle = bus;
		driver.drive(taxi);

	}

}
