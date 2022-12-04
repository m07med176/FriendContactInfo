package friendsinfo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Elsawah
 */
public class FriendsInfo extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = new ControllerApp(stage);
        Scene scene = new Scene(root);
        String css = this.getClass().getResource("styles.css").toExternalForm();
        Scene scene2 = new Scene(root);
        /*Add the stylesheet quickly to the many scenes*/
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setScene(scene2);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
