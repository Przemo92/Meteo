package application.controller;

public class Messages {

    public static final String CITY_MISSING = "city not found";
    public static final String WRONG_NAME_TOWN = "Wpisano błędną nazwę miasta";
    public static final String SET_NAME_TOWN = "Proszę wpisz nazwę miasta";
    public static final String CONNECTION_PROBLEM_TEXT = "Problem z połączeniem";
    public static String exceptionLabelText = "";

    public static void setExceptionLabelText(String exceptionLabelText) {
        Messages.exceptionLabelText = exceptionLabelText;
    }
}
