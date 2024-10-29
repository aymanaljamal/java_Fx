package application;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class ShapeExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // إنشاء مستطيل
    	Rectangle rectangle = new Rectangle(50, 50, 100, 80);
        rectangle.setFill(Color.BLUE);
       
        rectangle.setArcHeight(50/2);
        rectangle.setArcWidth(50/2);
        StackPane root = new StackPane();
        root.getChildren().add(rectangle);
        
        Scene scene = new Scene(root, 200, 150);
        primaryStage.setTitle("Shape Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
