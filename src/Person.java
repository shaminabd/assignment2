public class Person {
    private static int id = 1;
    private int id_Gen;
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Person(int id_Gen, String name, String surname, int age, boolean gender) {
        this.id_Gen = id_Gen;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public static int getId() {
        return id;
    }

    public int getId_Gen() {
        return id_Gen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
