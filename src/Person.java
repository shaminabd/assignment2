public class Person {
    private static int id=1;
    private int id_gen;
    private String name;
    private String surname;

    public Person(){
        id_gen = id++;
        this.name = "Default";
        this.surname = "Defaultovic";
    }

    public Person(String name, String surname){
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id_gen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition(){
        return "Student";
    }

    @Override
    public String toString() {
        return id_gen+ " " + name + " " + surname;
    }
}
