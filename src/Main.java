import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> employees = new ArrayList<>();

        //File file = new File("C:\\Users\\Chingishan\\IdeaProjects\\projectNumber1\\src\\employee.txt");
        //Scanner scanner = new Scanner(file);

        Person person1 = new Person("Harry", "Potter", 21, true);
        Person person2 = new Person("Hermione", "Granger", 19, false);

        // Displaying the introduction
        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
