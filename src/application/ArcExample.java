package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class ArcExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // إنشاء قوس
        Arc arc = new Arc(100, 75, 30, 10, -180, 180);
       
        arc.setType(ArcType.CHORD);
        arc.setFill(Color.WHITE);
        arc.setStroke(Color.RED);

        StackPane root = new StackPane();
        root.getChildren().add(arc);

        Scene scene = new Scene(root, 200, 150);
        primaryStage.setTitle("Arc Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
