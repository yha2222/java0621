package pddit.chap07.sec09;

public class RegularEmployee extends Employees {
	int bonus;
	String jobTitle;
	int totalSalaryPerYear;
	
	RegularEmployee(int totalSalaryPerYear, int bonus, String jobTitle, long empId, String empName){
		super(empId, empName);
		this.totalSalaryPerYear = totalSalaryPerYear;
		this.bonus = bonus;
		this.jobTitle = jobTitle;
		
	}
	
	public void getInfo() {
		printInfo();
		System.out.println("직책: " + jobTitle);
		System.out.println("정규직 월급: " + calcSalary());
	}
	
	public int calcSalary() {
		return (totalSalaryPerYear + bonus) / 12;
	}
}
