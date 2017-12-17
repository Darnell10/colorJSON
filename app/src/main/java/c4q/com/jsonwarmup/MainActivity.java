package c4q.com.jsonwarmup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "My Tag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONObject colorObject = new JSONObject();

        try {

            colorObject.put("Crayons", new JSONArray()

            .put(new JSONObject()
            .put("color","black")
            .put("category","hue")
            .put("type","primary")
            .put("rgba",new int[]{255,255,255,1})
            .put("hex","#000"))

            .put(new JSONObject()
            .put("color","white")
            .put("category","value")
            .put("type","primary")
            .put("rgba", new int [] {0,0,0,1})
            .put("hex","#FFF"))

            .put(new JSONObject()
            .put("color","red")
            .put("category","hue")
            .put("type","primary")
            .put("rgba",new int[] {255,0,0,1})
            .put("hex","#FF0"))

            .put(new JSONObject()
            .put("color","blue")
            .put("category","hue")
            .put("type","primary")
            .put("rgba",new int[] {0,0,255,1})
            .put("hex","#00F"))

            .put(new JSONObject()
            .put("color","yellow")
            .put("category","hue")
            .put("type","primary")
            .put("rgba",new int[]  {255,255,0,1})
            .put("hex","#FF0"))

            .put( new JSONObject()
            .put("color","green")
            .put("category", "hue")
            .put("type","secondary")
            .put("rgba",new int [] {0,255,0,1})
            .put("hex","#0F0"))
            );


        } catch (JSONException e) {
            e.printStackTrace();
        }

        String jsonString = colorObject.toString();

        Log.d(TAG, " On Create" + jsonString);

    }
}
