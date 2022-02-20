import java.util.*;

public class Minor {
    int totalHours;
    int remainingHours;
    int reqHoursMax;
    int optHoursMax;
    String name;
    ArrayList<Course> required;
    ArrayList<Course> optionals;
    ArrayList<Course> remainingRequired = required; 
    ArrayList<Course> remainingOptional = optionals;

    public Minor(int t, int rhm, int ohm, String n, ArrayList<Course>r, ArrayList<Course>o) {
        totalHours = t;
        remainingHours = totalHours;
        reqHoursMax = rhm;
        optHoursMax = ohm;
        name = n;
        required = r;
        optionals = o;
    }

    public Minor removeTaken(ArrayList<Course> taken) {
        ArrayList<Course> taken2 = (ArrayList<Course>) taken.clone();
        for (Course c : taken) {
            if (required.indexOf(c) == -1 && optionals.indexOf(c) == -1) {
               // taken2.remove(c);
            }
        }
        int reqHoursSoFar = 0;
        int optHoursSoFar = 0;
        for (Course c : taken) {
            System.out.println(required.indexOf(c));
            System.out.println(optionals.indexOf(c));
            if (required.indexOf(c) >= 0) {
                   
                    remainingHours -= c.hours;
                    reqHoursSoFar += c.hours;
                
            }
            if (optionals.indexOf(c) >= 0) {

                   
                    remainingHours -= c.hours;
                    optHoursSoFar += c.hours;
                
            }
        }
        return this; 
    }

    public void Print(){
        System.out.println("name: " + name);
        System.out.println("total hours: " + totalHours);
        System.out.println("reqHoursMax: " + reqHoursMax);
        System.out.println("optHoursMax:" + optHoursMax);
        System.out.println("Required: ");
        for(int i = 0; i < required.size(); i++){
            System.out.print(required.get(i).CID + ", ");
        } // for 
        System.out.println("Optionals: ");
        for(int i = 0; i < optionals.size(); i++){
            System.out.print(optionals.get(i).CID + ", ");
        } // for 
        System.out.println("");
        System.out.println(remainingHours);
        System.out.println("");

    }

}
