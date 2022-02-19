import java.util.*;

public class Minor {
    int totalHours;
    int remainingHours;
    int reqHoursMax;
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
        int reqHoursSoFar = 0;
        int optHoursSoFar = 0;
        for (Course c : taken) {
            if (required.indexOf(c) > 0) {
                if (reqHoursMax - (reqHoursSoFar + c.hours) >= 0) {
                    remainingHours -= c.hours;
                    reqHoursSoFar += c.hours;
                }
            }
            if (optionals.indexOf(c) > 0) {
                if (optHoursMax - (optHoursSoFar + c.hours) >= 0) {
                    remainingHours -= c.hours;
                    optHoursSoFar += c.hours;
                }
            }
        }
    }

}
