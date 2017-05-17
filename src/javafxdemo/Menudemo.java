package javafxdemo;




import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Menudemo extends Application {

	public static void main(String[] args) {
		launch(args);

	}
	
    public void start(Stage primaryStage) throws Exception{
    	primaryStage.setTitle("menubar");
    	
    	// menu
    	Menu m1 = new Menu("File");
    	Menu m2 = new Menu("Align");
    	Menu m3 = new Menu("View");
    	
    	m1.getItems().add(new MenuItem("New"));
    	m1.getItems().add(new MenuItem("Open"));
    	m1.getItems().add(new MenuItem("Rece"));
    	//menu bar
    	MenuBar mb = new MenuBar();
    	mb.getMenus().addAll(m1,m2,m3);
    	
    	BorderPane bp = new BorderPane();
    	bp.setTop(mb);
    	
    	Scene scene = new Scene(bp, 400, 300);
    	primaryStage.setScene(scene);
    	primaryStage.show();
    	
    }

}
