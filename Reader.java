import java.io.*;
import java.util.*;
import com.google.gson.GsonBuilder;
import com.google.gson.*;

public class Reader {
    public static void main(String[] args) {
        try {
            File myf = new File("MinorsList-3.json");
            FileInputStream fis = new FileInputStream(myf);
            InputStreamReader reader = new InputStreamReader(fis);
            
            JsonElement je = JsonParser.parseReader(reader);
            //JsonObject root = je.getAsJsonObject();
            JsonArray results = je.getAsJsonArray();

            for (int i = 0; i < results.size(); i++) {
                String name = results.get(i).getAsJsonObject().get("Name").getAsString();
                int th = results.get(i).getAsJsonObject().get("Total Hours").getAsInt();
                JsonArray tempja = results.get(i).getAsJsonObject().get("Required").getAsJsonArray();
                Gson gson = new Gson();
                Integer[] output = gson.fromJson(tempja , Integer[].class);
                ArrayList<Course> reqs = new ArrayList<Course>();
                for (int j = 0; j < output.length; j++) {
                    reqs.add(new Course(output[j]));
                }
                ArrayList<Course> opts = new ArrayList<Course>();
                tempja = results.get(i).getAsJsonObject().get("Optional").getAsJsonArray();
                output = gson.fromJson(tempja , Integer[].class);
                for (int k = 0; k < output.length; k++) {
                    opts.add(new Course(output[k]));
                }

            }
                //for (int j = 0; 
            

            //}
                //Course c1 = Gson.fromJson(je, Course.class);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

