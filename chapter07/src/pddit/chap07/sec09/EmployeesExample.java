package pddit.chap07.sec09;

public class EmployeesExample {

	public static void main(String[] args) {
		Employees[] employees = {new RegularEmployee(50000,2500,"공동개발팀",23101002, "서정민"),
				new ConstractEmployee(23101003, "이쁜이","2023/01/03", "2", 3000)
				,new TempEmployee(23100101, "박남정", 188, 600)};
		
		for(Employees e:employees) {
			e.printInfo();
		}
		
		RegularEmployee re = new RegularEmployee(50000,2500,"공동개발팀",23101002, "서정민");
		re.calcSalary();
		re.getInfo();
		
		ConstractEmployee ce = new ConstractEmployee(23101003, "이쁜이","2023/01/03", "2", 3000);
		ce.getInfo();
		
		TempEmployee te = new TempEmployee(23100101, "박남정", 188, 600);
		te.calcSalary();
		te.getInfo();
	}

}
