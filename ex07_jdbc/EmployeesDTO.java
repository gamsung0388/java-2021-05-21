package ex07_jdbc;
//원래는 다 만들어야하는 원칙
public class EmployeesDTO {
	private int employee_id; 
	private String Hire_date;
	private String first_name; 
	private int salary;
	
	public EmployeesDTO() {
		super();
	}
	public EmployeesDTO(int employee_id, String first_name,String Hire_date, int salary) {
		super();
		this.Hire_date = Hire_date;
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.salary = salary;
	}
	public String getHire_date() {
		return Hire_date;
	}
	public void setHire_date(String hire_date) {
		Hire_date = hire_date;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeesDTO [employee_id=" + employee_id + ", Hire_date=" + Hire_date + ", first_name=" + first_name
				+ ", salary=" + salary + "]";
	}
	
	
}
