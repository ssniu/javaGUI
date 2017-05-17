package javafxdemo;



	import javafx.application.Application;
	import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
	import javafx.scene.layout.*;
	import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.*;
	 
	public class JavafxDemo  extends Application {
		
		
	    
	    @Override
	    public void start(Stage primaryStage) throws Exception{
	    	//title of the window
	    	primaryStage.setTitle("BioBlast");
	    	
	    	
	    	/* one menu
	    	MenuButton menuButton1 = new MenuButton("Sequence", null, menuItem1, menuItem2, menuItem3);
	    	MenuButton menuButton2 = new MenuButton("Blast", null);
	    	HBox hbox1 = new HBox(menuButton1);
	    	HBox hbox2 = new HBox(menuButton2);
	    	*/
	    
	    	// add menu options
	    	MenuItem menuItem1 = new MenuItem("DNA");
	    	MenuItem menuItem2 = new MenuItem("RNA");
	    	MenuItem menuItem3 = new MenuItem("Protein");
	    	
	    	MenuButton mb = new MenuButton("Sequence", null, menuItem1, menuItem2, menuItem3);
	    	/*
	    	 * final Image image = new Image(getClass().getResource("cross_red.png").toExternalForm(), 20, 20, true, true);
    			MenuButton menuButton = new MenuButton("Don't touch this");
					menuButton.setGraphic(new ImageView(image));
				menuButton.getItems().addAll(new MenuItem("Really"), new MenuItem("Do not"));
	    	 */
	    	//toolkit
	    	//button.setTooltip(new Tooltip(title));
	    	//Toggle menu, togglegroup allows at most one togglebutton to be toggled
	    	//ToggleButton tb1 = new ToggleButton("Sequence");
	    	ToggleButton tb2 = new ToggleButton("Blast");
	    	ToggleButton tb3 = new ToggleButton("Primer");
	    	
	    	ToggleGroup tg = new ToggleGroup();
	    	
	    	//tb1.setToggleGroup(tg);
	    	tb2.setToggleGroup(tg);
	    	tb3.setToggleGroup(tg);
	    	
	    	//action
	    	menuItem1.setOnAction(new EventHandler<ActionEvent>(){
	    		@Override 
	    		public void handle(ActionEvent event){
	    			System.out.println("DNA");
	    		}
	    	});
	    	//horzontal layout
	    	HBox hbox = new HBox();
	        //BorderPane bp = new BorderPane();
	    	//bp.setTop(mb);
	    	hbox.setPadding(new Insets(10,10,10,10));//padding
	    	hbox.getChildren().addAll(mb, tb2, tb3,root);
	    	
	    	//padding
	    	/*GridPane gp = new GridPane();
	    	gp.setPadding(new Insets(10,10,10,10));
	        gp.setVgap(8);
	        gp.setHgap(10);
	        */
	    	Text text = new Text();      
	        
	        //Setting the text to be added. 
	        text.setText("Hello how are you"); 
	         
	        //setting the position of the text 
	        text.setX(50); 
	        text.setY(50); 
	           
	        //Creating a Group object  
	        Group root = new Group(text);  
	    	//set space between the menu
	    	//hbox.setSpacing(10);
	    	// scene inside window
	    	Scene scene = new Scene(hbox, 600, 500);
	    	primaryStage.setScene(scene);
	    	primaryStage.show();
	    	
	    }
	    
	    	
	    	/*//create a button
	        Button btn = new Button();
	        // text on the button
	        btn.setText("Greeting");
	        // action of the button 
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	 
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Hello World! JavaFX");
	            }
	        });
	        
	        StackPane root = new StackPane();
	        root.getChildren().add(btn);
     //output scene
	 Scene scene = new Scene(root, 300, 250);
      
	        primaryStage.setTitle("Hello World!");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }*/
	    	
	 public static void main(String[] args) {
	        launch(args);
	    }
	}

