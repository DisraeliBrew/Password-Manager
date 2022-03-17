// --== CS400 File Header Information ==--
// Name: Taylor Mehmen
// Email: tmehmen@wisc.edu
// Team: LD
// Role: BackEnd
// TA: Divyanshu
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
// Online sources:   //https://stackoverflow.com/questions/47113915/javafx-invoking-java-methods-using-javascript
//                   This site was used to help figure out how to connect JavaFX
//                   controller to java and Javascript to call java backend
//                   methods from events
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
// to be used through this activity
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import netscape.javascript.JSObject;
import javafx.concurrent.Worker.State;


public class Controller implements Initializable {
    private WebEngine webEngine;
    private DataProcessor dataProcessor= new DataProcessor();
    @FXML private WebView webView;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //URL url = this.getClass().getResource("C:/Users/Taylor/IdeaProjects/project-four-ld/Application/src/index.html");
        URL url = getClass().getResource("index.html");
        webEngine = webView.getEngine();
        webEngine.load(url.toExternalForm());
        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<State>() {
            @Override
            public void changed(ObservableValue<? extends State> observableValue, State oldState, State newState) {
                if (newState == State.SUCCEEDED) {
                    JSObject window = (JSObject) webEngine.executeScript("window");
                    /* The two objects are named using the setMember() method. */
                    window.setMember("controller", dataProcessor);
                }
            }
        });
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
