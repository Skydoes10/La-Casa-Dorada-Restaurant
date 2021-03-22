package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.LaCasaDorada;

public class Main extends Application{
	
	private LaCasaDoradaGUI laCDGUI;
	private LaCasaDorada laCD;

	public Main() {
		laCD = new LaCasaDorada();
		laCDGUI = new LaCasaDoradaGUI(laCD);
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
		fxmlLoader.setController(laCDGUI);
		Parent root = fxmlLoader.load();		
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("La Casa Dorada");
		primaryStage.show();
	}

}
