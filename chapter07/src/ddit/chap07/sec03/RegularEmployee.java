package ddit.chap07.sec03;
//2. 자식클래스
//1)정규직사원(RegularEmployee)
//	- 속성 : 보너스(bonus : int)
//		       직책(jobTitle : String)
//		       연봉(totalSalaryPerYear : int)
//	- 메서드 : 정보출력(getInfo() : void)
//			 급여계산(calcSalary() : int)
public class RegularEmployee extends Employees {
	
	private int bonus;
	private String jobTitle;
	private int totalSalaryPerYear;
	
	RegularEmployee(){}
	RegularEmployee(long empID, String empName
			, int bonus, String jobTitle, int totalSalaryPerYear){
		super(empID, empName);
		this.bonus = bonus;
		this.jobTitle = jobTitle;
		this.totalSalaryPerYear = totalSalaryPerYear;
	}
	
	//
	public int calcSalary() {
		//salary = (totalSalaryPerYear+bonus)/12;
		//return salary;
		return (totalSalaryPerYear+bonus)/12;
	}
	
	@Override
	public void getInfo() {
		//부모클래스 생성자 메서드 부름.참조변수 => 부모 클래스 메소드 호출
		super.getInfo();
		System.out.println("직잭: " + jobTitle);
		System.out.println("월 지급액: " + calcSalary());
	}
	
}
