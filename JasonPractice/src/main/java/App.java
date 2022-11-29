import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main( String[] args )
    {
        JSONObject jo = new JSONObject();
        jo.put("name", "jon doe");
        jo.put("age", 22);
        jo.put("city", "chicago");
        System.out.println(jo.toString());

        Map<String, Object> map = new HashMap<>();
        map.put("name", "jon doe");
        map.put("age", 22);
        map.put("city", "chicago");
        JSONObject jo_from_map = new JSONObject(map);

        System.out.println(jo_from_map.toString());

        JSONObject jo_from_string =
                new JSONObject("{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":22}");
        System.out.println(jo_from_string.toString());

        JSONArray ja = new JSONArray();
        ja.put(Boolean.TRUE);
        ja.put("lorem ipsum");

        JSONObject jo1 = new JSONObject();
        jo.put("name", "jon doe");
        jo.put("age", "22");
        jo.put("city", "chicago");

        ja.put(jo);

        System.out.println(jo_from_string.toString());
    }
}
