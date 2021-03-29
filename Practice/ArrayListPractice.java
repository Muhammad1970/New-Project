package Practice;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListPractice {

	public static void main(String[] args) {
		
	           ArrayList<String> ar = new ArrayList<String>();
		       
		       try {
				ar.add("Brown");
				   ar.add("Black");
				   ar.add("White");
				   ar.add("Beige");
				   
				   System.out.println(ar);
				   System.out.println(ar.get(2));
				   System.out.println(ar.size());
			} catch (Exception e) {
				System.out.println("this is good " + e);
			}
		       System.out.println("this is good " );{
		    	   
		       }
		       
		       
		       for(int b = 0; b<ar.size(); b++) {
		    	   
		    	System.out.println(ar.get(b));
		    	   
		       }
		     System.out.println("********************************************************");
		       int []a = {1,2,3,4,5,6,7,8,9};
		       
		       
		       a[0]=1;
		       a[1]=2;
		       a[2]=3;
		       a[3]=4;
		       a[4]=5;
		       a[5]=6;
		       a[6]=7;
		       a[7]=8;
		       a[8]=9;
		      
		       
		       
		 
		  /* for(int c=1; c<a.length; c=c+2) {
			   
			   System.out.println(a[c]);*/
			   a[1]=25;
			   
			   System.out.println(a[1]);
		   
		     System.out.println("***************************************************************************************************************************");
	
	         HashMap<String, String> hash = new HashMap<String, String>();
	         
	         hash.put("Karachi", "Pakistan");
	         hash.put("Cracas", "Venezuela");
	         hash.put("Columbia", "Bogota");
	         hash.put("Cairo", "Egypt");
	         
	          System.out.println(hash);
		    	   
              System.out.println(hash.keySet());
	          System.out.println(hash.values());
	          
	          System.out.println( hash.remove("Cracas"));
	          
	          System.out.println("***************************************************************************************************************************");
	          
	          
	          
	          
	          
	          
		       
	         
	      
	
	}
		
}
	


