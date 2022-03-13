//Honors Project: Arizona State University CSE205
//          Name: Isha Sathe
//     StudentID: 1220907727
//       Lecture: TTH 9:00-10:15am
//   Description: The Character class creates extends Pane and
//				  creates various characters

//import necessary classes
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

public class Character extends Pane{
	
	//declare instance variables
	private Circle body;

	public void setCharacter(String type) {
		switch(type){
		case "bird":
			//clear pane to begin with
			this.getChildren().clear();
			//create bird body
			body = new Circle(20, 20, 20);
			body.setFill(Color.YELLOW);
			//create bird eye with pupil
			Circle birdEye = new Circle(32, 10, 6);
			birdEye.setStroke(Color.BLACK);
			birdEye.setStrokeWidth(1);
			birdEye.setFill(Color.WHITE);
			Circle birdPupil = new Circle(35, 10, 2);
			//create bird beak
			Polygon beak = new Polygon(31, 16, 46, 12, 36, 26);
			beak.setFill(Color.ORANGE);
			//create bird wing
			Polygon wing = new Polygon(20, 14, 20, 26, 8, 18);
			wing.setFill(Color.ORANGE);
			//add bird body parts to Pane
			this.getChildren().addAll(body, beak, birdEye, birdPupil, wing);
			break; 
			
		case "pig":
			this.getChildren().clear();
			//create pig body
			body = new Circle(20, 20, 20);
			body.setFill(Color.PINK);
			//create pig foot1
			Circle foot1 = new Circle(8, 35, 7);
			foot1.setStrokeWidth(2);
			foot1.setStroke(Color.DEEPPINK);
			foot1.setFill(Color.PINK);
			//create pig foot2
			Circle foot2 = new Circle(28, 35, 7);
			foot2.setStrokeWidth(2);
			foot2.setStroke(Color.DEEPPINK);
			foot2.setFill(Color.PINK);
			//create pig eyes and pupils
			Ellipse pigEye1 = new Ellipse(13, 15, 6, 8);
			pigEye1.setStroke(Color.BLACK);
			pigEye1.setStrokeWidth(1);
			pigEye1.setFill(Color.WHITE);
			Ellipse pigEye2 = new Ellipse(27, 15, 6, 8);
			pigEye2.setStroke(Color.BLACK);
			pigEye2.setStrokeWidth(1);
			pigEye2.setFill(Color.WHITE);
			Ellipse pigPupil1 = new Ellipse(14, 15, 2, 4);
			Ellipse pigPupil2 = new Ellipse(26, 15, 2, 4);
			//create pig nose
			Ellipse pigNose = new Ellipse(20, 24, 5, 4);
			pigNose.setFill(Color.DEEPPINK);
			Circle nostril1 = new Circle(18, 24, 1);
			nostril1.setFill(Color.PINK);
			Circle nostril2 = new Circle(22, 24, 1);
			nostril2.setFill(Color.PINK);
			this.getChildren().addAll(body, foot1, foot2, pigEye2, pigEye1,
					pigPupil1, pigPupil2, pigNose, nostril1, nostril2);
			break;
			
		case "frog" :
			this.getChildren().clear();
			//create frog body
			body = new Circle(20, 20, 20);
			body.setFill(Color.FORESTGREEN);
			//create frog eyes and pupils
			Ellipse eye1 = new Ellipse(13, 8, 8, 10);
			eye1.setStroke(Color.GREEN);
			eye1.setStrokeWidth(2);
			eye1.setFill(Color.WHITE);
			Ellipse eye2 = new Ellipse(27, 8, 8, 10);
			eye2.setStroke(Color.GREEN);
			eye2.setStrokeWidth(2);
			eye2.setFill(Color.WHITE);
			Ellipse frogPupil1 = new Ellipse(14, 8, 2, 4);
			Ellipse frogPupil2 = new Ellipse(26, 8, 2, 4);
			//create frog mouth and tongue
			Ellipse mouth = new Ellipse(20, 26, 9, 7);
			Ellipse tongue = new Ellipse(20, 27, 6, 4);
			mouth.setFill(Color.RED);
			tongue.setFill(Color.PINK);
			
			
			this.getChildren().addAll(body, eye1, eye2, frogPupil1, 
					frogPupil2, mouth, tongue);
		}
	}
	
}