package ddit.chap07.sec03;

public class EmployeesExample {

	public static void main(String[] args) {
		//Employees[] employees = new Employees[300];
		//employees[0] = new RegularEmployee(23101002, "서정민", 2500,"공동개발팀",50000);
		//employees[1] = new ConstractEmployee(23101003, "이쁜이","2023/01/03", "2", 3000);
		//employees[2] = new TempEmployee(23100101, "박남정", 188, 600);
		
		//다형성 
		Employees[] employees = {new RegularEmployee(23101002, "서정민", 2500,"공동개발팀",50000),
				new ConstractEmployee(23101003, "이쁜이","2023/01/03", "2", 3000)
				,new TempEmployee(23100101, "박남정", 188, 600)};
		
		for(Employees e: employees) {
			e.getInfo();
		}
		
//		RegularEmployee re = new RegularEmployee(23101002, "서정민", 2500,"공동개발팀",50000);
//		re.calcSalary();
//		re.getInfo();
		
//		ConstractEmployee ce = new ConstractEmployee(23101003, "이쁜이","2023/01/03", "2", 3000);
//		ce.getInfo();
		
//		TempEmployee te = new TempEmployee(23100101, "박남정", 188, 600);
//		te.calcSalary();
//		te.getInfo();
	}

}
