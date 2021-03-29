package ElseIFConditionwithTryCatch;

public class ElseIfConditionwithThrow {
	
	
	 static void checkage  (int age) {
		
		
		
		if(age <25) {
		
		
		throw new ArithmeticException("Access denied -  You must be 27 years old");
		
	}
	  
		
		else {
			
			System.out.println("Access Granted - You are old enough");
			
		}
	    }
		
		static void checkbalance(int num) {
			
			
			if(num<700) {
				
				throw new ArithmeticException("You do not have sufficent balance");
				
			}
			
			else
			{
				
				System.out.println("You have enough money in Account");
				}
			}
		
		
		
		
		/*  static void name (String name) {
			  
			  
			  if(name.equals(name)) {
				  
				  
				  throw new ArithmeticException("Your name does not match with file");
				  
				  
				  
			  }
			  
			  else {
				  
				  System.out.println("Your name matches with the file");
				  
				  
			  }
			  
			  
			  
		  }
		  */
				  
				  
		    static void checkage2 (int age) {
			  
			  
		
				  
				 try {
					if (age<50) {
						 
						 
						
						 
						 
						throw new ArithmeticException("your are too old for this - Access not granted- Access denied");
						 
					 }
					  
					 else {
						 
						 
						 System.out.println("you are young enough - Access granted");
						 
						 
					 }
				} catch (java.lang.Exception e) {
					System.out.println("your are good to go " +e);
				}
			
			}
			  
		    
			  
			  
			  
		  
	 
		public static void main(String[] args) {
			
			checkage(25);
			checkbalance(700);
			//name("Sony");
			checkage2(15);
		}
	 
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
			
			
		
		
	}

