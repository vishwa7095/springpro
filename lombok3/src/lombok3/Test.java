package lombok3;

public class Test {

	public static void main(String[] args) {
		Employee employee=Employee.builder()
								.empId(101)
								.empName("vinodh")
								.empSalary(20000)
								.build();
		System.out.println(employee);
	}

}
