import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class Driver extends Application {
	public Driver() {
		
		
	}
	
	@Override //override the start method
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		Car pane = new Car();

		// Create handles
		pane.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.UP) {
				pane.increaseSpeed();
			}
			else if (e.getCode() == KeyCode.DOWN) {
				pane.decreaseSpeed();
			} else if (e.getCode() == KeyCode.ENTER) {
				pane.pause();
			}
			else if (e.getCode() == KeyCode.SHIFT) {
				pane.play();
			}
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 800, 200);
		primaryStage.setTitle("Project 6"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		pane.requestFocus(); // Request focus
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
