package JavaProject;

import java.util.HashMap;

public class HashMapInClass {

	public static void main(String[] args) {
	
		// hashmap datatype (key/index).datatype2 (value)>varuable name = new hashmap and again old.
	HashMap<Integer, String> country = new HashMap<Integer, String>();
		
	// STORE PAIRED VALUE
	/*	country.put(1, " England ");
		country.put(2," America ");
		country.put(3, " USA ");
		country.put(4, " Germany ");
		
		for(String i:country.keySet()) {
			
			
			System.out.println("Key " + i + "values " + country.get(i));
		}
		}
		*/
		/*System.out.println(country.size());
		
		// print by number
		HashMap<Integer, String> country2 = new HashMap<Integer, String>();
		
		country2.put(1, " Pakistan ");
		country2.put(2, " England ");
		country2.put(3,  " USA");
		country2.put(4, "Germany");
		
		
		
		System.out.println(country2.get(1));
		System.out.println(country2);
		
		
		// printing up and down
       HashMap<String, String> country3 = new HashMap<String, String>();
		
		country3.put("Karachi", " Pakistan ");
		country3.put("London", " England ");
		country3.put("Los Angles",  " USA");
		country3.put("Berlin", "Germany");
		

			for(String i:country3.keySet() ){
				
				System.out.println("key " + i + "values" + country3.get(country3));
			
		}
		
		
		
		
		*/
	
			

/*HashMap<Integer, String> country2 = new HashMap<Integer, String>();
		
		country2.put(1, " Pakistan ");
		country2.put(2, " England ");
		country2.put(3,  " USA");
		country2.put(4, "Germany");
		
		
		
		System.out.println(country2.get(1));
		System.out.println(country2);
	}
	*/


		
HashMap<String, String> country3 = new HashMap<String, String>();
		
		try {
			country3.put("Karachi", " Pakistan ");
			country3.put("London", " England ");
			country3.put("Los Angles",  " USA");
			country3.put("Ber", "Germany");
		} catch (Exception e) {
			
			System.out.println("all bad");
			
		}
		

			for(String l:country3.keySet() ){
				
				System.out.println(" key =" + l + "  values = " + country3.get(l));
			
		
			}
	}
}
		
