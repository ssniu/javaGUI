package javafxdemo;

import javafx.geometry.Insets;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class DescriptionPane extends BorderPane{

	private Label imageTitle = new Label();
	
	private TextArea des = new TextArea();
	
	public DescriptionPane(){
		imageTitle.setContentDisplay(ContentDisplay.TOP);
		imageTitle.setPrefSize(200, 100);
		
		// set the font 
		imageTitle.setFont(new Font("SansFSerif", 16));
		des.setFont(new Font("Serif", 14));
		
		// wrap text
		des.setWrapText(true);
		des.setEditable(true);//read only
		
		//create a scroll pane to hold the text area
		ScrollPane sp = new ScrollPane(des);
		
		//Place label and scroll pane in the border pane
		setLeft(imageTitle);
		setCenter(sp);
		setPadding(new Insets(5,5,5,5));
			
	}
	
	public void setTitle(String title){
		imageTitle.setText(title);
	}
	
	public void setImageView(ImageView icon){
		imageTitle.setGraphic(icon);
	}
	public void setDescription(String text){
		des.setText(text);
	}
}
