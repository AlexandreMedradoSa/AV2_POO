package q1_AlexandreFarias;

public class Truck extends Vehicle {
    private int mass;

    public Truck(String registrationNumber, int mass) {
        super(registrationNumber);
        this.setMass(mass);
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public void setVehicle(Vehicle vehicle) {
        this.setCompany(vehicle.getCompany());
    }
}