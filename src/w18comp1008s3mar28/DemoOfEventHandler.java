package w18comp1008s3mar28;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author JWright
 */
public class DemoOfEventHandler extends Application
{
    
    @Override
    public void start(Stage primaryStage)
    {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        
//        SuperDuperButtonHandler btnHandler = new SuperDuperButtonHandler();
//        btn.setOnAction(btnHandler);
        
        //use of an annonymous inner class
//        btn.setOnAction(new EventHandler<ActionEvent>()
//        {
//            @Override
//            public void handle(ActionEvent event)
//            {
//                System.out.println("Hello World!");
//            }
//        });

         //the same thing with a Lambda expression
         btn.setOnAction((event) -> System.out.println("lambda's are easy to read"));
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
