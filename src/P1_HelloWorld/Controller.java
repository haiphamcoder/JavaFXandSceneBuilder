package P1_HelloWorld;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    void printHelloWorld(MouseEvent event) {
        System.out.println("Hello World!");
    }

}