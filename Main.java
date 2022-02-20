import java.io.*;
import java.util.ArrayList;
public class Main {

    static ArrayList<Minor> mdb;
    public static void main(String args[]) {
        ArrayList<Minor> readerMinors = new ArrayList<>();
        Reader read = new Reader();
        readerMinors = read.readJson();

        ArrayList<Course> courseDictionary = new ArrayList<>();
        readInput courseBuilder = new readInput();
        courseDictionary = courseBuilder.inputReeder();

        userParser up = new userParser();
        ArrayList<Course> usersCourses = new ArrayList<>();
        usersCourses = up.readUser(courseDictionary);
        for (Course c: usersCourses) {
            //c.print();
        }
        ArrayList<Minor> minorDatabase; 
        minorDatabase = compare(readerMinors, usersCourses);
        selectionSort(minorDatabase); 
        mdb = minorDatabase;
        for (Minor m : minorDatabase) {
            m.Print();
        }
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
        ArrayList<Minor> minorDatabase; 
        minorDatabase = compare(readerMinors, usersCourses);
        this.selectionSort(minorDatabase); 
    }

    public ArrayList<Minor> getFinalList() {
        return mdb;
    }

    static void selectionSort(ArrayList<Minor> m)   { 
        int pos;
        int temp;
        for (int i = 0; i < m.size(); i++) 
        { 
            pos = i; 
            for (int j = i+1; j < m.size(); j++) 
           {
                if (m.get(j).remainingHours < m.get(pos).remainingHours)                  //find the index of the minimum element
                {
                    pos = j;
                }
            }

            temp = m.get(pos).remainingHours;            //swap the current element with the minimum element
            m.get(pos).remainingHours = m.get(i).remainingHours; 
            m.get(i).remainingHours = temp; 
        } 
    } 
}
