package JavaProject;

import java.util.ArrayList;

public class ArrayListnew {

	public static void main(String[] args) {
	
		
		 ArrayList<Integer> Year = new ArrayList<Integer>();
		 Year.add(2015);
		 Year.add(2016);
		 Year.add(2017);
		 Year.add(2018);
		 Year.add(2020);
		 
		 for (int i = 0; i<Year.size(); i=2+i) {
			 
			 
			 System.out.println(Year.get(i));
			System.out.println("********************");
		 }
		
		

		 ArrayList<Integer> car = new ArrayList<Integer>();
		 car.add(2015);
		 car.add(2016);
		 car.add(2017);
		 car.add(2018);
		 car.add(2020);
		 car.add(2014);
		 car.add(2021);
		 car.add(2022);
		 car.add(2023);
		 car.add(2024);
		 
		 
		// for (int i = 0; i<Year.size(); i=4+i) {
			 
			 
			// System.out.println(Year.get(i));
		 
	
	
          for (int i = 2 ; i<car.size(); i=i+3)
          
         System.out.println(car.get(i));
         
          
          {
        	  
        	 // System.out.println(i);
        	  
          }
	
	}
}
	


