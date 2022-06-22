package assignments;

import java.util.HashSet;

public class HashSetEmployee {
	public static void main(String[] args) {
		   HashSet<Employee> hs=new HashSet();
		   hs.add(new Employee(1,20000, "mani", "Testing"));
		   hs.add(new Employee(2,25000, "omkar", "dev"));
		   hs.add(new Employee(3,20000, "avinash", "hr"));
		   hs.add(new Employee(4,27000, "ravi", "manager"));
		   hs.add(new Employee(5,28000, "rani", "sap"));
		   //here we are getting error because we are trying to add integer value instead of employee
		  // hs.add(123);
		   System.out.println(hs);
		   
	}
	}
	class Employee{
		int id;
		int salary;
		String name;
		String dept;
		public Employee(int id, int salary, String name, String dept) {
			super();
			this.id = id;
			this.salary = salary;
			this.name = name;
			this.dept = dept;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", dept=" + dept + "]";
		}
		
	}


