package q1_AlexandreFarias;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Vehicle> hiredVehicles = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.setName(name);
    }
    
    public void hires(Vehicle vehicle) {
        hiredVehicles.add(vehicle);
    }

    public void employs(Employee employee) {
        employees.add(employee);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}