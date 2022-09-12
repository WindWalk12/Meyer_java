import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
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
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

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

        Button rollButton = new Button("Roll");
        rollButton.setDefaultButton(true);
        rollButton.setMaxSize(200, 50);
        rollButton.setTextAlignment(TextAlignment.CENTER);
        rollButton.setAlignment(Pos.BOTTOM_CENTER);
        root.getChildren().add(rollButton);
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

        //Dice 1
        Rectangle dice1 = new Rectangle(50, 100, 150, 150);
        pane.getChildren().add(dice1);
        dice1.setFill(Color.WHITE);

        //Eyes 1
        Circle eye1 = new Circle(82, 125, 15);
        pane.getChildren().add(eye1);
        eye1.setFill(Color.BLACK);

        Circle eye2 = new Circle(82, 170, 15);
        pane.getChildren().add(eye2);
        eye2.setFill(Color.BLACK);

        Circle eye3 = new Circle(82, 215, 15);
        pane.getChildren().add(eye3);
        eye3.setFill(Color.BLACK);

        Circle eye4 = new Circle(165, 125, 15);
        pane.getChildren().add(eye4);
        eye4.setFill(Color.BLACK);

        Circle eye5 = new Circle(165, 170, 15);
        pane.getChildren().add(eye5);
        eye5.setFill(Color.BLACK);

        Circle eye6 = new Circle(165, 215, 15);
        pane.getChildren().add(eye6);
        eye6.setFill(Color.BLACK);

        Circle eye7 = new Circle(123, 170, 15);
        pane.getChildren().add(eye7);
        eye7.setFill(Color.BLACK);

        // Dice 2
        Rectangle dice2 = new Rectangle(300, 100, 150, 150);
        pane.getChildren().add(dice2);
        dice2.setFill(Color.WHITE);

        //Eyes 2
        Circle eye8 = new Circle(332, 125, 15);
        pane.getChildren().add(eye8);
        eye8.setFill(Color.BLACK);

        Circle eye9 = new Circle(332, 170, 15);
        pane.getChildren().add(eye9);
        eye9.setFill(Color.BLACK);

        Circle eye10 = new Circle(332, 215, 15);
        pane.getChildren().add(eye10);
        eye10.setFill(Color.BLACK);

        Circle eye11 = new Circle(415, 125, 15);
        pane.getChildren().add(eye11);
        eye11.setFill(Color.BLACK);

        Circle eye12 = new Circle(415, 170, 15);
        pane.getChildren().add(eye12);
        eye12.setFill(Color.BLACK);

        Circle eye13 = new Circle(415, 215, 15);
        pane.getChildren().add(eye13);
        eye13.setFill(Color.BLACK);

        Circle eye14 = new Circle(373, 170, 15);
        pane.getChildren().add(eye14);
        eye14.setFill(Color.BLACK);

    }
}