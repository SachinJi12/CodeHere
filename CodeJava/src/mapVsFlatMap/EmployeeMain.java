package mapVsFlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		List<String> citiesWorkedIn1 = new ArrayList<String>();
		citiesWorkedIn1.add("Pune");
		citiesWorkedIn1.add("Banglore");
		citiesWorkedIn1.add("Gurgaon");
		citiesWorkedIn1.add("Noida");
		
		Employee e1 = new Employee(1, "Code", citiesWorkedIn1);
		
		
		List<String> citiesWorkedIn2 = new ArrayList<String>();
		citiesWorkedIn2.add("Napur");
		citiesWorkedIn2.add("Calcutta");
		citiesWorkedIn2.add("Delhi");
		citiesWorkedIn2.add("Noida");
		
		Employee e2 = new Employee(2, "DeCode", citiesWorkedIn2);
		
		List<String> citiesWorkedIn3 = new ArrayList<String>();
		citiesWorkedIn3.add("Pune");
		citiesWorkedIn3.add("Delhi");
		citiesWorkedIn3.add("Gurgaon");
		citiesWorkedIn3.add("Jaipur");
		
		Employee e3 = new Employee(3, "Code Decode", citiesWorkedIn3);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		System.out.println(empList);
		
		/*
		 * List<Integer> ids = new ArrayList<Integer>(); for(Employee empIds: empList) {
		 * ids.add(empIds.getId()); } System.out.println(ids);
		 */
		// writing the code with Stream MAP
		List<Integer> id = empList.stream().map(emp-> emp.getId()).collect(Collectors.toList());
		System.out.println(id);
		
		// when you have to get the data from List of List like Employe data in list and citiesWorkedIn is also String list.
		// than we use FLATMAP with unique elements only using SET
		Set<String> citiesWorkedInFlatten = empList.stream().flatMap(emp -> emp.getCitiesWorkedIn().stream()).collect(Collectors.toSet());
		System.out.println(citiesWorkedInFlatten);
	}

}
