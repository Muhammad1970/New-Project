package JavaProject;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListIt {

	public static void main(String[] args) {

      Employee emp1 = new Employee("james", 45, "HR");
      Employee emp2 = new Employee("jon", 29, "Dev");
      Employee emp3 = new Employee("jill", 35, "QA");
      
      
      ArrayList<Employee> ar = new ArrayList<Employee>();
      
      ar.add(emp1);
      ar.add(emp2);
      ar.add(emp3);
      
      Iterator <Employee> ar1 = ar.iterator();  
      while(ar1.hasNext()) {
     Employee emp = ar1.next();
     System.out.println("*********");
      System.out.println(emp.name);
      System.out.println(emp.age);
      System.out.println(emp.Dept);
		

	}

}
}
