import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getLastName().compareTo(o2.getLastName());
            if (resultOfComparing == 0) {
                return o1.getModdleName().compareTo(o2.getModdleName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
