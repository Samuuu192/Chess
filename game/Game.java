package chess.game;

import javafx.application.Application;

import javafx.stage.Screen;
import javafx.geometry.Rectangle2D;

import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

public class Game extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Rectangle2D size = Screen.getPrimary().getBounds();
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("../stuff/GameScreen.fxml"));
			Scene scene = new Scene(root,size.getMaxX(),size.getMaxY());
			scene.getStylesheets().add(getClass().getResource("../stuff/GameStyle.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.resizableProperty().setValue(Boolean.FALSE);
			primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
