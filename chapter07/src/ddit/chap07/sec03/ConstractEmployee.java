package ddit.chap07.sec03;
//2)계약직 사원(ConstractEmployee)
//	- 속성 :  계약시작일(startDate : String)
//	       	계약기간(period : String)
//	       	계약급여(contractSalary : int)
//	- 메서드 : 정보출력(getInfo() : void)
//		 	 급여계산(calcSalary() : int)
public class ConstractEmployee extends Employees {

	private String startDate;
	private String period;
	private int contractSalary;
	
	ConstractEmployee(){}
	ConstractEmployee(long empID, String empName,
			String startDate, String period, int contractSalary){
		super(empID, empName);
		this.startDate = startDate;
		this.period = period;
		this.contractSalary = contractSalary;
		//부모에서 받은 거
		salary = contractSalary;
	}
	
	@Override
	public void getInfo() {
		//super 변수
		super.getInfo();
		System.out.println("계약일자: " + startDate);
		System.out.println("계약기간: " + period);
		System.out.println("월 지급액: " + salary);
	}
	
	
}
