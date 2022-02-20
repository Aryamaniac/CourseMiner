import java.util.ArrayList;
import java.io.*;

public class userParser {
    public ArrayList<Course> readUser(ArrayList<Course> courseDict) {
        BufferedReader reader;
		try {
            ArrayList<Course> userCourses = new ArrayList<>();
			reader = new BufferedReader(new FileReader("input.txt"));
			String line = reader.readLine();
			while (line != null) {
                String[] info = line.split(" ");
                userCourses.add(new Course(Integer.parseInt(info[1]), Integer.parseInt(info[2]), info[0]));
				line = reader.readLine();
			}
            //System.out.println("COURSEDICT SIZE: " + courseDict.size());
			reader.close();
            for (Course c : userCourses) {
                for (Course d : courseDict) {
                    if (c.combo().equals(d.combo())) {
                        c.CID = d.CID;
                    }
                }
            }
            return userCourses;
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
        return null;
    }

    public ArrayList<Course> readUser(ArrayList<Course> courseDict, ArrayList<Course> userArrayList) {
        BufferedReader reader;
		try {
            ArrayList<Course> userCourses = new ArrayList<>();
		
			for(int i = 0; i < userArrayList.size(); i++) {
                userCourses.add(userArrayList.get(i));
			} // for 
            for (Course c : userCourses) {
                for (Course d : courseDict) {
                    if (c.combo().equals(d.combo())) {
                        c.CID = d.CID;
                    }
                }
            }
            return userCourses;
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
        return null;
    }
}
