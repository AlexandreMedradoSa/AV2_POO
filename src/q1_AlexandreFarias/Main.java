package q1_AlexandreFarias;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Minha Empresa");

        Vehicle vehicle = new Vehicle("ABC123");
        Truck truck = new Truck("XYZ789", 5000);
        Car car = new Car("DEF456", "Automática");

        Employee employee = new Employee("Funcionário 1");

        company.employs(employee);  
        company.hires(vehicle);   
        employee.drives(vehicle); 
        vehicle.setCompany(company);  
        truck.setVehicle(vehicle);    
        car.setVehicle(vehicle);      

        System.out.println("Nome da empresa: " + company.getName());
        System.out.println("Veículo - Número de registro: " + vehicle.getRegistrationNumber());
        System.out.println("Caminhão - Massa: " + truck.getMass());
        System.out.println("Carro - Transmissão: " + car.getTransmission());
        System.out.println("Funcionário - Nome: " + employee.getName());
    }
}
