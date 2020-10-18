package application.controller;

import com.google.gson.JsonArray;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import application.model.ForecastDataWeather;
import application.model.JsonReader;
import application.view.ViewFactory;
import org.json.JSONArray;

import java.net.URL;
import java.util.ResourceBundle;

import static application.controller.Messages.*;


public class MainWindowController extends BaseController implements Initializable {

    private String nameTown1 = "LONDYN";
    private String nameTown2 = "POZNAŃ";

    @FXML
    private Label temperatureLabel1;

    @FXML
    private Label iconLabel1;

    @FXML
    private Label firstDay;

    @FXML
    private Label secondDay;

    @FXML
    private Label thirdDay;

    @FXML
    private Label fourthDay;

    @FXML
    private Label fifthDay;

    @FXML
    private Label time1;

    @FXML
    private Label time2;

    @FXML
    private Label time3;

    @FXML
    private Label time4;

    @FXML
    private Label time5;

    @FXML
    private Label time6;

    @FXML
    private Label time7;

    @FXML
    private Label time8;

    @FXML
    private Label temperatureLabel2;

    @FXML
    private Label iconLabel2;

    @FXML
    private Label temperatureLabel3;

    @FXML
    private Label iconLabel3;

    @FXML
    private Label temperatureLabel4;

    @FXML
    private Label iconLabel4;

    @FXML
    private Label temperatureLabel5;

    @FXML
    private Label iconLabel5;

    @FXML
    private Label temperatureLabel6;

    @FXML
    private Label iconLabel6;

    @FXML
    private Label temperatureLabel7;

    @FXML
    private Label iconLabel7;

    @FXML
    private Label temperatureLabel8;

    @FXML
    private Label iconLabel8;

    @FXML
    private Label temperatureLabel9;

    @FXML
    private Label iconLabel9;

    @FXML
    private Label temperatureLabel10;

    @FXML
    private Label iconLabel10;

    @FXML
    private Label temperatureLabel11;

    @FXML
    private Label iconLabel11;

    @FXML
    private Label temperatureLabel12;

    @FXML
    private Label iconLabel12;

    @FXML
    private Label temperatureLabel13;

    @FXML
    private Label iconLabel13;

    @FXML
    private Label temperatureLabel14;

    @FXML
    private Label iconLabel14;

    @FXML
    private Label temperatureLabel15;

    @FXML
    private Label iconLabel15;

    @FXML
    private Label temperatureLabel16;

    @FXML
    private Label iconLabel16;

    @FXML
    private Label temperatureLabel17;

    @FXML
    private Label iconLabel17;

    @FXML
    private Label temperatureLabel18;

    @FXML
    private Label iconLabel18;

    @FXML
    private Label temperatureLabel19;

    @FXML
    private Label iconLabel19;

    @FXML
    private Label temperatureLabel20;

    @FXML
    private Label iconLabel20;

    @FXML
    private Label temperatureLabel21;

    @FXML
    private Label iconLabel21;

    @FXML
    private Label temperatureLabel22;

    @FXML
    private Label iconLabel22;

    @FXML
    private Label temperatureLabel23;

    @FXML
    private Label iconLabel23;

    @FXML
    private Label temperatureLabel24;

    @FXML
    private Label iconLabel24;

    @FXML
    private Label temperatureLabel25;

    @FXML
    private Label iconLabel25;

    @FXML
    private Label temperatureLabel26;

    @FXML
    private Label iconLabel26;

    @FXML
    private Label temperatureLabel27;

    @FXML
    private Label iconLabel27;

    @FXML
    private Label temperatureLabel28;

    @FXML
    private Label iconLabel28;

    @FXML
    private Label temperatureLabel29;

    @FXML
    private Label iconLabel29;

    @FXML
    private Label temperatureLabel30;

    @FXML
    private Label iconLabel30;

    @FXML
    private Label temperatureLabel31;

    @FXML
    private Label iconLabel31;

    @FXML
    private Label temperatureLabel32;

    @FXML
    private Label iconLabel32;

    @FXML
    private Label temperatureLabel33;

    @FXML
    private Label iconLabel33;

    @FXML
    private Label temperatureLabel34;

    @FXML
    private Label iconLabel34;

