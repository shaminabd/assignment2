public class Employee {
    private static int id = 1;
    private int id_gen;
    private String name;
    private String surname;
    private String position;
    private int age;
    private boolean gender;
    private double salary;

    //no arg constructor
    public Employee() {
        id_gen = id++;
    }
    public Employee(String name, String surname){
        this(); //call no arg constructor
        this.name = name;
        this.name = surname;
    }
    //parametrized constructor

    public Employee(String name, String surname, String position, int age, boolean gender, double salary ) {
        this(name, surname); //call parametrized constructor
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }
    //getters / accessors
    //setters / mutators
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public String getPosition() {
        return position;
    }

    public double  getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee id: " + id_gen +
                "\nFull name: " + name + " " + surname +
                "\nPosition: " + position  +
                "\nAge: " + age +
                "\nGender: " + (gender ? "male" : "female") +
                "\nSalary: " + salary;
    }
}
