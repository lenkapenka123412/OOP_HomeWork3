import java.util.List;

public class Controller {

    //Модифицируем класс Контроллер, включив в него ПотокСервис и метод сортировки списков потоков:

    private final StudyGroupServise studyGroupServise = new StudyGroupServise();
    private final FlowService flowService = new FlowService();

    public void removeStudyDyFIO(String firstName,String lastName, String middleName) {
        studyGroupServise.removeStudyDyFIO(firstName, firstName, middleName);
    }

    public List<Student> getSortedStudentList() {
        return studyGroupServise.getSortedStudentList();
    }

    public List<Student> getSortedStudentByFIO() {
        return studyGroupServise.getSortedStudentByFIO();
    }

    public List<Flow> sortrdFlows(List<Flow> flows) {
        return flowService.sortStreams(flows);
    }
}
