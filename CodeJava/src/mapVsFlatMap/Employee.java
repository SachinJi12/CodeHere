package mapVsFlatMap;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private List<String> citiesWorkedIn;
	
	// create a constructor so that we can
	public Employee(int id, String name, List<String> citiesWorkedIn) {
		super();
		this.id = id;
		this.name = name;
		this.citiesWorkedIn = citiesWorkedIn;
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
	public List<String> getCitiesWorkedIn() {
		return citiesWorkedIn;
	}
	public void setCitiesWorkedIn(List<String> citiesWorkedIn) {
		this.citiesWorkedIn = citiesWorkedIn;
	}
	
	// we add toString so that we can get the content of the list to be printed
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", citiesWorkedIn=" + citiesWorkedIn + "]";
	}
	
	
}
