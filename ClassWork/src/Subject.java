
import java.util.ArrayList;
import java.util.List;

public enum Subject {

    MATHEMATICS(1, 2, 3, 4, 5),
    PHYSICS(3, 4, 5),
    CHEMISTRY(1),
    ENGLISH(2, 3, 4),
    JAVA(1, 2, 3),
    HISTORY(1, 2);

    public List<Integer> courses;

    Subject (Integer ... courses){
        this.courses = new ArrayList<>();
        for (Integer course : courses){
            this.courses.add(course);
        }
    }
    public List<Integer> getCourses() {
        return courses;
    }
    
}
