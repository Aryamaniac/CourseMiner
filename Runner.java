import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Course c1 = new Course("BCMB", 3100, 6985, 3);
        Course c2 = new Course("CBIO", 3400, 4830, 4);
        Course d1 = new Course("CSCI", 3500, 1234, 4);
        Course d2 = new Course("STAT", 6000, 1000, 4);

        ArrayList<Course> required = new ArrayList<Course>(); 
        required.add(0,c1);
        required.add(1,c2);

        ArrayList<Course> optional = new ArrayList<Course>();
        optional.add(0,d1);
        optional.add(1,d2);

        Minor biology = new Minor(15,8,8,"Biology",required, optional);
        
        ArrayList<Course> taken = new ArrayList<Course>();
        taken.add(0,c1);
        taken.add(1,c2);
        taken.add(2,d1);
        taken.add(3,d2);

        System.out.println(biology.remainingHours);
        biology.removeTaken(taken);
        System.out.println(biology.remainingHours);
       

    }
}