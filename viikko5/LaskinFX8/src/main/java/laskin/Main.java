package laskin;


import javafx.*;

public class Main extends Application{

    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
            
        GraafinenLaskin nakyma = new GraafinenLaskin();
        pane.getChildren().add(nakyma);

        Scene scene = new Scene(pane, 200, 120);
        
        primaryStage.setTitle("graafinen laskin");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        System.out.println("foo");
        launch(args);
    }
}
