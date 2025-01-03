public class Employee extends Person implements Payable {
    private String position;
    private double salary;

    public Employee() {
        super();
        this.position = "Jumyssyz";
        this.salary = 0.0;
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public double getPaymentAmount() {
        return salary; // Employees earn their salary
    }

    @Override
    public String toString() {
        return "Employee: "  + super.toString();
    }
}
