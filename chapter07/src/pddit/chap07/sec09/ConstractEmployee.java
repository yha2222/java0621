package pddit.chap07.sec09;
//2)계약직 사원(ConstractEmployee)
//- 속성 :  계약시작일(startDate : String)
//       	계약기간(period : String)
//       	계약급여(contractSalary : int)
//- 메서드 : 정보출력(getInfo() : void)
//	 	 급여계산(calcSalary() : int)
public class ConstractEmployee extends Employees {
	private String startDate;
	private String period;
	private int constractSalary;
	
	ConstractEmployee(){}
	ConstractEmployee(long empId, String empName, String startDate, String period, int constractSalary){
		super(empId, empName);
		this.startDate = startDate;
		this.constractSalary = constractSalary;
		this.period = period;
		salary = constractSalary;
	}
	
	public void getInfo() {
		printInfo();
		System.out.println("계약일자: " + startDate);
		System.out.println("계약기간: " + period);
		System.out.println("월 지급액: " + salary);
	}
}
