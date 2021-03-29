package Practice;

public class Practice02 {
	     
	
	// all this methods or modifiers are static so do not create an object for this just classnme.method name
	   public static  void word() {
		   
		   System.out.println("Word up");
		   
	   }
	private static void word2() {
		
		System.out.println("This not word up");
	}
	
		protected static  void word3 () {
			
			System.out.println("word down");
			
		}
	   final static void word4() {
		   
		   
		   System.out.println("word up and down");
		   
	   }
	
	// all this methods or modifiers are non-static so we do need to create an object for this just obj.methodname
  public   void word5() {
		   
		   System.out.println("Word");
		   
	   }
	private  void word6() {
		
		System.out.println("word up");
	}
	
		protected   void word7 () {
			
			System.out.println("down");
			
		}
	   final  void word8() {
		   
		   
		   System.out.println("up and down");
		   
	   }

	public static void main(String[] args) {
		
		
	     Practice02.word();
	     Practice02.word2();
	     Practice02.word3();
	     Practice02.word4();
        System.out.println("************************************************");
	     Practice02 prac = new Practice02();
	     
	     prac.word5();
	     prac.word6();
	     prac.word7();
	     prac.word8();
	     prac.word();// this is a static method
	     
	   
	     Practice01 prac2 = new Practice01();
	     prac2.number2();
	    Practice01.number();
	    
	     
	}
	
	

}
