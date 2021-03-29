package ArraylistAndHashMap;


import java.util.ArrayList;

public class ArrayListNewInClassNotes {

	public static void main(String[] args) {
	
		// Arraylist is a collection. Q1. do you have experience with collection.
		// There are different types of collections like Array, ArrayList, HashMap.
		// Arraylist and hashmap wideley use collection
		// interview Q1.how we access the arralist, we use index to access indiviual value
		 ArrayList<String> ar = new ArrayList<String>();
		 
		 ar.add("Bmw");
		 ar.add("Nissan");
		 ar.add("Ford");
		 ar.add("Toyota");
		 ar.add("Hyduai");
		 
		// System.out.println(ar);
		// System.out.println(ar.get(0));
		 
		 
		// System.out.println(ar.remove(1));
		// System.out.println(ar);
		 // to replace the value
		//System.out.print(ar.set(3, "Mercedes"));
		// System.out.println(ar);
		
          System.out.println(ar.get(3));
          }

}
