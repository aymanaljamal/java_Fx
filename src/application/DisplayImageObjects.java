package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplayImageObjects extends Application {

    @Override
    public void start(Stage primaryStage) {
        // احصل على صورة من ملف
        Image image = new Image(
                "file:/path/to/your/image/png-transparent-emoji-smile-eye-emoticon-emoji-face-smiley-eye.png");

        // إنشاء كائن ImageView
        ImageView imageView = new ImageView(image);

        // إنشاء مجموعة لعرض الأشياء في الصورة
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER); // توسيط العناصر في الـ GridPane

        // إنشاء مستطيلات للعرض مع أطراف دائرية
        double rectangleWidth = 100;
        double rectangleHeight = 50;

        Rectangle firstNameRectangle = createRoundedRectangle(rectangleWidth, rectangleHeight, Color.RED);
        Rectangle lastNameRectangle = createRoundedRectangle(rectangleWidth, rectangleHeight, Color.GREEN);

        // إنشاء نصوص
        Text text1 = new Text("الاسم الأول");
        Text text2 = new Text("اسم العائلة");
        Label ayman = new Label("مثال على النص");

        // إعداد العناصر في الـ GridPane
        gridPane.add(text1, 0, 0);
        gridPane.add(text2, 0, 1);

        gridPane.add(firstNameRectangle, 1, 0);
        gridPane.add(lastNameRectangle, 1, 1);

        Pane a1 = new Pane();
        a1.getChildren().add(imageView);
        gridPane.add(a1, 2, 0);
        gridPane.add(ayman, 2, 1);

        // إعداد المشهد
        Scene scene = new Scene(gridPane, image.getWidth() + 200, image.getHeight() + 200);

        // اعرض المشهد
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Rectangle createRoundedRectangle(double width, double height, Color color) {
        Rectangle roundedRectangle = new Rectangle(width, height);
        roundedRectangle.setArcWidth(20); // نصف قطر الدائرة للزاوية الأفقية
        roundedRectangle.setArcHeight(20); // نصف قطر الدائرة للزاوية الرأسية
        roundedRectangle.setFill(color);
        return roundedRectangle;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
