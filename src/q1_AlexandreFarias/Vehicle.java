package q1_AlexandreFarias;

public class Vehicle {
    private String registrationNumber;
    private Company company;

    public Vehicle(String registrationNumber) {
        this.setRegistrationNumber(registrationNumber);
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
