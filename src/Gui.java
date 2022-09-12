import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Gui extends Application {

    private final int WIDTH = 500;
    private final int HEIGHT = 500;

    @Override
    public void start(Stage stage) {
        Pane root = initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Meyer");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(WIDTH, HEIGHT);
        drawShapes(pane);
        return pane;
    }
    private void drawShapes(Pane pane) {
        Rectangle bg = new Rectangle(0, 0, 500, 500);
        pane.getChildren().add(bg);
        bg.setFill(Color.GRAY);

        //Dice
        Rectangle dice1 = new Rectangle(50, 100, 150, 150);
        pane.getChildren().add(dice1);
        dice1.setFill(Color.WHITE);

        Rectangle dice2 = new Rectangle(300, 100, 150, 150);
        pane.getChildren().add(dice2);
        dice2.setFill(Color.WHITE);
    }
}