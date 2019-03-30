import org.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Course {

    /// c55713a34c2a42699de30c3d1efeb62f
    public static String getCourse() throws IOException {
        String link = "http://localhost:8080/course";
        URL url = new URL(link);

        Scanner in = new Scanner((InputStream) url.getContent());
        String res = "";
        while (in.hasNext()) {
            res += in.nextLine();
        }

        JSONArray obj = new JSONArray(res);

        return "1 USD = " + obj.getJSONObject(obj.length()-1).getDouble("value") + " KZT";
    }
}
