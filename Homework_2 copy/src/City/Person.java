package City;
/**
 * The Person Base Class models the basic behavior and attribute of a Person.
 * 
 * @author Nana Boateng Amoah
 * @version 1.0 
 * @since 2021-01-10 
 * 
 * */


import java.lang.String; // The String Class for Java

public abstract class Person {
	
	
	
	private String name; 
	private String age; 
	private String phone_number; 
	private String tax_id; 
	
	
	/***
	 * 
	 * @param _name Name of Person 
	 * @param _age Age of Person 
	 * @param _phone_number Phone number of Person 
	 * @param _tax_id Tax iD of Person 
	 */
	 public Person(String _name, String _age, String _phone_number, String _tax_id) {
		
		name = _name; 
		age = _age; 
		phone_number = _phone_number; 
		tax_id = _tax_id;  
		
	}
	
	/**
	 * Default Constructor 
	 * */
	

	/** Gettor's and Settor's */ 
	
	public void set_name(String _name ) {this.name = _name; }
	
	public void set_age(String _age ) { this.age = _age; }
	
	public void set_phonenumber(String _phone_number ) { this.phone_number = _phone_number; } 
	
	public void set_tax_iD(String _tax_id ) { this.tax_id = _tax_id; } 
	
	
	public String get_name() { return this.name; } 
	
	public String get_age() { return this.age; }
	
	public String get_phoneNumber() { return this.phone_number; }
	
	public String get_tax_id() { return this.tax_id; } 
	
	
	
	

}

	
