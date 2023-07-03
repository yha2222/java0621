package pddit.chap07.sec09;
//3)임시직사원(TempEmployee)
//- 속성 :  월근무시간(workingHoursPerMonth : int)
//      	 시간당지급액(payAnHourly : int)
//- 메서드 : 정보출력(getInfo() : void)
//		 급여계산(calcSalary() : int)
public class TempEmployee extends Employees {
	int workingHoursPerMonth;
	int payAnHourly;
	
	TempEmployee(){}
	TempEmployee(long empId, String empName, int workingHoursPerMonth, int payAnHourly){
		super(empId, empName);
		this.workingHoursPerMonth = workingHoursPerMonth;
		this.payAnHourly = payAnHourly;
	}
	
	public void getInfo() {
		printInfo();
		System.out.println("시급: " + payAnHourly);
		System.out.println("월 근무시간: " + workingHoursPerMonth);
		System.out.println("월 지급액: " + calcSalary());
		
	}
	
	public int calcSalary() {
		
		return workingHoursPerMonth * payAnHourly;
	}
}
