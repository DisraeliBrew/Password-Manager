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
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        /* The root layout of the application, an FXML contains the WebView layout. */
        Parent root = FXMLLoader.load(Main.class.getResource("/main.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