    @FXML
    private Label temperatureLabel35;

    @FXML
    private Label iconLabel35;

    @FXML
    private Label temperatureLabel36;

    @FXML
    private Label iconLabel36;

    @FXML
    private Label temperatureLabel37;

    @FXML
    private Label iconLabel37;

    @FXML
    private Label temperatureLabel38;

    @FXML
    private Label iconLabel38;

    @FXML
    private Label temperatureLabel39;

    @FXML
    private Label iconLabel39;

    @FXML
    private Label temperatureLabel40;

    @FXML
    private Label iconLabel40;

    @FXML
    private Label errorLabel1;

    @FXML
    private Label errorLabel2;

    @FXML
    private Label exceptionLabel;

    @FXML
    private Label nameTownLabel1;

    @FXML
    private TextField textField1;

    @FXML
    private Label temperatureLabel41;

    @FXML
    private Label iconLabel41;

    @FXML
    private Label firstDay2;

    @FXML
    private Label secondDay2;

    @FXML
    private Label thirdDay2;

    @FXML
    private Label fourthDay2;

    @FXML
    private Label fifthDay2;

    @FXML
    private Label time9;

    @FXML
    private Label time10;

    @FXML
    private Label time11;

    @FXML
    private Label time12;

    @FXML
    private Label time13;

    @FXML
    private Label time614;

    @FXML
    private Label time15;

    @FXML
    private Label time16;

    @FXML
    private Label temperatureLabel42;

    @FXML
    private Label iconLabel42;

    @FXML
    private Label temperatureLabel43;

    @FXML
    private Label iconLabel43;

    @FXML
    private Label temperatureLabel44;

    @FXML
    private Label iconLabel44;

    @FXML
    private Label temperatureLabel45;

    @FXML
    private Label iconLabel45;

    @FXML
    private Label temperatureLabel46;

    @FXML
    private Label iconLabel46;

    @FXML
    private Label temperatureLabel47;

    @FXML
    private Label iconLabel47;

    @FXML
    private Label temperatureLabel48;

    @FXML
    private Label iconLabel48;

    @FXML
    private Label temperatureLabel49;

    @FXML
    private Label iconLabel49;

    @FXML
    private Label temperatureLabel50;

    @FXML
    private Label iconLabel50;

    @FXML
    private Label temperatureLabel51;

    @FXML
    private Label iconLabel51;

    @FXML
    private Label temperatureLabel52;

    @FXML
    private Label iconLabel52;

    @FXML
    private Label temperatureLabel53;

    @FXML
    private Label iconLabel53;

    @FXML
    private Label temperatureLabel54;

    @FXML
    private Label iconLabel54;

    @FXML
    private Label temperatureLabel55;

    @FXML
    private Label iconLabel55;

    @FXML
    private Label temperatureLabel56;

    @FXML
    private Label iconLabel56;

    @FXML
    private Label temperatureLabel57;

    @FXML
    private Label iconLabel57;

    @FXML
    private Label temperatureLabel58;

    @FXML
    private Label iconLabel58;

    @FXML
    private Label temperatureLabel59;

    @FXML
    private Label iconLabel59;

    @FXML
    private Label temperatureLabel60;

    @FXML
    private Label iconLabel60;

    @FXML
    private Label temperatureLabel61;

    @FXML
    private Label iconLabel61;

    @FXML
    private Label temperatureLabel62;

    @FXML
    private Label iconLabel62;

    @FXML
    private Label temperatureLabel63;

    @FXML
    private Label iconLabel63;

    @FXML
    private Label temperatureLabel64;

    @FXML
    private Label iconLabel64;

    @FXML
    private Label temperatureLabel65;

    @FXML
    private Label iconLabel65;

    @FXML
    private Label temperatureLabel66;

    @FXML
    private Label iconLabel66;

    @FXML
    private Label temperatureLabel67;

    @FXML
    private Label iconLabel67;

    @FXML
    private Label temperatureLabel68;

    @FXML
    private Label iconLabel68;

    @FXML
    private Label temperatureLabel69;

    @FXML
    private Label iconLabel69;

    @FXML
    private Label temperatureLabel70;

    @FXML
    private Label iconLabel70;

