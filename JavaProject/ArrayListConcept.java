package JavaProject;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		// This is non-generic ArrayList
		ArrayList arr = new ArrayList();
		
		arr.add("bingo");
		arr.add(20);
		arr.add('M');
		arr.add("02/11/1990");
		arr.add(true);
		arr.add(29.5);
		
		
		for (int i=0; i<arr.size();i++) {
		System.out.println(arr.get(i));
		

	}

		// Generic ArrayList
		
		ArrayList <Integer> ar = new ArrayList <Integer> ();
		
		ar.add(10);
		ar.add(50);
		ar.add(60);
		ar.add(55);
		System.out.println("  ");
		
		System.out.println("This is value size " +ar.size()); 
			
		System.out.println("  ");
			
			System.out.println(ar.get(2) );
			
			
			for(int b = 0; b<ar.size(); b++) {
				
			System.out.println(ar.get(b));
			System.out.println("");
				
			}
		
			
	   EmployeeIterator emp1 = new EmployeeIterator("Lana", 40, "QA", 1236456);
	   EmployeeIterator emp2 = new EmployeeIterator("James", 29, "Dev", 5961316);
	   EmployeeIterator emp3 = new EmployeeIterator("Corey", 44, "Admin", 841584);
	   EmployeeIterator emp4 = new EmployeeIterator("Junaid", 26, "HR", 761696);
	   EmployeeIterator emp5 = new EmployeeIterator("Betsy", 38, "Financial", 5649474);
	   
	   
	   ArrayList<EmployeeIterator> ari = new ArrayList<EmployeeIterator>();
	   ari.add(emp1);
	   ari.add(emp2);
	   ari.add(emp3);
	   ari.add(emp4);
	   ari.add(emp5);
	   
	   // using iterator
	   // we have to use while loop because it is not integer anymore,  it is objects now
	   
	  Iterator<EmployeeIterator> ary = ari.iterator();
	  while(ary.hasNext()){
	  EmployeeIterator emp = ary.next();
	 
	   System.out.println(emp.name );
	   System.out.println(emp.age);
	   System.out.println(emp.Dept );
	   System.out.println(emp.empno );
	   System.out.println("**************");
	  }
	  
       ArrayList<String> arm = new ArrayList<String>();
       
       arm.add("Selenium");
       arm.add("Agile");
       arm.add("Webdriver");
	  
    
       ArrayList<String> arm1 = new ArrayList<String>();
       arm1.add("pool");
       arm1.add("kool");
       arm1.add("Rude");
       
       arm1.addAll(arm);
       
       for (int p=0; p<arm1.size(); p++) {
    	   
    	   System.out.println(arm1.get(p));
    	   
       }
	  
       
	}
}

