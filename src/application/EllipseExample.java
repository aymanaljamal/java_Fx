package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class EllipseExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // إنشاء إليبس
        Ellipse ellipse = new Ellipse(80, 50);
        ellipse.setFill(Color.ORANGE);

        // تعيين موقع الإليبس
        ellipse.setCenterX(100);
        ellipse.setCenterY(75);

        StackPane root = new StackPane();
        root.getChildren().add(ellipse);

        Scene scene = new Scene(root, 200, 150);
        primaryStage.setTitle("Ellipse Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
