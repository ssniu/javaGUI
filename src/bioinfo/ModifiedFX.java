package bioinfo;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafxdemo.DescriptionPane;

public class ModifiedFX extends Application {
    Stage window;
    BorderPane layout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("BlastMonster");

        //New menu
        Menu newMenu = new Menu("New");
        MenuItem newFile1 = new MenuItem("DNA File");
        MenuItem newFile2 = new MenuItem("Protein File");
        newFile1.setOnAction(e -> System.out.println("Create a new file..."));
        
        newMenu.getItems().add(newFile1);
        newMenu.getItems().add(newFile2);
        
        //Open menu
        Menu openMenu = new Menu("Open");
        
        MenuItem save1 = new MenuItem("Save");
        MenuItem export1 = new MenuItem("Export");
        MenuItem quit1 = new MenuItem("Exit");
        
        openMenu.getItems().add(save1);
        openMenu.getItems().add(export1);
        // Separate the menu
        openMenu.getItems().add(new SeparatorMenuItem());
        openMenu.getItems().add(quit1);
        
        
        //Search menu
        Menu searchMenu = new Menu("Search");
        MenuItem pre = new MenuItem("Prev");
        MenuItem search = new MenuItem("Next");
        
        searchMenu.getItems().add(pre);
        searchMenu.getItems().add(search);
        
        //Sequence menu
        Menu sequenceMenu = new Menu("Sequence");
        
        CheckMenuItem dna1 = new CheckMenuItem("DNA");
        dna1.setSelected(true);
        dna1.setOnAction(e -> {
            if(dna1.isSelected())
                System.out.println("DNA sequence");
            else
                System.out.println("Hiding line number");
        });
        CheckMenuItem rna = new CheckMenuItem("RNA");
        CheckMenuItem pro = new CheckMenuItem("Protein");
        
        sequenceMenu.getItems().addAll(dna1, rna,pro);

        //Primer RadioMenuItems
        Menu primer = new Menu("Primer");
        ToggleGroup primergroup = new ToggleGroup();

        RadioMenuItem pcr = new RadioMenuItem("PCR");
        RadioMenuItem rtpcr = new RadioMenuItem("RtPCR");
      
        pcr.setToggleGroup(primergroup);
        rtpcr.setToggleGroup(primergroup);
     
        primer.getItems().addAll(pcr, rtpcr);
        
        //Help menu
        Menu help = new Menu("Help");
        MenuItem about = new MenuItem("About");
       
        help.getItems().addAll(about);
   
        //Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(newMenu, openMenu, searchMenu, sequenceMenu, primer,help);
    
      //Bottom menu bar
        ToggleButton tb1 = new ToggleButton("Sequence");
    	ToggleButton tb2 = new ToggleButton("Primer");
    	ToggleButton tb3 = new ToggleButton("Blast");
    	ToggleButton tb4 = new ToggleButton("Enzymes");
    	ToggleButton tb5 = new ToggleButton("Search");
    	
    	ToggleGroup tg = new ToggleGroup();
    	
    	//tb1.setToggleGroup(tg);
    	tb1.setToggleGroup(tg);
    	tb2.setToggleGroup(tg);
    	tb3.setToggleGroup(tg);
    	tb4.setToggleGroup(tg);
    	tb5.setToggleGroup(tg);
    	
    	//search box the bottom
        //Text searchText = new Text("Search");
        TextField searchTF = new TextField();//one line text field
        
        HBox h = new HBox();
        h.setPadding(new Insets(10,10,10,10));
        h.getChildren().addAll(searchTF, tb5,tb1,tb2,tb3,tb4);
        
        TextArea des1  = new TextArea();
        TextArea des2 = new TextArea();
        
        des1.setFont(new Font("Serif", 14));
        des2.setFont(new Font("Serif", 14));
		
		// wrap text
		des1.setWrapText(true);
		des1.setEditable(true);//read only
		des2.setWrapText(true);
		des2.setEditable(true);//read only
		
		//TextArea
		HBox h2 = new HBox();
        h2.setPadding(new Insets(10,10,10,10));
        h2.getChildren().addAll(des1,des2);
        

        layout = new BorderPane();
        layout.setTop(menuBar);
        layout.setCenter(h2);
        layout.setBottom(h);
       
        
        Scene scene = new Scene(layout, 600, 500);
        window.setScene(scene);
        window.show();
    }
    
    


}