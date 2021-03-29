package ArraylistAndHashMap;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;

public class ArrayArrayListHashMapTryCatch {

	public static void main(String[] args) {
              
		    // static Array with different datatype
		    int a[] = {10,15,20,25};
		    System.out.println("**********" );
		    System.out.println(Arrays.toString(a));
		    
		    System.out.println(a[3]);// value is 25
		    
		    for(int r = 0;r<a.length; r++){
		    System.out.println(a[r]);
		    
		   a [2]=100;
		   
		    
		    }
		    
		    System.out.println("**********" );
		    String [] b = {"Cup", "Jug", "Kettle"};
		    System.out.println(Arrays.toString(b));
		    System.out.println(b[2]);
		    for(int s = 0; s<b.length; s++){
		    	System.out.println(b[s]); 
		    b[2]= "Blue";
		    }
		   
		    System.out.println("**********" );
		    char [] c = {'B', 'C', 'D'};
		    System.out.println(Arrays.toString(c));
		    System.out.println(c[2]);
		    for(int t = 0; t<c.length; t++) {
		    	
		    	System.out.println(c[t]);
		    c[0] = 'H';
		    	
		    }
		    
		    System.out.println("**********" );
		   
		    double [] d = {12.95, 13.66, 10.48};
		    System.out.println(Arrays.toString(d));
		    System.out.println(d[1]);  
				
			for(int w =0; w<d.length;w++) {
				
				
				System.out.println(d[w]);
			d[1]= 19.99;
				
			}
			
			
			 System.out.println("***********************Array***************************************");
			 // ArrayList
		    ArrayList<String> value = new ArrayList<String>();
		    
		    try {
				value.add("people");
				value.add("10");
				value.add("B");
				value.add("12.95");
				
				System.out.println(value.get(2));
				System.out.println(value);
			} catch (Exception e1) {
				
				
			}
		    for(int h =0; h<value.size(); h++) {
		    	
		    	
		    	System.out.println(value.get(h));
		    	
		    	}
		    
		    System.out.println("*************************ArrayList*************************************");
		    
		    // HashMap
		    HashMap<String, String> Country = new HashMap<String, String>();
		    
		    try {
		    	Country.put("Mumbai", "India");
		    	Country.put("Karachi", "Pakistan");
		    	Country.put("Houston", "Texas");
		    	Country.put("Rome", "Italy");
				System.out.println(Country);
				System.out.println(Country.values());
				System.out.println(Country.keySet());
			} catch (Exception e) {
				  System.out.println("if this going to work" +e);
			}
		    finally {
		    	
		    	System.out.println("wow tell me " );
		    }
		    //for(Map.Entry pairEntry: name.entrySet()) {
		    	
		   // System.out.println(pairEntry.getKey()+ ":" + pairEntry.getValue());
		    System.out.println("**********************HashMap****************************************");

             for(Map.Entry<String, String> entry: Country.entrySet()) {
            	 
            	System.out.println(entry.getKey() + " is the City of " + entry.getValue());
            	 
            	 
		    	
		    
		    
		    }
             System.out.println("**********************Hashtable****************************************");
		    Hashtable<Integer, String>ar = new Hashtable <Integer, String>();
		    
		    
          ar.put(10, "Phone");	    
          ar.put(5, "Bag");  
          ar.put(15, "Java"); 
          ar.put(20, "House"); 
          
          System.out.println( ar);
          
          ar.get(2);
          
          for(Map.Entry<Integer, String> map: ar.entrySet());
          System.out.println(ar);
		    
		    
	}
		   
	

	}


