package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class PolylineExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // إنشاء متعدد الخطوط
    	Polyline polyline = new Polyline(0, 0, 40, 0, 40, 40, 0, 40, 0, 0);
        polyline.setStroke(Color.BLUE);
        polyline.setFill(Color.LIGHTGRAY);
        polyline.setStrokeWidth(3);

        StackPane root = new StackPane();
        root.getChildren().add(polyline);

        Scene scene = new Scene(root, 200, 150);
        primaryStage.setTitle("Polyline Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
