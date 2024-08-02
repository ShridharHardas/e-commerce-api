package print_user;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

public class PrintUserController implements Initializable {
	@FXML
	 public ChoiceBox<String> mychoice;
	String choice[]= {"Male","Female","Other"};
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		mychoice.getItems().addAll(choice);

}
}
