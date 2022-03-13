//Honors Project: Arizona State University CSE205
//          Name: Isha Sathe
//     StudentID: 1220907727
//       Lecture: TTH 9:00-10:15am
//   Description: The Maze class creates extends Pane and
//				  creates various mazes

//import necessary classes
import java.util.ArrayList;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

public class Maze extends Pane{
	
	//declare instance variable
	//set as protected for MazeEscape access
	protected ArrayList<Line> lines; //an ArrayList to hold all maze lines
	
	public void setMaze(String level) {
		switch(level) {
		case "easy":
			//clear pane to begin with
			this.getChildren().clear();
			
			makeMarkers(); //makes the makers
			
			//add all maze lines to ArrayList of Lines
			lines = new ArrayList<Line>();
			lines.add(new Line(60, 0, 60, 540));
			lines.add(new Line(60, 540, 240, 540));
			lines.add(new Line(300, 540, 800, 540));
			lines.add(new Line(300, 60, 300, 540));
			lines.add(new Line(240, 300, 240, 540));
			lines.add(new Line(300, 60, 480, 60));
			lines.add(new Line(480, 60, 480, 480));
			lines.add(new Line(480, 480, 600, 480));
			lines.add(new Line(540, 0, 540, 420));
			lines.add(new Line(600, 240, 600, 480));
			lines.add(new Line(120, 300, 240, 300));
			lines.add(new Line(120, 300, 120, 480));
			lines.add(new Line(120, 480, 180, 480));
			lines.add(new Line(180, 360, 180, 480));
			lines.add(new Line(600, 240, 720, 240));
			lines.add(new Line(600, 0, 600, 180));
			lines.add(new Line(600, 180, 720, 180));
			lines.add(new Line(720, 60, 720, 180));
			lines.add(new Line(360, 60, 360, 480));
			lines.add(new Line(420, 120, 420, 540));
			lines.add(new Line(720, 240, 720, 480));
			lines.add(new Line(660, 300, 660, 540));
			lines.add(new Line(240, 0, 240, 240));
			lines.add(new Line(180, 60, 180, 240));
			lines.add(new Line(120, 60, 120, 300));
			
			//set maze lines strokeWidth
			for(int i=0; i<lines.size(); i++) {
				lines.get(i).setStrokeWidth(10);
			}
			
			//add all lines to maze
			for(int i=0; i<lines.size(); i++) {
				this.getChildren().addAll(lines.get(i));
			}
			break;
			
		case "medium":
			//clear pane to begin with
			this.getChildren().clear();
			
			makeMarkers(); //makes the makers
			
			//add all maze lines to ArrayList of Lines
			lines = new ArrayList<Line>();
			lines.add(new Line(60, 60, 420, 60));
			lines.add(new Line(60, 60, 60, 300));
			lines.add(new Line(60, 300, 300, 300));
			lines.add(new Line(300, 300, 300, 540));
			lines.add(new Line(60, 540, 240, 540));
			lines.add(new Line(240, 360, 240, 540));
			lines.add(new Line(5, 480, 180, 480));
			lines.add(new Line(180, 420, 180, 480));
			lines.add(new Line(5, 360, 240, 360));
			lines.add(new Line(5, 420, 180, 420));
			lines.add(new Line(420, 60, 420, 120));
			lines.add(new Line(240, 120, 420, 120));
			lines.add(new Line(240, 120, 240, 240));
			lines.add(new Line(300, 180, 300, 240));
			lines.add(new Line(300, 240, 440, 240));
			lines.add(new Line(300, 180, 660, 180));
			lines.add(new Line(360, 240, 360, 360));
			lines.add(new Line(360, 360, 480, 360));
			lines.add(new Line(360, 420, 540, 420));
			lines.add(new Line(480, 240, 480, 360));
			lines.add(new Line(480, 240, 720, 240));
			lines.add(new Line(540, 300, 540, 420));
			lines.add(new Line(480, 60, 600, 60));
			lines.add(new Line(480, 60, 480, 120));
			lines.add(new Line(480, 120, 720, 120));
			lines.add(new Line(720, 0, 720, 240));
			lines.add(new Line(540, 300, 800, 300));
			lines.add(new Line(430, 300, 480, 300));
			lines.add(new Line(660, 60, 660, 120));
			lines.add(new Line(120, 240, 240, 240));
			lines.add(new Line(180, 120, 180, 240));
			lines.add(new Line(120, 120, 180, 120));
			lines.add(new Line(360, 420, 360, 540));
			lines.add(new Line(360, 540, 720, 540));
			lines.add(new Line(720, 360, 720, 540));
			lines.add(new Line(600, 360, 720, 360));
			lines.add(new Line(600, 360, 600, 480));
			lines.add(new Line(440, 480, 600, 480));
			lines.add(new Line(300, 480, 360, 480));
			
			//set maze lines strokeWidth
			for(int i=0; i<lines.size(); i++) {
				lines.get(i).setStrokeWidth(10);
			}
			
			//add all lines to maze
			for(int i=0; i<lines.size(); i++) {
				this.getChildren().addAll(lines.get(i));
			}
			break;
			
		case "hard":
			//clear pane to begin with
			this.getChildren().clear();
			
			makeMarkers();//makes the makers
			
			//add all maze lines to ArrayList of Lines
			lines = new ArrayList<Line>();
			lines.add(new Line(5, 540, 180, 540));
			lines.add(new Line(180, 480, 180, 540));
			lines.add(new Line(180, 300, 180, 420));
			lines.add(new Line(240, 420, 240, 540));
			lines.add(new Line(240, 420, 240, 540));
			lines.add(new Line(5, 480, 180, 480));
			lines.add(new Line(60, 420, 180, 420));
			lines.add(new Line(60, 360, 60, 420));
			lines.add(new Line(60, 360, 180, 360));
			lines.add(new Line(5, 300, 540, 300));
			lines.add(new Line(540, 300, 540, 480));
			lines.add(new Line(180, 360, 360, 360));
			lines.add(new Line(240, 420, 360, 420));
			lines.add(new Line(240, 540, 600, 540));
			lines.add(new Line(600, 240, 600, 540));
			lines.add(new Line(360, 420, 360, 540));
			lines.add(new Line(420, 360, 420, 480));
			lines.add(new Line(420, 480, 540, 480));
			lines.add(new Line(600, 300, 720, 300));
			lines.add(new Line(420, 240, 600, 240));
			lines.add(new Line(240, 180, 420, 180));
			lines.add(new Line(240, 180, 240, 240));
			lines.add(new Line(420, 180, 420, 240));
			lines.add(new Line(180, 240, 240, 240));
			lines.add(new Line(180, 120, 180, 240));
			lines.add(new Line(120, 180, 120, 300));
			lines.add(new Line(5, 180, 120, 180));
			lines.add(new Line(60, 120, 120, 120));
			lines.add(new Line(60, 60, 300, 60));
			lines.add(new Line(60, 60, 60, 120));
			lines.add(new Line(180, 0, 180, 60));
			lines.add(new Line(300, 0, 300, 60));
			lines.add(new Line(540, 0, 540, 120));
			lines.add(new Line(180, 120, 480, 120));
			lines.add(new Line(480, 180, 780, 180));
			lines.add(new Line(480, 120, 480, 180));
			lines.add(new Line(540, 120, 720, 120));
			lines.add(new Line(600, 60, 780, 60));
			lines.add(new Line(600, 360, 720, 360));
			lines.add(new Line(720, 360, 720, 540));
			lines.add(new Line(600, 420, 660, 420));
			lines.add(new Line(660, 420, 660, 540));
			lines.add(new Line(660, 540, 720, 540));
			lines.add(new Line(300, 240, 300, 300));
			lines.add(new Line(300, 240, 360, 240));
			lines.add(new Line(360, 240, 360, 300));
			lines.add(new Line(420, 60, 480, 60));
			lines.add(new Line(480, 60, 480, 120));
			
			//set maze lines strokeWidth
			for(int i=0; i<lines.size(); i++) {
				lines.get(i).setStrokeWidth(10);
			}
			
			//add all lines to maze
			for(int i=0; i<lines.size(); i++) {
				this.getChildren().addAll(lines.get(i));
			}
			break;
		}//end switch case
	} 
	
	//method to make start and end markers
	private void makeMarkers() {
		Text startTxt = new Text(5, 575, "START!");
		startTxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, 14));
		
		Text endTxt = new Text(728, 35, "END!");
		endTxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, 14));
		
		this.getChildren().addAll(startTxt, endTxt);
	}

}
