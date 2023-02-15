import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;



public class Car extends Pane {
//fields 
private double x = 0;
private double y = 100;
private double radius = 5;
private Rectangle rectangle;
private Polygon polygon;
private Circle wheel1;
private Circle wheel2;
private Timeline animation;
	
	public Car() {
		// TODO Auto-generated constructor stub
		drawCar();
		animation = new Timeline(
			new KeyFrame(Duration.millis(50), e -> moveCar()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
	}

	/** Create a car an place it in the pane */
	private void drawCar() {
		getChildren().clear();
		rectangle = new Rectangle(x, y - 20, 50, 10);
		polygon = new Polygon(x + 10, y - 20, x + 20, y - 30, x + 30, 
			y - 30, x + 40, y - 20);
		wheel1 = new Circle(x + 15, y - 5, radius);
		wheel2 = new Circle(x + 35, y - 5, radius);
		getChildren().addAll(rectangle, wheel1, wheel2, polygon);
	}

	/** Pause animation */
	public void pause() {
		animation.pause();
	}

	/** Play animation */
	public void play() {
		animation.play();
	}

	/** Increase rate by 1 */
	public void increaseSpeed() {
		animation.setRate(animation.getRate() + 1);
	}

	/** decrease rate by 1 */
	public void decreaseSpeed() {
		animation.setRate(animation.getRate() > 0 ? animation.getRate() - 1 : 0);
	}

	/** Redraw car with new x value */
	protected void moveCar() {
		if (x <= getWidth()) {
			x += 1;	
		} 
		else
			x = 0;

		drawCar();
	}

	public Car(Node... arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}

