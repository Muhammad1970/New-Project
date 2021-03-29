package JavaProject;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayNewOne {

	public static void main(String[] args) {
	 
		/*
		
		            int[] a = {1,2,3,4,5};
		            
		            System.out.println(a[0]);
		            
		            System.out.println(Arrays.toString(a));
		        	   
		          */
		           
		        	 // you have experice woring with collection. hasmap is double value , Arraylist we use new we create new object
		            // string can take everything char string integer double
		          // .add method ()
		           ArrayList<String> ar = new ArrayList<String>();
		           
		           ar.add("Nissan");
		           ar.add("bmw");
		           ar.add("Toyota");
		           ar.add("volvo");
		           System.out.println(" we have available " +ar);
		           // to change the value move one out to put another
		           //System.out.println(ar.get(2));
		           System.out.println(ar.set(1, "jaguar"));
		           System.out.println(ar);
		           
		           System.out.println(ar.remove(0));
		           System.out.println(ar);  
		            
		          for (int p = 0; p<ar.size(); p++) {
		        	  
		        	 ArrayList<Integer> rt = new ArrayList<Integer>(); 
		        	  System.out.println(rt);
		        	  
		          }
		            

	}

}
