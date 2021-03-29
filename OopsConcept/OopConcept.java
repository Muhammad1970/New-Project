package OopsConcept;



public class OopConcept {

	String a ="House";
	int b= 20;
	double c = 20.94;
	char d = 'J';
     int h;
    final String n = "American";
	final int v = 25;
	
       public static void main(String[]args) {
    	
    	OopConcept get = new OopConcept();
    	
        System.out.println(get.a);
    	System.out.println(get.b);
    	System.out.println(get.c);
    	System.out.println(get.d);
    	
    	get.h=100;   
    	System.out.println(get.h);
         
    	//get.n="African"; // will have error the final cannot be assigned
    	//get.v = 50; // will have error the final cannot be assigned
    	
    	System.out.println(get.n);
    	System.out.println(get.v);
    }	
    }