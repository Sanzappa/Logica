package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Group root = new Group();
		Scene scene = new Scene(root, Color.BLACK);
		
		Image icon = new Image("stardew valley logo.png");
		stage.getIcons().add(icon);
		stage.setTitle("Is this");
		
		stage.setScene(scene);
		stage.show();
	}
}
