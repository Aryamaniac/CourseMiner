import java.util.*;

public class Minor {
    int totalHours;
    int remainingHours;
    int reqHoursMin;
    int reqHoursMax;
    int optHoursMin;
    int optHoursMax;
    String name;
    ArrayList<Course> required;
    ArrayList<Course> optionals;

    public void removeTaken(ArrayList<Course> taken) {
        for (Course c : taken) {
            if (required.indexOf(c) == -1 && optionals.indexOf(c) == -1) {
                taken.remove(c);
            }
        }

        for (Course c : taken) {
            
        }
    }

}
