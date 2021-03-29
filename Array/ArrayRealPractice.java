package Array;

import java.util.Arrays;

public class ArrayRealPractice {

	public static void main(String[] args) {

		Integer[] num = { 25, 30, 50, 99, };

		num[0] = 25;
		num[1] = 30;
		num[2] = 50;
		num[3] = 99;
  
		// to get index value only like num[2] will be 50 print out
		System.out.println(num[2]);

		// This to print horizantal in line all values
		System.out.println(Arrays.toString(num));

		// This to get size of Array
		System.out.println(num.length);

		// This is use to get value of each value with index like the "The index 0 value
		// is 25"
		for (int a = 0; a < 4; a++) {
			
			System.out.println(num[a]);
			
			//System.out.println();
			
			//System.out.println(" The index " + a + " value is " + num[a]);
           // System.out.println(num[a]);
		}

		String[] c = new String[4];
		try {
			c[0] = "cow";
			c[1] = "bang";
			c[2] = "roller coster";
			c[3] = "circus";

			// this to use to get value on line horizantal
			System.out.println(Arrays.toString(c));
			System.out.println(c[0]);
			System.out.println(c[1]);
			System.out.println(c[2]);
			System.out.println(c[3]);
		} catch (Exception e) {
			
			System.out.println("it all good");
		}

		// this is to get size
		System.out.println(c.length);

		// loop use to get all index with value in line all one by one
		for (int b = 0; b < 4; b++) {

			System.out.println(" is index " + b + " value of " + c[b]);

		}

		char[] g = { 'M', 'K', 'P' };
		
		System.out.println(g[2]);

		System.out.println(Arrays.toString(g));

		for (int h =0; h<3; h++) {
			
			System.out.println(" this index " +h+ " value of " +g[h]);
			
			}

		System.out.println(" " );
		// if condition to change the value
		
		   String [] p = {"Mona", "Asad", "Johny", "Brad"};
		   
		   System.out.println(Arrays.toString(p));
		   System.out.println(" " );
		   for (int l=0; l<p.length; l++) {
			   
			 //System.out.println(p[l]);
			 
			 
			 if(p[3]=="Brad") {
				p[3] = "Rita";
				System.out.println(" " );
				System.out.println(Arrays.toString(p)); 
				System.out.println(p[3]);
				
				
				 
			 }
			   
		
				 
				 
				 
				 
			 }
			 
			 
	}
}
			 
			 
			 
			 
			 
			 

				
			
		 
		
	
		
		
	

