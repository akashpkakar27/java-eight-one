package Java8Prc2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Java8Prc1.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		createEmployeeList(empList);
		
		System.out.println("************* ALL Employee List**************** ");
		Map<String,List<Employee>> mapEmp = empList.stream().collect(Collectors.groupingBy(Employee::getName));
		mapEmp.forEach((k,v)->
		System.out.println("getname " +k + " Employee "+v));
		
		
	}

	private static void createEmployeeList(ArrayList<Employee> empList) {
		
		
	Employee e1 = new Employee(1,"Raj","Developer","Pune",78000);
	Employee e2 = new Employee(2,"Suraj","Army","Banglore",90000);
	Employee e3 = new Employee(3,"Mahima","Medical","Chennai",56000);
	Employee e4 = new Employee(4,"Abhay","Army","Mumbai",120000);
	Employee e5 = new Employee(5,"Priti","Developer","Nashik",112000);
	
	empList.add(e1);
	empList.add(e2);
	empList.add(e3);
	empList.add(e4);
	empList.add(e5);
	
}
}