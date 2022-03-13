//Honors Project: Arizona State University CSE205
//          Name: Isha Sathe
//     StudentID: 1220907727
//       Lecture: TTH 9:00-10:15am
//   Description: The Menu class creates extends VBox and
//				  creates a menu to for a maze game

//import necessary classes
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

public class Menu extends VBox {

	//declare instance variables
	//variables referenced in MazeEscape are protected for access
	protected Button restart;
	private Label welcome;
	protected Label message;
	protected Label score;
	private Label bkgLabel;
	protected ComboBox<String> bkgChoice;
	private Label mzLabel;
	protected ComboBox<String> mzChoice;
	private Label charctrLabel;
	protected ComboBox<String> charctrChoice;
	
	//constructor
	public Menu() {
		
		//set welcome message
		welcome = new Label("Welcome\nTo\nMaze\nEscape!");
		welcome.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 20));
		welcome.setTextAlignment(TextAlignment.CENTER);
		welcome.setTextFill(Color.DEEPPINK);
		welcome.setPadding(new Insets(-90, 0, 75, 0));
		
		//set background label and comboBox with choices
		bkgLabel = new Label("Background:");
		bkgLabel.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 12));
		bkgLabel.setTextAlignment(TextAlignment.CENTER);
		bkgLabel.setTextFill(Color.RED);
		bkgChoice = new ComboBox<String>();
		bkgChoice.getItems().addAll("day", "night", "sunset");
		bkgChoice.setValue("day");
		
		//set maze label and comboBox with choices
		mzLabel = new Label("Dificulty: ");
		mzLabel.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 12));
		mzLabel.setTextAlignment(TextAlignment.CENTER);
		mzLabel.setTextFill(Color.ORANGE);
		mzChoice = new ComboBox<String>();
		mzChoice.getItems().addAll("easy", "medium", "hard");
		mzChoice.setValue("easy");
		
		//set character label and comboBox with choices
		charctrLabel = new Label("Character: ");
		charctrLabel.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 12));
		charctrLabel.setTextAlignment(TextAlignment.CENTER);
		charctrLabel.setTextFill(Color.GREEN);
		charctrChoice = new ComboBox<String>();
		charctrChoice.getItems().addAll("bird", "pig", "frog");
		charctrChoice.setValue("bird");
		
		//set restart button
		restart = new Button("Restart");
		
		//set score label
		score = new Label("Score: ");
		score.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 18));
		score.setTextAlignment(TextAlignment.CENTER);
		score.setTextFill(Color.ROYALBLUE);
		
		//set message label
		message = new Label(""); //start empty, modified in MazeEscape
		message.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 20));
		message.setTextAlignment(TextAlignment.CENTER);
		message.setTextFill(Color.MEDIUMPURPLE);
		message.setPadding(new Insets(100, 0, -100, 0));
		
		//set VBox configurations
		this.setAlignment(Pos.CENTER);
		this.setPrefWidth(150);
		this.setPadding(new Insets(20));
		this.setSpacing(10);
		//add all nodes to the VBox
		this.getChildren().addAll(welcome, bkgLabel, bkgChoice, mzLabel, mzChoice, charctrLabel, 
				charctrChoice, score, restart, message);
		
		
	} 
}
