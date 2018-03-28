package w18comp1008s3mar28;

import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author JWright
 */
public class SuperDuperButtonHandler implements EventHandler
{
    @Override
    public void handle(Event event)
    {
        System.out.println("Hello World - interfaces are awesome!");
    }
}
