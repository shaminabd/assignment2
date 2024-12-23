import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Person> members;

    public School(List<Person> members) {
        this.members = new ArrayList<>();
    }

    public void addMember(Person member) {
        members.add(member);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("School Members:\n");
        for (Person member : members) {
            result.append(member.toString()).append("\n");
        }
        return result.toString();
    }
}