    @FXML
    private Label temperatureLabel71;

    @FXML
    private Label iconLabel71;

    @FXML
    private Label temperatureLabel72;

    @FXML
    private Label iconLabel72;

    @FXML
    private Label temperatureLabel73;

    @FXML
    private Label iconLabel73;

    @FXML
    private Label temperatureLabel74;

    @FXML
    private Label iconLabel74;

    @FXML
    private Label temperatureLabel75;

    @FXML
    private Label iconLabel75;

    @FXML
    private Label temperatureLabel76;

    @FXML
    private Label iconLabel76;

    @FXML
    private Label temperatureLabel77;

    @FXML
    private Label iconLabel77;

    @FXML
    private Label temperatureLabel78;

    @FXML
    private Label iconLabel78;

    @FXML
    private Label temperatureLabel79;

    @FXML
    private Label iconLabel79;

    @FXML
    private Label temperatureLabel80;

    @FXML
    private Label iconLabel80;

    @FXML
    private Label errorLabel11;

    @FXML
    private Label nameTownLabel2;

    @FXML
    private TextField textField2;

    private ForecastDataWeather forecastDataWeather = new ForecastDataWeather();

    public MainWindowController(ViewFactory viewFactory, String fxmlName) {
        super(viewFactory, fxmlName);
    }

    @FXML
    void foundAction2() {

        nameTown2 = textField2.getText().toUpperCase();

        if (fieldsAreValid2()) {

            setExceptionLabelText("");
            inputDataIntoObjects2();
            exceptionLabel.setText(exceptionLabelText);
        }
    }

