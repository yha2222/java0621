package pddit.chap07.sec09;

public class Employees {
	protected long empId;
	protected String empName;
	protected int salary;
	
	Employees(){}
	Employees(long empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	
	public void printInfo() {
		System.out.println("---------------------");
		System.out.println("아이디: " + empId);
		System.out.println("이름: " + empName);
	}
}
