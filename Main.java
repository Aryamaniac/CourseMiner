import java.io.*;
import java.util.ArrayList;
public class Main {
    
    public static void main(String args[]) {
        Course a = new Course("BCMB", 3100, 6985, 3);
        Course a1 = a;
        Course b = new Course("CBIO", 3400, 4830, 4);
        Course c = new Course("CSCI", 3500, 1234, 4);
        Course d = new Course("STAT", 6000, 1000, 4);
        Course e = new Course("RAWR", 42069, 1000, 3);
        //Course a1 = new Course("BCMB", 3100, 6985, 3);
        Course b1 = new Course("CBIO", 3400, 4830, 4);
        Course c1 = new Course("CSCI", 3500, 1234, 4);
        Course d1 = new Course("BIOL", 6060, 1010, 4);
       


        ArrayList<Course> required = new ArrayList<Course>(); 
        required.add(0,a1);
        required.add(1,b1);

        ArrayList<Course> optional = new ArrayList<Course>();
        optional.add(0,c1);
        optional.add(1,d1);

        Minor statistics = new Minor(15,8,8,"Statistics",required, optional);

       
        ArrayList<Course> required2 = new ArrayList<Course>(); 
        required2.add(0,a1);
        required2.add(1,b1);

        ArrayList<Course> optional2 = new ArrayList<Course>();
        optional2.add(0,c1);
        optional2.add(1,d1);

        Minor biology = new Minor(15,8,8,"Biology",required2, optional2);

        ArrayList<Minor> minorList = new ArrayList<Minor>(); 
        minorList.add(0,biology);
        minorList.add(1,statistics);
        
        ArrayList<Course> taken = new ArrayList<Course>();
        
        taken.add(0,a1);
        taken.add(1,b1);
        taken.add(2,c1);
        taken.add(3,d1);

        ArrayList<Minor> minorData = compare(minorList, taken);
        System.out.println(minorData.get(0).remainingHours);
        System.out.println(minorData.get(1).remainingHours);
    } // main 

    public static ArrayList<Minor> compare(ArrayList<Minor> potentialMinors, ArrayList<Course> finishedCourses ){
        ArrayList<Minor> minorProgress = new ArrayList<Minor>();
        
        for(int i = 0; i < potentialMinors.size(); i++) {
            Minor m = potentialMinors.get(i);
            m.removeTaken(finishedCourses);
            minorProgress.add(i, m); 
        } // for 
        return minorProgress; 
    } // compare

    public void combine() {
        ArrayList<Minor> readerMinors = new ArrayList<>();
        Reader read = new Reader();
        readerMinors = read.readJson();

        ArrayList<Course> courseDictionary = new ArrayList<>();
        readInput courseBuilder = new readInput();
        courseDictionary = courseBuilder.inputReeder();

        userParser up = new userParser();
        ArrayList<Course> usersCourses = new ArrayList<>();
        usersCourses = up.readUser(courseDictionary);

        


    }
}