    @FXML
    void foundAction1() {

        nameTown1 = textField1.getText().toUpperCase();
        if (fieldsAreValid1()) {

            setExceptionLabelText("");
            inputDataIntoObjects1();
            exceptionLabel.setText(exceptionLabelText);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        inputDataIntoObjects1();
        inputDataIntoObjects2();

        exceptionLabel.setText(exceptionLabelText);
    }

    public void inputDataIntoObjects1() {

        JsonReader jsonReader = new JsonReader();
        JSONArray jsonArray = jsonReader.transformJsonObjectToArray(nameTown1);
        nameTownLabel1.setText(nameTown1);
        errorLabel1.setText("");

        setLabelsWithDateAndTime(jsonArray);

        setIconAndTemperatureIntoLabels(temperatureLabel1, iconLabel1, 1, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel2, iconLabel2, 2, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel3, iconLabel3, 3, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel4, iconLabel4, 4, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel5, iconLabel5, 5, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel6, iconLabel6, 6, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel7, iconLabel7, 7, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel8, iconLabel8, 8, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel9, iconLabel9, 9, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel10, iconLabel10, 10, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel11, iconLabel11, 11, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel12, iconLabel12, 12, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel13, iconLabel13, 13, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel14, iconLabel14, 14, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel15, iconLabel15, 15, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel16, iconLabel16, 16, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel17, iconLabel17, 17, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel18, iconLabel18, 18, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel19, iconLabel19, 19, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel20, iconLabel20, 20, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel21, iconLabel21, 21, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel22, iconLabel22, 22, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel23, iconLabel23, 23, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel24, iconLabel24, 24, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel25, iconLabel25, 25, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel26, iconLabel26, 26, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel27, iconLabel27, 27, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel28, iconLabel28, 28, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel29, iconLabel29, 29, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel30, iconLabel30, 30, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel31, iconLabel31, 31, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel32, iconLabel32, 32, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel33, iconLabel33, 33, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel34, iconLabel34, 34, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel35, iconLabel35, 35, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel36, iconLabel36, 36, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel37, iconLabel37, 37, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel38, iconLabel38, 38, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel39, iconLabel39, 39, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel40, iconLabel40, 40, jsonArray);
    }

    public void inputDataIntoObjects2() {

        JsonReader jsonReader = new JsonReader();
        JSONArray jsonArray = jsonReader.transformJsonObjectToArray(nameTown2);
        nameTownLabel2.setText(nameTown2);
        errorLabel2.setText("");

        setIconAndTemperatureIntoLabels(temperatureLabel41, iconLabel41, 1, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel42, iconLabel42, 2, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel43, iconLabel43, 3, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel44, iconLabel44, 4, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel45, iconLabel45, 5, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel46, iconLabel46, 6, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel47, iconLabel47, 7, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel48, iconLabel48, 8, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel49, iconLabel49, 9, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel50, iconLabel50, 10, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel51, iconLabel51, 11, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel52, iconLabel52, 12, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel53, iconLabel53, 13, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel54, iconLabel54, 14, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel55, iconLabel55, 15, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel56, iconLabel56, 16, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel57, iconLabel57, 17, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel58, iconLabel58, 18, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel59, iconLabel59, 19, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel60, iconLabel60, 20, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel61, iconLabel61, 21, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel62, iconLabel62, 22, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel63, iconLabel63, 23, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel64, iconLabel64, 24, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel65, iconLabel65, 25, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel66, iconLabel66, 26, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel67, iconLabel67, 27, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel68, iconLabel68, 28, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel69, iconLabel69, 29, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel70, iconLabel70, 30, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel71, iconLabel71, 31, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel72, iconLabel72, 32, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel73, iconLabel73, 33, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel74, iconLabel74, 34, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel75, iconLabel75, 35, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel76, iconLabel76, 36, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel77, iconLabel77, 37, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel78, iconLabel78, 38, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel79, iconLabel79, 39, jsonArray);
        setIconAndTemperatureIntoLabels(temperatureLabel80, iconLabel80, 40, jsonArray);
    }

    private void setLabelsWithDateAndTime(JSONArray jsonArray) {

        firstDay.setText(forecastDataWeather.fetchDate(1, jsonArray));
        secondDay.setText(forecastDataWeather.fetchDate(9, jsonArray));
        thirdDay.setText(forecastDataWeather.fetchDate(17, jsonArray));
        fourthDay.setText(forecastDataWeather.fetchDate(25, jsonArray));
        fifthDay.setText(forecastDataWeather.fetchDate(34, jsonArray));

        time1.setText(forecastDataWeather.fetchTime(1, jsonArray));
        time2.setText(forecastDataWeather.fetchTime(2, jsonArray));
        time3.setText(forecastDataWeather.fetchTime(3, jsonArray));
        time4.setText(forecastDataWeather.fetchTime(4, jsonArray));
        time5.setText(forecastDataWeather.fetchTime(5, jsonArray));
        time6.setText(forecastDataWeather.fetchTime(6, jsonArray));
        time7.setText(forecastDataWeather.fetchTime(7, jsonArray));
        time8.setText(forecastDataWeather.fetchTime(8, jsonArray));

        firstDay2.setText(firstDay.getText());
        secondDay2.setText(secondDay.getText());
        thirdDay2.setText(thirdDay.getText());
        fourthDay2.setText(fourthDay.getText());
        fifthDay2.setText(fifthDay.getText());

        time9.setText(time1.getText());
        time10.setText(time2.getText());
        time11.setText(time3.getText());
        time12.setText(time4.getText());
        time13.setText(time5.getText());
        time614.setText(time6.getText());
        time15.setText(time7.getText());
        time16.setText(time8.getText());
    }

    private void setIconAndTemperatureIntoLabels(Label temperatureLabel, Label iconLabel,
                                                 int dayIndex, JSONArray jsonArray) {
        temperatureLabel.setText(forecastDataWeather.fetchTemperature(dayIndex, jsonArray) + "°C");
        iconLabel.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + forecastDataWeather.fetchIcon(dayIndex, jsonArray) + ".png"));
    }

    private boolean fieldsAreValid1() {

        return fieldsAreValid(nameTown1, textField1, errorLabel1);
    }

    private boolean fieldsAreValid2() {

        return fieldsAreValid(nameTown2, textField2, errorLabel2);
    }

    private boolean fieldsAreValid(String nameTown, TextField textField, Label errorLabel) {

        String msg = forecastDataWeather.fetchMessage(nameTown);

        if (textField.getText().isEmpty()) {
            errorLabel.setText(SET_NAME_TOWN);
            return false;
        }
        if (msg.equals(CITY_MISSING)) {
            errorLabel.setText(WRONG_NAME_TOWN);
            return false;
        }
        return true;
    }
}
