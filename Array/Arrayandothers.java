package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Arrayandothers {
	
	
	public static void main(String[]args) {
	
		 System.out.println("*************************************************"); 
	             int [] num = {5,10,15};
	              
	              
	             num[0]= 5;
	             num[1]=10;
	             num[2]=15;
	              
	             System.out.println(Arrays.toString(num));
	             System.out.println(num[2]);
	             
	             for(int i = 0; i<num.length; i++) {
	              
	            	 
	            	 System.out.println(" index of " + i+ "value " +num[i]);
	            		 
	             }	 
	             System.out.println("*******************"); 
	            	 int [] a = new int [4];
	            	 
	            	 a[0]=50;
	            	 a[1]= 10;
	            	 a[2]= 30;
	            	 a[3]= 70;
	            	 
	            	 System.out.println(a.length );
	            	 System.out.println(a[2]); 
	            	 System.out.println(Arrays.toString(a)); 
	            	 
	            	 for(int p = 0; p<4; p++) {
	            		 
	            		 System.out.println(a[p]);
	            		     		 
	            	    a[2]=100;
	            	    
	            	  
	            	 }
	            	 
	              
	            	 System.out.println("*******************");     
	             
	             ArrayList<String> ar = new ArrayList<String>();
	             
	             ar.add("Horse");
	             ar.add("Cow");
	             ar.add("Sheep");
	             
	             System.out.println(ar.get(2));
	             System.out.println(ar);
	             ar.add("Gongo");
	            ;
	             for (int t = 0; t<ar.size(); t++) {
	            	 
	            	 
	            	 System.out.println(ar.get(t));
	            	// ar.remove(1);
	            	 
	             }
	             System.out.println("*************************************************"); 
	             HashMap<String, String> name = new HashMap<String, String>();
	             
	             
					try {
						name.put("Jim","jimbo56");
						 name.put("","ronoiski8564");
						 name.put("Asad","Asa859746");

						
          
          System.out.println(name);
          System.out.println(name.get("Jim"));
          System.out.println(name.values());
          System.out.println(name.keySet());
					} catch (Exception e) {
						System.out.println("Everything is fine " +e);
						
					}
	
	             
      
	}           

	

}











