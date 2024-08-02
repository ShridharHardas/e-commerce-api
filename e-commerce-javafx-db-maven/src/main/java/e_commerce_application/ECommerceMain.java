package e_commerce_application;

import common.StageHolder;
import javafx.application.Application;
import javafx.stage.Stage;
import login.LoginScreen;

public class ECommerceMain extends Application{

	public static void main(String[] args) {
		Application.launch(args);

	}
	@Override
	public void start(Stage stageProvidedByJavafx) throws Exception {
		StageHolder.stage=stageProvidedByJavafx;
		new LoginScreen().show();
		
	}

}
