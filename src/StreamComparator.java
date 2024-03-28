import java.util.Comparator;

public class StreamComparator implements Comparator<Flow> {

    //Создаем класс StreamComparator, который будет сравнивать количество групп в потоках:
    @Override
    public int compare(Flow o1, Flow o2) {
        return Integer.compare(o1.getStudyGroups().size(), o2.getStudyGroups().size());
    }
}
