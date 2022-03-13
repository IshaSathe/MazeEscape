//Honors Project: Arizona State University CSE205
//          Name: Isha Sathe
//     StudentID: 1220907727
//       Lecture: TTH 9:00-10:15am
//   Description: The MazeEscape class creates an application where a user
//				  can play a maze game

//import necessary classes
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

public class MazeEscape extends Application {
	
	//declare instance variables
	//set defaults 
	private Background background;
	private String bkg = "day";
	private Maze maze;
	private String mz = "easy";
	private Character character;
	private String charctr = "bird";
	private Pane game;
	private Menu menu;
	private StackPane gameBoard;
	private BorderPane root;
	private int score = 0;
	private boolean restart = true;
	
	public void start(Stage primaryStage) {
		
		//instantiate game components
		background = new Background();
		background.setBackground(bkg);
		maze = new Maze();
		maze.setMaze(mz);
		character = new Character();
		character.setCharacter(charctr);
		character.relocate(10, 550); //start character off at start
		game = new Pane(); //the pane that holds the actual game
		game.getChildren().addAll(character, maze);
		menu = new Menu();
		
		gameBoard = new StackPane(); //the pane that holds the game with bkg
		gameBoard.getChildren().addAll(background, game);
		//create root pane and set sides
		root = new BorderPane(); 
		root.setLeft(menu);
		root.setCenter(gameBoard);
		
		//register source nodes with it's handler objects
		//these nodes come from the menu object
		menu.charctrChoice.setOnAction(new CharacterHandler());
		menu.bkgChoice.setOnAction(new BackgroundHandler());
		menu.mzChoice.setOnAction(new MazeHandler());
		menu.restart.setOnAction(new RestartHandler());
		
		//create a scene and place root in the stage
		Scene scene = new Scene(root, 930, 600);
		primaryStage.setTitle("Maze Escape!");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//set KeyPressed on scene to move the character around
		scene.setOnKeyPressed(new CharacterMover());
	}
	
	//EventHandlers for various Events
	
	//CharacterMover for character movement controls and bounds checking
	private class CharacterMover implements EventHandler<KeyEvent>{
		public void handle(KeyEvent key) {
			//find position of character
			int xPos = (int) character.getLayoutX();
			int yPos = (int) character.getLayoutY();
			boolean outBounds = false; //to track state of bounds
			
			//cycle through all the lines in the maze to see if the character is
			//at the same position as any of them (i.e. out of bounds)
			for(int i=0; i<maze.lines.size(); i++) {
				//get maze lines start and end x and y
				int mazeStartXPos = (int) (maze.lines.get(i).getStartX());
				int mazeEndXPos = (int) (maze.lines.get(i).getEndX());
				int mazeStartYPos = (int) (maze.lines.get(i).getStartY());
				int mazeEndYPos = (int) (maze.lines.get(i).getEndY());
				//round the character's x and y position for comparison
				int xPosRound = ((xPos + 30) / 30) * 30;
				int yPosRound = ((yPos + 30) / 30) * 30;
				
				//check if character has same x value
				//if true and y is within the line's range the character is out of bounds
				if(mazeStartXPos == xPosRound) {
					if( (mazeStartYPos < yPosRound && yPosRound < mazeEndYPos)){
						outBounds = true;
					}
				}
				//else check if the character has the same y value
				//if true and x is within the lines range the character is out of bounds
				else if(mazeStartYPos == yPosRound) {
					if((mazeStartXPos < (xPosRound) && (xPosRound) < mazeEndXPos)) {
						outBounds = true;
					}
				}
			}//end for loop bounds checking
			
			//check which key is pressed
			switch(key.getCode()){
			//for w go up if in scene range
			case W:
				if(yPos-20 >= 0) {
					character.relocate(xPos, yPos-20);
					yPos = (int) character.getLayoutY(); 
				}
				break;
			//for s go down if in scene range
			case S:
				if(yPos+40 <= 600) {
					character.relocate(xPos, yPos+20);
					yPos = (int) character.getLayoutY();
				}
				break;
			//for d go right if in scene range
			case D:
				if(xPos+20 <= 740) {
					character.relocate(xPos+20, yPos);
					xPos = (int) character.getLayoutX();
				}
				break;
			//for a go left if in scene range
			case A:
				if(xPos-20 >= 0) {
					character.relocate(xPos-20, yPos);
					xPos = (int) character.getLayoutX();
				}
				break;
			}
			//if in the winning position declare a win
			if(xPos >= 730 && yPos <= 20) {
				//only add to the score if the game has been restarted
				if(restart)
					score++;
				restart = false;
				menu.message.setText("YOU WIN!!");
				menu.score.setText("Score: " + score);
			}
			//report out of bounds if out of bounds
			else if(outBounds) {
				menu.message.setText("OUT OF\nBOUNDS!!");
				character.relocate(10, 550);
				restart = true;
			}
			//else the message is empty
			else
				menu.message.setText("");
			
		}
	}//end CharacterMover
	
	//BackgroundHandler for choosing the background
	private class BackgroundHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e) {
			//check which bkg choice is chosen
			switch(menu.bkgChoice.getValue()) {
			case "day":
				bkg = "day";
				background.setBackground(bkg);
				break;
			case "night":
				bkg = "night";
				background.setBackground(bkg);
				break;
			case "sunset":
				bkg = "sunset";
				background.setBackground(bkg);
				break;
			}
		}
	}//end BackgroundHandler
	
	//MazeHandler for choosing the maze
	private class MazeHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e) {
			//check which maze choice is chosen
			//each choice takes character back to start and sets restart to true
			switch(menu.mzChoice.getValue()) {
			case "easy":
				mz = "easy";
				maze.setMaze(mz);
				character.relocate(10, 550);
				restart = true;
				break;
			case "medium":
				mz = "medium";
				maze.setMaze(mz);
				character.relocate(10, 550);
				restart = true;
				break;
			case "hard":
				mz = "hard";
				maze.setMaze(mz);
				character.relocate(10, 550);
				restart = true;
				break;
			}
		}
	}//end MazeHandler

	//CharacterHandler for choosing the character
	private class CharacterHandler implements EventHandler<ActionEvent>{
		//check which character is chosen
		public void handle(ActionEvent e) {
			switch(menu.charctrChoice.getValue()) {
			case "bird":
				charctr = "bird";
				character.setCharacter(charctr);
				break;
			case "pig":
				charctr = "pig";
				character.setCharacter(charctr);
				break;	
			case "frog":
				charctr = "frog";
				character.setCharacter(charctr);
			}
		}
	}//end CharacterHandler
	
	//RestartHandler for restarting
	private class RestartHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e) {
			//set restart to true, set character to start and clear message
			restart = true;
			character.relocate(10, 550);
			menu.message.setText("");
		}
	}//end RestartHandler
	
	 public static void main(String[] args) {
		   launch(args);
	   }
}
