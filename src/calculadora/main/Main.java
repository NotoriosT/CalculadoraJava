package calculadora.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    private  double posX;
    private  double posY;
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader;
        fxmlLoader = new FXMLLoader(Main.class.getResource("controlerCalculadora.fxml"));
        String css=getClass().getResource("/css/css.css").toExternalForm();
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(css);
        scene.setOnMousePressed(evento->{
            posX=stage.getX()-evento.getScreenX();
            posY=stage.getY()-evento.getScreenY();
        });
        scene.setOnMouseDragged(evento->{
            stage.setX(evento.getScreenX()+posX);
            stage.setY(evento.getScreenY()+posY);
        });
        scene.setFill(Color.TRANSPARENT);
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
    }
}
