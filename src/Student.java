

public class Student implements Comparable<Student>{

    private Long studentId;
    private String firstName;
    private String lastName;
    private String middleName;

    public Student(String firstName, String lastName, String moddleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = moddleName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getModdleName() {
        return middleName;
    }

    public void setModdleName(String moddleName) {
        this.middleName = moddleName;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
