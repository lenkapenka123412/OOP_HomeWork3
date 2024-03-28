import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<StudyGroup> {

    //Создаем класс «Поток», который содержит список учебных групп и реализует интерфейс Iterable:

    private List<StudyGroup> studyGroups;

    public List<StudyGroup> getStudyGroups() {
        return studyGroups;
    }

    public void setStudyGroups(List<StudyGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroups.iterator();
    }
}
