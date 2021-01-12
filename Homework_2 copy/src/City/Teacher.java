package City;

public class Teacher extends Person implements Employee {
	
	private String grade_level; 
	private String certification;
	private String salary; 
	private String EmployeeID; 

	public Teacher(String _name, String _age, String _phone_number, String _tax_id, String _GradeLevel, String _cert) {
		
		super(_name, _age, _phone_number, _tax_id);
		
		this.setGrade_level(_cert);
		this.setGrade_level(_GradeLevel);
			
	}

	public String getGrade_level() {
		return grade_level;
	}

	public void setGrade_level(String grade_level) {
		this.grade_level = grade_level;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	@Override
	public void paycheck(String _paycheck) {
		this.setSalary(_paycheck);		
	}
	
	
	public String getSalary() {
		return salary;
	}

	private void setSalary( String salary) {
		this.salary += salary;
	}

	@Override
	public String EmployeeID() {
		
		return this.getEmployeeID(); 		
	}

	public String getEmployeeID() {
		return EmployeeID;
	}

	private void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}

	
	

}
