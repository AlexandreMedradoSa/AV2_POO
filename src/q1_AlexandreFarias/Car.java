package q1_AlexandreFarias;

public class Car extends Vehicle {
    private String transmission;

    public Car(String registrationNumber, String transmission) {
        super(registrationNumber);
        this.setTransmission(transmission);
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }


    public void setVehicle(Vehicle vehicle) {
        this.setCompany(vehicle.getCompany());
    }
}


