package ddit.chap07.sec05;

public class UnitTest {

	public static void main(String[] args) {
		Unit unit = new Unit("유닛");
		unit.move(1000, 5000);
		
		Marine marine = new Marine();
		marine.move(1000, 5000);
		
		Tank tank = new Tank();
		tank.move(1000, 5000);

	}

}
