package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // إنشاء كائن BorderPane
        BorderPane borderPane = new BorderPane();

        // إنشاء عناصر لكل منطقة
        Label topLabel = new Label("Top");
        Label bottomLabel = new Label("Bottom");
        Label leftLabel = new Label("Left");
        Label rightLabel = new Label("Right");
        Label centerLabel = new Label("Center");

        // وضع العناصر في المناطق المناسبة
        borderPane.setTop(topLabel);
        borderPane.setBottom(bottomLabel);
        borderPane.setLeft(leftLabel);
        borderPane.setRight(rightLabel);
        borderPane.setCenter(centerLabel);

        // إعداد المشهد
        Scene scene = new Scene(borderPane, 400, 300);

        // اعرض المشهد
        primaryStage.setScene(scene);
        primaryStage.setTitle("BorderPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
