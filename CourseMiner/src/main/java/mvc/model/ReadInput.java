package mvc.model;

import java.util.ArrayList;
import java.io.*;
import java.nio.file.*;

public class ReadInput {

    public ArrayList<Course> inputReeder() {
        try {
            Path fileName = Path.of("classDict2.txt");
            //String content;
            //content = Files.readString(fileName);
            String actual = Files.readString(fileName);
            actual = actual.substring(1,actual.length());
            //System.out.println(actual);
            //System.out.println(actual);
            String[] classarr = actual.split(",");
            ArrayList<Course> ucs = new ArrayList<>();
            System.out.println("ready freddy");
            for (String s : classarr) {
                //System.out.println(s);
                s = s.trim();
                //s.trim();
                //System.out.println(s);
                int start = s.indexOf("'") + 1;
                int mid = s.indexOf(" ");
                int end = s.indexOf(":") - 1;
                int f1 = s.indexOf("[") + 2;
                int f2 = s.indexOf("]") - 1;
    
                ucs.add(new Course(s.substring(start, mid), Integer.parseInt(s.substring(mid + 1, end)), Integer.parseInt(s.substring(f1, f2))));
                ucs.get(ucs.size()-1).print();
            }
            for (Course c : ucs) {
                //c.print();
            }
            return ucs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}