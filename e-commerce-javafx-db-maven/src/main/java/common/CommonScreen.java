package common;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class CommonScreen {
	public void show()
	{
		String myclassName=getClass().getSimpleName();
		String classFilePath=getClass().getResource(myclassName+".class").toString();
		String fxmlFilePath=classFilePath.replace(".class", ".fxml");
		String actualPath=fxmlFilePath.substring(8);
		URL fxmlLoaderFile;
		try {
			fxmlLoaderFile = Paths.get(actualPath).toUri().toURL();
			Parent actorGroup=FXMLLoader.load(fxmlLoaderFile);
			Scene scene=new Scene(actorGroup,1300,800);
			StageHolder.stage.setScene(scene);
			StageHolder.stage.show();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
