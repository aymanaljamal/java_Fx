package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UserFormApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // إنشاء وتكوين عناصر واجهة المستخدم
        Label nameLabel = new Label("الاسم:");
        TextField nameField = new TextField();

        Label phoneLabel = new Label("رقم الهاتف:");
        TextField phoneField = new TextField();

        Button submitButton = new Button("إرسال");

        // إنشاء GridPane وتحديد توجيهه وتسافاته
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10); // المسافة الأفقية بين العناصر
        gridPane.setVgap(5);  // المسافة الرأسية بين العناصر
        gridPane.setPadding(new Insets(10)); // الهامش الخارجي للـ GridPane

        // إضافة عناصر إلى GridPane
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);

        gridPane.add(phoneLabel, 0, 1);
        gridPane.add(phoneField, 1, 1);

        // إنشاء VBox وتحديد توجيهه
        VBox vBox = new VBox(10); // 10 هو التساف بين العناصر
        vBox.setPadding(new Insets(10)); // هامش خارجي للـ VBox
        vBox.getChildren().addAll(gridPane, submitButton);

        // إعداد المشهد وعرض النافذة
        Scene scene = new Scene(vBox, 300, 200);
        primaryStage.setTitle("User Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
