import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        School hogwarts = new School();

        File studentFile = new File("students.txt");
        Scanner studentScanner = new Scanner(studentFile);
        File schoolFile = new File("schools.txt");
        Scanner schoolScanner = new Scanner(schoolFile);

        while(studentScanner.hasNext()){
            String name = studentScanner.next();
            String surname = studentScanner.next();
            int age = studentScanner.nextInt();
            boolean gender = studentScanner.nextBoolean();
            int studentId = studentScanner.nextInt();
            ArrayList<Integer> grades = new ArrayList<>();

            while (studentScanner.hasNext()){
                grades.add(studentScanner.nextInt());
            }

            Student student = new Student(name, surname, studentId, grades);
            student.setAge(age);
            student.setGender(gender);

            hogwarts.addMember(student);
        }
    }
}
