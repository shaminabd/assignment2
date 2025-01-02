import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> payables = new ArrayList<>();

        payables.add(new Employee("John", "Lennon", "Manager", 27045.78));
        payables.add(new Employee("George", "Harrison", "Developer", 50000.00));
        payables.add(new Person());
        payables.add(new Student("Ringo", "Starr", 2.0));
        payables.add(new Student("Paul", "McCartney", 3.8));

        Collections.sort(payables);

        for (Payable p : payables) {
            System.out.println(p + " earns " + p.getPaymentAmount() + " tenge");
        }
}
}
