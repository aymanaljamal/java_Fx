package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HBoxVBoxExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // إنشاء وتكوين عناصر واجهة المستخدم
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        // إنشاء HBox وتحديد توجيهه
        HBox hBox = new HBox(10); // 10 هو التساف بين العناصر
        hBox.setPadding(new Insets(10)); // هامش خارجي للـ HBox
        hBox.getChildren().addAll(button1, button2, button3);
        hBox.setAlignment(Pos.CENTER);
        // إنشاء VBox وتحديد توجيهه
        VBox vBox = new VBox(10); // 10 هو التساف بين العناصر
        vBox.setPadding(new Insets(10)); // هامش خارجي للـ VBox
        vBox.getChildren().addAll(button1, button2, button3);

        // إعداد المشهد وعرض النافذة
        Scene hBoxScene = new Scene(hBox, 300, 100);
        Scene vBoxScene = new Scene(vBox, 300, 100);
        vBox.setAlignment(Pos.CENTER);
        primaryStage.setTitle("HBox and VBox Example");
        primaryStage.setScene( vBoxScene);
        primaryStage.show();

        // يمكنك تغيير السطر التالي لعرض VBox بدلاً من HBox
        // primaryStage.setScene(vBoxScene);
    }
}
