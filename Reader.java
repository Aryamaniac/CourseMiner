import java.io.*;
import java.util.*;
import com.google.gson.GsonBuilder;
import com.google.gson.*;

public class Reader {
    public ArrayList<Minor> readJson() {
        try {
            System.out.println("testing");
            File myf = new File("minorsList-3.json");
            FileInputStream fis = new FileInputStream(myf);
            InputStreamReader reader = new InputStreamReader(fis);
            
            JsonElement je = JsonParser.parseReader(reader);
            //JsonObject root = je.getAsJsonObject();
            JsonArray results = je.getAsJsonArray();

            ArrayList<Minor> minors = new ArrayList<Minor>();
            for (int i = 0; i < results.size(); i++) {
                String name = results.get(i).getAsJsonObject().get("Name").getAsString();
                int th = results.get(i).getAsJsonObject().get("Total Hours").getAsInt();
                
                JsonArray tempja = results.get(i).getAsJsonObject().get("Required").getAsJsonArray();
                Gson gson = new Gson();
                Integer[] output = gson.fromJson(tempja , Integer[].class);
                ArrayList<Course> reqs = new ArrayList<Course>();
                for (int j = 0; j < output.length; j++) {
                    reqs.add(new Course(output[j]));
                } // for

                ArrayList<Course> opts = new ArrayList<Course>();
                JsonArray tempja2 = results.get(i).getAsJsonObject().get("Elective").getAsJsonArray();
                output = gson.fromJson(tempja2, Integer[].class);
                for (int k = 0; k < output.length; k++) {
                    opts.add(new Course(output[k]));
                } // for 

                int rm = results.get(i).getAsJsonObject().get("requiredMax").getAsInt();
                int em = results.get(i).getAsJsonObject().get("electiveMax").getAsInt();
                minors.add(new Minor(th, rm, em, name, reqs, opts));
                return minors; 
            }
            //for (int i = 0; i < minors.size(); i++) {
            //    minors.get(i).Print();
            //}
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return null;
    }
}

