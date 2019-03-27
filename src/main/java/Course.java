import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Course {

    /// c55713a34c2a42699de30c3d1efeb62f
    public static String getCourse() throws IOException {
        String link = "https://openexchangerates.org/api/latest.json?app_id=";
        String api_key = "c55713a34c2a42699de30c3d1efeb62f";
        URL url = new URL(link+api_key);

        Scanner in = new Scanner((InputStream) url.getContent());
        String res = "";
        while (in.hasNext()) {
            res += in.nextLine();
        }

        JSONObject obj = new JSONObject(res);

        return "1 USD = " + obj.getJSONObject("rates").getDouble("KZT") + " KZT";
    }
}
