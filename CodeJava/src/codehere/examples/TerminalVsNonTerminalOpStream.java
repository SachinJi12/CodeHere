package codehere.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TerminalVsNonTerminalOpStream {

	public static void main(String[] args) {

		Employee e1=new Employee(1, "Code1");
		Employee e2=new Employee(2, "Code2");
		Employee e3=new Employee(3, "Code3");
		Employee e4=new Employee(1, "Code4");
		Employee e5=new Employee(1, "Code5");

		List<Employee> empList = Arrays.asList(e1,e2,e3,e4,e5);
		
		List<Integer> newList = Arrays.asList(1,2,3,4,5);
	}

}

class Employee{
	private int  id;
	private String name;
	
	// constructor
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public void printName() {
		System.out.println("In Emp Class :-" +name);
	}
	
}
