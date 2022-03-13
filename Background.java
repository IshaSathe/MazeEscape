//Honors Project: Arizona State University CSE205
//          Name: Isha Sathe
//     StudentID: 1220907727
//       Lecture: TTH 9:00-10:15am
//   Description: The Background class creates an extends Pane and
//				  creates various backgrounds

//import necessary classes
import java.util.ArrayList;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class Background extends Pane{
	
	private Rectangle backdrop;
	
	public void setBackground(String type) {
		switch(type){
		case "day":
			//clear pane to begin with
			this.getChildren().clear();
			
			//set backdrop color
			backdrop = new Rectangle(0, 0, 800, 600);
			backdrop.setFill(Color.LIGHTSKYBLUE);
			
			//create ArrayList to hold Clouds
			ArrayList<Cloud> clouds = new ArrayList<Cloud>();
			
			//create a pattern of clouds and add to clouds ArrayList
			for (int i=50; i<=800; i+=150){
				for(int j=50; j<=600; j+=300) {
					clouds.add(new Cloud(i, j, 20));
				}
			}
			//create a second pattern of clouds and add to clouds ArrayList
			for(int i=75; i<=700; i+=150) {
				for(int j=200; j<=600; j+=300) {
					clouds.add(new Cloud(i, j, 20));
				}
			}
			
			//add backdrop and all Clouds from clouds ArrayList to Pane
			this.getChildren().addAll(backdrop);
			for(int i=0; i<clouds.size(); i++) {
				this.getChildren().addAll(clouds.get(i));
			}
			break;
			
		case "night":
			//clear pane to begin with
			this.getChildren().clear();
			
			//set backdrop color
			backdrop = new Rectangle(0, 0, 800, 600);
			backdrop.setFill(Color.DARKSLATEBLUE);
			
			//create ArrayList to hold Stars
			ArrayList<Star> stars = new ArrayList<Star>();
			
			//create a pattern of stars and add to stars ArrayList
			for (int i=50; i<=800; i+=50){
				for(int j=50; j<=600; j+=100) {
					stars.add(new Star(i, j));
				}
			}
			//create a pattern of stars and add to stars ArrayList
			for(int i=100; i<=700; i+=100) {
				for(int j=200; j<=600; j+=100) {
					stars.add(new Star(i, j));
				}
			}
			
			//add backdrop and all Stars from stars ArrayList to Pane
			this.getChildren().addAll(backdrop);
			for(int i=0; i<stars.size(); i++) {
				this.getChildren().addAll(stars.get(i));
			}
			break;
			
		case "sunset":
			//clear pane to begin with
			this.getChildren().clear();
			
			//create gradient
			Stop[] stops = new Stop[] {new Stop(0, Color.HOTPINK), new Stop(1, Color.ORANGE)};
			LinearGradient lg1 = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
			//set backdrop color to gradient
			backdrop = new Rectangle(0, 0, 800, 600);
			backdrop.setFill(lg1);
			
			//create sun
			Circle sun = new Circle(400,600, 300);
			sun.setFill(Color.LIGHTGOLDENRODYELLOW);
			
			//add backdrop and sun to Pane
			this.getChildren().addAll(backdrop, sun);
			break;
			
		}
	}
	
	//Star class to create stars
	private class Star extends Pane{
		public Star(int xPos, int yPos) {
			//create polygon in the shape of star
			Polygon star = new Polygon(xPos, yPos, xPos+5, yPos-5, xPos+10, yPos, xPos+5, yPos+5);
			star.setFill(Color.WHITE);
			//add star to Pane
			this.getChildren().addAll(star);
		}
	}//end Star class
	
	//Cloud class to create clouds
	private class Cloud extends Pane{
		
		public Cloud(int xPos, int yPos, int radius) {
			//create 4 circle different distances from each other to from cloud shape
			Circle circle1 = new Circle(xPos, yPos, radius);
			Circle circle2 = new Circle(xPos+radius+radius, yPos, radius);
			Circle circle3 = new Circle(xPos+radius, yPos+radius, radius);
			Circle circle4 = new Circle(xPos+radius, yPos-radius, radius);
			circle1.setFill(Color.WHITE);
			circle2.setFill(Color.WHITE);
			circle3.setFill(Color.WHITE);
			circle4.setFill(Color.WHITE);
			//add cloud parts to Pane
			this.getChildren().addAll(circle1, circle2, circle3, circle4);
		}
	}

}
