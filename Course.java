
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

    public Course(int c) {
        CID = c;
    }
}