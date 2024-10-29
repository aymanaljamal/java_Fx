package application;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // إنشاء FlowPane
        FlowPane flowPane = new FlowPane();
        
        // إضافة بعض الأزرار
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        flowPane.getChildren().addAll(button1, button2, button3);

        // تحديد المسافات بين العناصر
        flowPane.setHgap(10); // المسافة الأفقية
        flowPane.setVgap(50);  // المسافة الرأسية

        // تحديد موقف العناصر داخل FlowPane
        flowPane.setAlignment(Pos.TOP_CENTER);

        // تحديد توجيه FlowPane
        flowPane.setOrientation(Orientation.VERTICAL); // يمكن تعيينه أيضًا إلى Orientation.VERTICAL لتوجيه رأسي.
        flowPane.setColumnHalignment(HPos.RIGHT);
        // إعداد المشهد وعرض النافذة
        Scene scene = new Scene(flowPane, 300, 200);
        primaryStage.setTitle("FlowPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
