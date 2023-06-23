package ddit.chap07.sec01;
//2. 자식클래스
//1)정규직사원(RegularEmployee)
//	- 속성 : 보너스(bonus : int)
//		       직책(jobTitle : String)
//		       연봉(totalSalaryPerYear : int)
//	- 메서드 : 정보출력(getInfo() : void)
//			 급여계산(calcSalary() : int)
public class Prac02 extends Prac01 {
	//RegularEmployee
	private int bonus;
	private String jobTitle;
	private int totalSalaryPerYear;
	
	Prac02(){}
	Prac02(long empID, String empName,int bonus, String jobTitle, int totalSalaryPerYear){
		super(empID, empName);
		this.bonus = bonus;
		this.jobTitle = jobTitle;
		this.totalSalaryPerYear = totalSalaryPerYear;
	}
	
	public int calcSalary() {
		return (totalSalaryPerYear+bonus)/12;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("월급: "+ calcSalary());
		System.out.println("직책: " + jobTitle);
	}
}
