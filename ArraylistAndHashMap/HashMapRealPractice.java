package ArraylistAndHashMap;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
 

public class HashMapRealPractice {

	public static void main(String[] args) {
		
              
		
		         HashMap <Integer, String> name = new HashMap<Integer, String>();
		
		
		            try {
						name.put(25, "Rahim");
						name.put(30, "Steve");
						name.put(45, "Samina");
						name.put(50, "James");
						
						System.out.println(name.get(45));
						System.out.println(name.keySet());
						System.out.println(name.values());
					} catch (java.lang.Exception e) {
						System.out.println("the value is good"+e);
					}
		            name.size();
		            for(Map.Entry entry:name.entrySet()){
		            
		            System.out.println(entry.getKey() + "=" + entry.getValue()  );
		            	
		            }
		            System.out.println("*****************************************************************");
		        ArrayList<String> nam = new ArrayList<String>();
		        
		        nam.add("Bull");
		        nam.add("25");
		        nam.add("C");
		        nam.add("26.5");
		        
		        System.out.println(nam);
		        System.out.println(nam.get(2));
		        
		        for(int p=0; p<nam.size(); p++) {
		        	
		        	
		        	System.out.println(nam.get(p));
		        	
		        }
		
		        int [] num= {10,20,25,30,65};
		        
		        num[0]=10;
		        num[1]=20;
		        num[2]=25;
		        num[3]=30;
		        num[4]=65;
		        
		        System.out.println(num[2]);
		        for(int k=0; k<num.length;k++) {
		        	
		        	System.out.println(num[k]);
		        	System.out.println(Arrays.toString(num));
		        	
		        	
		        }
		        
		        
		        
		
		
		
		
		
		
	}
}