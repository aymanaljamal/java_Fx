package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {

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

        Button saveButton = new Button("حفظ");

        // إنشاء GridPane وتحديد توجيهه
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10); // المسافة الأفقية بين العناصر
        gridPane.setVgap(5);  // المسافة الرأسية بين العناصر
        gridPane.setPadding(new Insets(30,50,50,30)); // الهامش الخارجي للـ GridPane

        // إضافة عناصر إلى GridPane
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);

        gridPane.add(phoneLabel, 0, 1);
        gridPane.add(phoneField, 1, 1);
        saveButton.setAlignment(Pos.CENTER);
        gridPane.add(saveButton,  3, 3); // توسيع الزر عبر عمودين

        // إعداد مشهد وعرض النافذة
        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setTitle("GridPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
