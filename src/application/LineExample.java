package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LineExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // إنشاء خط
        Line line = new Line(10, 10,1000, 10);

        StackPane root = new StackPane();
        root.getChildren().add(line);

        Scene scene = new Scene(root, 300, 150);
        primaryStage.setTitle("Line Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
