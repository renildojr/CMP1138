package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	public Stage stage;
	@Override
	public void start(Stage primaryStage) {
		try {

			stage = primaryStage;
			AnchorPane root = new AnchorPane();
    		root =   FXMLLoader.load(getClass().getResource("/com/exemplocrudfx/view/MenuSistema.fxml"));

			javafx.geometry.Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
			Scene scene = new Scene(root,screenBounds.getWidth(),screenBounds.getHeight());
			
			stage.setScene(scene);
			stage.setTitle("Menu Geral do Sistema");
			stage.show();

			
/*			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
*/
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
