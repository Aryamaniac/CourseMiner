import java.util.*;

public class Certificate {
    int totalHours;
    int remainingHours;
    int reqHoursMax;
    int optHoursMax;
    String name;
    ArrayList<Course> required;
    ArrayList<Course> optionals;

    public Certificate(int t, int rhm, int ohm, String n, ArrayList<Course>r, ArrayList<Course>o) {
        totalHours = t;
        remainingHours = totalHours;
        reqHoursMax = rhm;
        optHoursMax = ohm;
        name = n;
        required = r;
        optionals = o;
    }

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


