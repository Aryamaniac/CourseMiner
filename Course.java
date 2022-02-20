
public class Course {
    String name;
    String prefix;
    int coursenum;
    int CID;
    int hours;

    public Course(String pr, int cn, int ci, int h) {
        prefix = pr;
        coursenum = cn;
        CID = ci;
        hours = h;
    }

    public Course (String pr, int cn, int ci) {
        prefix = pr;
        coursenum = cn;
        CID = ci;
    }

    public Course (int cn, int h, String pr) {
        prefix = pr;
        coursenum = cn;
        hours = h;
    }

    public Course(int c) {
        CID = c;
    }

    public String combo() {
        return prefix + " " + coursenum;
    }

    public void print() {
        System.out.println("Course: " + combo());
        System.out.println("CID: " + CID);
        System.out.println("Hours: " + hours);
    }
}