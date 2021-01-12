package City;

import java.util.ArrayList;

public class Building {
	
	private String name; 
	private String address;
	
	private ArrayList<Person> occupants = new ArrayList<Person>();
	
	public Building(String _name, String _address) {
		
		this.name = _name; 
		this.address = _address; 
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the occupants
	 */
	public ArrayList<Person> getOccupants() {
		return occupants;
	}

	/**
	 * @param occupants the occupants to set
	 */
	public void setOccupants(ArrayList<Person> occupants) {
		this.occupants = occupants;
	} 
	
	/**
	 * @param Occupants to add
	 */
	public void addToOccupants(Person _person) {
		
		occupants.add(_person);
	}
}
