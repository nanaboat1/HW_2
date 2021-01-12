package City;

 class Police extends Person implements Employee {
	public enum role {Patrol, Sargeant, Captain, Chief };
	
	private role _role; 
	private String salary; 
	private String EmployeeID; 

	public Police(String _name, String _age, String _phone_number, String _tax_id) {
		
		super(_name, _age, _phone_number, _tax_id);
		
		
		
	}

	public role get_role() {
		return _role;
	}

	public void set_role(role _role) {
		this._role = _role;
	}

	
	@Override
	public void paycheck(String _paycheck) {
		
		
	}

	@Override
	public String EmployeeID() {	
		return this.getEmployeeID();
	}

	/** 
	 * 
	 * @return Salary
	 */
	public String getSalary() {
		return salary;
	}
	
	/** 
	 * @param Salary of Person.
	 * */
	
	public void setSalary(String salary) {
		this.salary += salary;
	}

	/**
	 * @return the employeeID
	 */
	public String getEmployeeID() {
		return EmployeeID;
	}

	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}

}
