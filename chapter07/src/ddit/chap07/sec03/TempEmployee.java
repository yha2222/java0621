package ddit.chap07.sec03;
//3)임시직사원(TempEmployee)
//	- 속성 :  월근무시간(workingHoursPerMonth : int)
//	      	 시간당지급액(payAnHourly : int)
//	- 메서드 : 정보출력(getInfo() : void)
//			 급여계산(calcSalary() : int)
public class TempEmployee extends Employees {
	private int workingHoursPerMonth;
	private int payAnHourly;
	
	TempEmployee(){}
	TempEmployee(long empID, String empName, int workingHoursPerMonth, int payAnHourly){
		super(empID,empName);
		this.workingHoursPerMonth = workingHoursPerMonth;
		this.payAnHourly = payAnHourly;
		//salary = payAnHourly * workingHoursPerMonth;
	}
	
	public int calcSalary(){
		return payAnHourly * workingHoursPerMonth;
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("시급: " + payAnHourly);
		System.out.println("월 근무시간: " + workingHoursPerMonth);
		System.out.println("월 지급액: " + calcSalary());
	}
}
