import java.util.Collections;
import java.util.List;

public class FlowService {

    //Добавим класс ПотокСервис, который будет включать метод для сортировки потоков:

    public List<Flow> sortStreams(List<Flow> flows) {
        Collections.sort(flows, new StreamComparator());
        return flows;
    }
}
