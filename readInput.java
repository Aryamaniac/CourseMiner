import java.util.ArrayList;
import java.io.*;
import java.nio.file.*;

public class readInput {

    public ArrayList<Course> inputReeder(String filep) {
        try {
            Path fileName = Path.of("ClassesDict.txt");
            String content  = "";
            Files.writeString(fileName, content);
            String actual = Files.readString(fileName);
            //System.out.println(actual);
            String[] classarr = actual.split(",");
            ArrayList<Course> ucs = new ArrayList<>();
            for (String s : classarr) {
                s.trim();
                int start = s.indexOf("'");
                int mid = s.indexOf(" ");
                int end = s.indexOf(":") - 1;
                int f1 = s.indexOf("[") + 2;
                int f2 = s.indexOf("]") - 1;
                ucs.add(new Course(s.substring(start, mid), Integer.parseInt(s.substring(mid + 1, end)), Integer.parseInt(s.substring(f1, f2))));
            }
            return ucs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
