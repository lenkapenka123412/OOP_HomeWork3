import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        // Создание студентов
        Student student1 = new Student("Иван", "Иванов", "Иванович");
        Student student2 = new Student("Петр", "Петров", "Петрович");
        Student student3 = new Student("Сидр", "Сидоров", "Сидорович");


        // Создание учебных групп и добавление студентов в них
        StudyGroup group1 = new StudyGroup();
        group1.setStudentList(new ArrayList<>(Arrays.asList(student1, student2)));
        StudyGroup group2 = new StudyGroup();
        group2.setStudentList(new ArrayList<>(Arrays.asList(student3)));

        // Создание потоков и добавление в них групп
        Flow flow1 = new Flow();
        flow1.setStudyGroups(new ArrayList<>(Collections.singletonList(group1)));
        Flow flow2 = new Flow();
        flow2.setStudyGroups(new ArrayList<>(Collections.singletonList(group2)));

        // Создание контроллера и добавление сервисов
        Controller controller = new Controller();

        // Добавляем потоки в список, который будем сортировать
        List<Flow> flows = new ArrayList<>(Arrays.asList(flow1, flow2));

        // Сортировка и вывод отсортированного списка потоков
        List<Flow> sortStreams = controller.sortrdFlows(flows);
        for (Flow flow : sortStreams) {
            System.out.println("Поток с количеством групп: " + flow.getStudyGroups().size());
            for (StudyGroup studyGroup : flow.getStudyGroups()) {
                System.out.println("Учебная группа с количеством студентов: " + group2.getStudentList().size());
                for (Student student : group2.getStudentList()) {
                    System.out.println("Студент: " + student.getFirstName()
                            + " " + student.getLastName()
                            + " " + student.getModdleName());
                }
            }
        }
    }
}