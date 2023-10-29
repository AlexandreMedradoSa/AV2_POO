package q1_AlexandreFarias;

public class Employee {
    private String name;
    

    public Employee(String name) {
        this.setName(name);
    }
    
    public void drives(Vehicle vehicle) {
        System.out.println(getName() + " está dirigindo o veículo de registro " + vehicle.getRegistrationNumber());
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}