import java.io.*;
import com.google.gson.GsonBuilder;
import com.google.gson.*;

public class Reader {
    public static void main(String[] args) {
        try {
            File myf = new File("MinorsList.json");
            FileInputStream fis = new FileInputStream(myf);
            InputStreamReader reader = new InputStreamReader(fis);
            
            JsonElement je = JsonParser.parseReader(reader);
            JsonObject root = je.getAsJsonObject();
            JsonArray results = root.getAsJsonArray("Name");

            for (int i = 0; i < results.size(); i++) {
                System.out.println(results.get(i));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

