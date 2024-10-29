package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // إنشاء دائرة
        Circle circle = new Circle(50, Color.GREEN);

        // تعيين موقع الدائرة
        circle.setCenterX(100);
        circle.setCenterY(75);
       
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.CHOCOLATE);
        StackPane root = new StackPane();
        root.getChildren().add(circle);

        Scene scene = new Scene(root, 200, 150);
        primaryStage.setTitle("Circle Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
