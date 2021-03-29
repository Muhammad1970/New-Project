package ArraylistAndHashMap;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayList2 {

	public static void main(String[] args) {


		
		 Employee emp1= new Employee("jim", 29, "HR", "23564"); {
	     Employee emp2= new Employee("rim", 37, "dev", "563564");
		 Employee emp3= new Employee("sim", 43, "admin", "98652");
		 Employee emp4= new Employee("dim", 48, "finance", "78452");
		
		
		
		ArrayList<Employee> ar = new ArrayList<Employee>();
		
		ar.add(emp1);
		ar.add(emp2);
		ar.add(emp3);
		ar.add(emp4);
		
		Iterator <Employee> ar1 = ar.iterator();
		while(ar1.hasNext() ) {
		Employee emp=ar1.next();
		System.out.println("***************");
		
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
		System.out.println(emp.empno);
		
			
		}
		
	}
		}
		
		

	}


