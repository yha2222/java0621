package ddit.chap07.sec01;
//2)계약직 사원(ConstractEmployee)
//- 속성 :  계약시작일(startDate : String)
//       	계약기간(period : String)
//       	계약급여(contractSalary : int)
//- 메서드 : 정보출력(getInfo() : void)
//	 	 급여계산(calcSalary() : int)
public class Prac03 extends Prac01 {
	private String startDate;
	private String period;
	private int contractSalary;
	
	Prac03(){}
	Prac03(long empID, String empName,String startDate, String period, int contractSalary){
		super(empID, empName);
		this.startDate = startDate;
		this.period = period;
		this.contractSalary = contractSalary;
	}
	
	public int calcSalary() {
		return 5;
	}
	
	@Override
	public void printInfo() {
		
	}
}
