package application.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ForecastDataWeather {

    public String fetchIcon(int dayIndex, JsonReader jsonReader) {

        JSONObject item = tranformJsonArrayIntoMiniJsonObject(dayIndex, jsonReader);

        return item.getJSONArray("weather").getJSONObject(0).get("icon").toString();
    }

    public String fetchDate(int dayIndex, JsonReader jsonReader) {

        JSONObject item = tranformJsonArrayIntoMiniJsonObject(dayIndex, jsonReader);

        long dateInSeconds = item.optLong("dt");
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = new Date(dateInSeconds * 1000);
        return format.format(date);
    }

    public String fetchTime(int dayIndex, JsonReader jsonReader) {

        JSONObject item = tranformJsonArrayIntoMiniJsonObject(dayIndex, jsonReader);

        long dateInSeconds = item.optLong("dt");
        SimpleDateFormat format2 = new SimpleDateFormat("HH:mm");
        Date date = new Date(dateInSeconds * 1000);
        return format2.format(date);
    }

    public String fetchTemperature(int dayIndex, JsonReader jsonReader) {

        JSONObject item = tranformJsonArrayIntoMiniJsonObject(dayIndex, jsonReader);

        double temperatureDouble;
        String temperatureString;

        JSONObject main = item.getJSONObject("main");
        temperatureString = main.get("temp").toString();
        try {
            temperatureDouble = Math.round(Double.parseDouble(temperatureString));

            temperatureString = String.format("%d", (long) temperatureDouble);
        } catch (NumberFormatException e) {
            temperatureString = "0";
        }
        return temperatureString;
    }

    private JSONObject tranformJsonArrayIntoMiniJsonObject(int dayIndex, JsonReader jsonReader) {

        JSONArray jsonArray = jsonReader.getJsonWeatherData();
        return jsonArray.getJSONObject(dayIndex - 1);
    }

    public String fetchMessage(String nameTown) {

        JsonReader jsonReader = new JsonReader();
        return jsonReader.fetchWeatherMessage(nameTown);
    }
}
