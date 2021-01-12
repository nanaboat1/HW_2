package City;

import java.util.Random; 
import java.lang.String;
import java.util.ArrayList;

public class City {
	
	public String city_name;
	public ArrayList<Building> block = new ArrayList<Building>(); 
	public ArrayList<Person> residents = new ArrayList<Person>();
	public enum role {Patrol, Sargeant, Captain, Chief };
	

	public static void main(String[] args) {
		

		City test = new City();
		test.city_name = "Heavenly";
		
		
		// Create Person's Object. 
		Police res_1 = new Police("Holy", "17" ,"555-555", "0718");
		Police res_2 = new Police("Heaven", "21", "444-444", "4789");
		Kid child = new Kid("Trust", "22", "333-333", "7896");
		Teacher tech_1 = new Teacher("Obey", "34", "222-222", "7896", "HighSchool", "University"); 
		Teacher tech_2 = new Teacher("Pray", "43" ,"111-111", "7548", "MiddleSchool","University");
		
		Person[] occupy = { res_1, res_2, child, tech_1, tech_2}; 
		
		Building[] build = { (Building) new School("Good", "Goodness Street"), (Building) new City_Hall("Great", "Greatness Street")};
		
		
		// Move All Person's to ArrayList
		for ( int i=0; i< 5; i++ ) {
			
			test.residents.add(occupy[i]);
			
		}
		
		// Output names of Person's in City
		for ( int i=0; i<5; i++ ) {
			
			System.out.println( "Names of Person's are ");
			System.out.println("-----------------------");
			System.out.println(test.residents.get(i).get_name());
		}
		
		// Output names of Buildings 
		for ( int i=0; i<2; i++ ) {
			
			System.out.println("Names of Buildings");
			System.out.println("------------------");
			System.out.println(build[i].getName()); 
		}
		
		
		// Add People to School
		build[0].addToOccupants(occupy[0]);
		build[0].addToOccupants(tech_2);
		build[0].addToOccupants(child);
		
		// Add People to City Hall
		build[1].addToOccupants(res_2);
		
		
		
		
		
		
		
	}

}
