import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class JavaFX extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	@Override
	public void start(Stage primaryStage)throws Exception{
		primaryStage.setTitle("JavaFX");
		Button button = new Button();
        button.setText("Hello World");
        button.setOnAction(new EventHandler<ActionEvent>(){
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout,500,500);
		primaryStage.setScene(scene);
		primaryStage.show(); 
	}
}