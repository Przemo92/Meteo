package application.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static application.controller.Messages.CONNECTION_PROBLEM_TEXT;
import static application.controller.Messages.setExceptionLabelText;
import static application.model.OpenWeatherMap.getFullApi;

public class JsonReader {

    private JSONArray jsonWeatherData = null;

    public JsonReader() {

    }

    public String fetchWeatherMessage(String nameTown){

        String message;

        try {
            JSONObject json2 = readJsonFromUrl(getFullApi(nameTown));
            message = "city exist";
        }catch(IOException e){
            message = "city not found";
        }
        return message;
    }

    public void  transformJsonObjectToArray(String nameTown){

        try {
            JSONObject json = readJsonFromUrl(getFullApi(nameTown));
            jsonWeatherData = json.getJSONArray("list");
        }catch (JSONException e){
            System.out.println(e);
            setExceptionLabelText(CONNECTION_PROBLEM_TEXT);
        }catch (IOException ex){
            System.out.println(ex);
            setExceptionLabelText(CONNECTION_PROBLEM_TEXT);
        }
    }

    private static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {

        InputStream is = new URL(url).openStream();

        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    private static String readAll(Reader rd) throws IOException {

        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public JSONArray getJsonWeatherData() {
        return jsonWeatherData;
    }
}