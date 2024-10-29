package application;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // إنشاء نص
        Text text = new Text(50,60,"Hello, JavaFX!");
        text.setFont(new Font(20));
        Label ayman=  new Label("hi iam ayman");
        ayman.setFont(new Font(50));
        ayman.setAlignment(Pos.BOTTOM_CENTER);
        StackPane root = new StackPane();
        root.getChildren().addAll(text,ayman);

        Scene scene = new Scene(root, 300, 100);
        primaryStage.setTitle("Text Example");
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
