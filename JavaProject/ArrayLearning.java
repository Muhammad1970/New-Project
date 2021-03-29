package JavaProject;

public class ArrayLearning {

	public static void main(String[] args) {

		// /* to do this ctrl+shift+/

		// there are 2 different places where variable stores one for the object and one
		// for the variable

		// THIS IS HEAP POOL
		// String s1 = new String ("hello");
		// String s2 = new String ("hello");

		// SMARTER WAY IS CONTANT POOP LIKE THIS
		// String s1 =("hello");
		// String s2 =("hello");

		// == IS USED TO COMPARE REFERNCE/VARIABLE NAME
		// Systme.out.println(s1==s2);
		// == is to compare reference/variable name(interview question what is == means?
		// .equal is used to compare the value or contents
		// System.out.println(s1.equals(s2));
        // null mean we are giving the value
		// boolean we can use boolean isDisplayed/isEnable/isSelected = driver.fx.
		// if(isDisplayed or isEnable or isSelected{
		
	     //} 
		// System.out.println(name field isDisplyed
		//else if (!isDisplayed){
		
	//}driver.finx
		/*
		 * String Fruits[] = { "Orange,", "Pineapple", "Banana", "Apple", "Grapes" };
		 * String Basket[] = { "Knives", "Spoons", "Forks", "Cups", "Bowl" };
		 * 
		 * System.out.println(Fruits[0]); System.out.println(Basket[1]);
		 * System.out.println(Fruits[2]); System.out.println(Basket[3]);
		 */

		// Syntax: initialize; boolean; upgrade( to work with the loop FOR)

		// int numbers [] = {1,2,3,4,};

		// System.out.println(numbers[0]);
/*
		for (int a = 1; a < 20; a = a + 1) {

			System.out.println(a);

		}*/

		String grade = null;
		
		int score = 79;
		
		if (score >= 90)
			{
			grade = "A";			
		}
		
		else if (score <= 80) {
			
			
			grade = "B";
		}
		

		else if (score <= 79) {
			
			
			grade = "C";
		}
		System.out.println(" score = " +score);
		System.out.println(" grade  = " +grade);
		
		
		
		
	}
}
