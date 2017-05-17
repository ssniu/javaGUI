package javafxdemo;

import javafx.application.*;


public class TextAreaDemo extends Application {

	public static void main(String[] args) {
		launch(args);

	}
	
	public void start(Stage primaryStage){
		DescriptionPane dp = new DescriptionPane();
		
		dp.setTitle("Text demo");
		String s = "No image";
		dp.setImageView(null);
		dp.setDescription(s);
		
		Scene scene = new Scene(dp, 450, 200)
	}

}
