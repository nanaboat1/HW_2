package City;

public class Kid extends Person {
	
	public enum Flavor { choclate, strawberry, vanilla }; 
	
	private Flavor _flav; 

	public Kid(String _name, String _age, String _phone_number, String _tax_id) {
		
		super(_name, _age, _phone_number, _tax_id);
		

		
	}

	public Kid(String _name, String _age, String _phone_number) {
		// TODO Auto-generated constructor stub
	}

	public Flavor get_flav() {
		return _flav;
	}

	public void set_flav(Flavor _flav) {
		this._flav = _flav;
	}

}
