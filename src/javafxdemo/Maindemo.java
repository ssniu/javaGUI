package javafxdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Maindemo extends Application {
    Stage window;
    BorderPane layout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("thenewboston");

        //File menu
        Menu fileMenu = new Menu("File");
        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e -> System.out.println("Create a new file..."));
        fileMenu.getItems().add(newFile);
        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new MenuItem("Save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Settings..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Exit..."));

        //Edit menu
        Menu editMenu = new Menu("_Edit");
        editMenu.getItems().add(new MenuItem("Cut"));
        editMenu.getItems().add(new MenuItem("Copy"));
        MenuItem paste = new MenuItem("Paste");
        paste.setOnAction(e -> System.out.println("Pasting some crap"));
        paste.setDisable(true);
        editMenu.getItems().add(paste);

        //Help menu
        Menu helpMenu = new Menu("Help");
        CheckMenuItem showLines = new CheckMenuItem("Show Line Numbers");
        showLines.setOnAction(e -> {
            if(showLines.isSelected())
                System.out.println("Program will now display line numbers");
            else
                System.out.println("Hiding line number");
        });
        CheckMenuItem autoSave = new CheckMenuItem("Enable Autosave");
        autoSave.setSelected(true);
        helpMenu.getItems().addAll(showLines, autoSave);

        //Difficulty RadioMenuItems
        Menu difficultyMenu = new Menu("Difficulty");
        ToggleGroup difficultyToggle = new ToggleGroup();

        RadioMenuItem easy = new RadioMenuItem("Easy");
        RadioMenuItem medium = new RadioMenuItem("Medium");
        RadioMenuItem hard = new RadioMenuItem("Hard");

        easy.setToggleGroup(difficultyToggle);
        medium.setToggleGroup(difficultyToggle);
        hard.setToggleGroup(difficultyToggle);

        difficultyMenu.getItems().addAll(easy, medium, hard);

        //Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu, difficultyMenu);
        
        //DescriptionPane desP = new DescriptionPane();
        
       // String desc = "image not here";
        //desP.setDescription(desc);
        TextArea des1  = new TextArea();
        TextArea des2 = new TextArea();
        
        des1.setFont(new Font("Serif", 14));
        des2.setFont(new Font("Serif", 14));
		
		// wrap text
		des1.setWrapText(true);
		des1.setEditable(true);//read only
		des2.setWrapText(true);
		des2.setEditable(true);//read only
		
		//create a scroll pane to hold the text area
		ScrollPane sp1 = new ScrollPane(des1);
		ScrollPane sp2 = new ScrollPane(des2);
		
		//Place label and scroll pane in the border pane
		HBox h2 = new HBox();
        h2.setPadding(new Insets(10,10,10,10));
        h2.getChildren().addAll(sp1,sp2);
		//setCenter(sp);
		//setPadding(new Insets(5,5,5,5));
        
      //search box the bottom
        Text searchText = new Text("Search");
        TextField searchTF = new TextField();//one line text field
        
        HBox h = new HBox();
        h.setPadding(new Insets(10,10,10,10));
        h.getChildren().addAll(searchText, searchTF);
        

        layout = new BorderPane();
        layout.setTop(menuBar);
        layout.setCenter(h2);
        layout.setBottom(h);
       
    
        
        Scene scene = new Scene(layout, 500, 600);
        window.setScene(scene);
        window.show();
    }


}