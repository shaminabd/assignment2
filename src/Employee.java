public class Employee extends Person {
    private String field;
    private double salary;

    public Employee() {
        super();
        this.field = "Jumyssyz";
        this.salary = 0.0;
    }

    public Employee(String name, String surname, String field, double salary) {
        super(name, surname);
        this.field = field;
        this.salary = salary;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
