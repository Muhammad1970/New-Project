package JavaProject;

public class PolymorphismMethodOverloading {
	
            public  void Method1(int a, double b) {
	    	  
	    	  System.out.println(a-b);
	    	  }
	     public  void Method1(int a, String Nexttech) {
	    	 
	    	 System.out.println(a+Nexttech);
	    	  }
        public  void Method1(String c, char n) {
	    	 
	    	 System.out.println("Good Evening");
	    	 
	     }
	     public  void Method1(char j, int l) {
	    	 
	    	 System.out.println("Good Night");
	    	 
	    	  }
	    	 
	     public  void main(String[]args) {
        	
        	
        	PolymorphismMethodOverloading Get = new PolymorphismMethodOverloading ();	
        	
         Get.Method1(50, 60);
        
        
        } 	
        	
        }












