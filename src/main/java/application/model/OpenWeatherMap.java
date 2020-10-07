package application.model;

public class OpenWeatherMap {

    private static final String APIBASE = "http://api.openweathermap.org/data/2.5/forecast?q=";
    private static final String UNITS = "metric";
    private static final String LANG = "pl";
    private static final String APIKEY = "347d51e680aef0b1dc1e56c9851eaaf9";

    public static String getFullApi(String nameTown) {

        return APIBASE + nameTown + "&units=" + UNITS + "&appid=" + APIKEY + "&lang=" + LANG;
    }
}
