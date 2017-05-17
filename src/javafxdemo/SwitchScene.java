package javafxdemo;



import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class SwitchScene extends Application  {
	
	Scene scene2, scene1;

	public static void main(String[] args) {
		launch(args);

	}
	
	@Override
	public void start(Stage primaryScene) throws Exception{
		
		//content of the scene
		Label l1 = new Label("Switch scenes demo");
		//button 1 to go to scene 2
		Button b1 = new Button("Go to scene2");
		b1.setOnAction(e -> primaryScene.setScene(scene2));
		
		//vertical layout
		VBox layout1 = new VBox(10);//spacing layout
		layout1.getChildren().addAll(l1, b1);
		scene1 = new Scene(layout1, 400, 300);
		
		//BorderPane bp = new BorderPane();
    	//bp.setTop(layout1);
		//button 2
		Button b2 = new Button("Go back to scene1");
		//b2.setOnAction(e -> primaryScene.setScene(scene1));
		b2.setOnAction(e -> FizzBuzz.display(15));
		
		//layout 2
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(b2);
		scene2 = new Scene(layout2,400,400);
		
		// show the window
		primaryScene.setTitle("swtich multiple scenes");
		primaryScene.setScene(scene1);
		primaryScene.show();
	}

}
