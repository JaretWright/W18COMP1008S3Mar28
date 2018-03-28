package w18comp1008s3mar28;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class GUIExampleViewController implements Initializable
{
    @FXML    private CheckBox homeworkCheckBox;
    @FXML    private CheckBox sleepCheckBox;
    @FXML    private CheckBox videoGameCheckBox;
    @FXML    private CheckBox netflixCheckBox;
    @FXML    private TextArea weekendTextArea;

    /**
     * Initializes the controller class - this method runs once when the
     * scene is loaded.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }   
    
    /**
     * This method will update the TextArea with the CheckBoxes
     * that are selected
     */
    public void updateWeekendTextArea()
    {
        String output = "This weekend I will....\n";
        
        if (this.homeworkCheckBox.isSelected())
            output += "->homework \n";
        
        if (this.sleepCheckBox.isSelected())
            output += "->sleep...so much\n";
        
        if (this.videoGameCheckBox.isSelected())
            output += "->play video games\n";
        
        if (this.netflixCheckBox.isSelected())
            output += "->watch Netflix";
        
        this.weekendTextArea.setText(output);
    }
    
}
