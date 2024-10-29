package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class PolygonExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // إنشاء مضلع
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll( 80.0, 60.0,50.0,10.0, 20.0, 60.0,50.0,50.0);
        polygon.setFill(Color.GREEN);

        StackPane root = new StackPane();
        root.getChildren().add(polygon);

        Scene scene = new Scene(root, 200, 150);
        primaryStage.setTitle("Polygon Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
