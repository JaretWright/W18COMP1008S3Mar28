package w18comp1008s3mar28;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author JWright
 */
public class LaunchGUIView extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //If you receive a "location not set" error, it means you most likely
        //have a spelling mistake in the fxml file name
        Parent root = FXMLLoader.load(getClass().getResource("GUIExampleView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("GUI Examples-JavaFX is so cool");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
