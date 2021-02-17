/*CISP 402 Summer 2020 Anna Oleksyeyenko SID # 1627858
// *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
//                 Assignment AD5 Description
// Create a JavaFX GUI application that will arrange four images(provided) in a collage.

// MultipleViews.java
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleViews extends Application {
   public void start(Stage stage) throws IOException {
      //creating the image object
      InputStream stream = new FileInputStream("C:\\images\\yellowflowers.jpg");
      Image image = new Image(stream);
	  /*****************************/
      //Creating the image view
     ImageView imageView1 = new ImageView(image);
	  
      //Setting the position of the image
      imageView1.setX(10);
      imageView1.setY(10);
      imageView1.setFitWidth(200);
      imageView1.setPreserveRatio(true);
	  
      Image image2 = new Image(new FileInputStream("C:\\images\\purpleflowers.jpg"));
	  
	  /**************************/
      //Creating the image view 3
      ImageView imageView2 = new ImageView(image2);
      //Setting the image view parameters
      imageView2.setX(10);
      imageView2.setY(200);
      imageView2.setFitWidth(200);
      imageView2.setPreserveRatio(true);
	  //Label label1 = new Label("Label 1", imageView2);
	  //Scene scene = new Scene(label1, 300, 200);
 
	  Image image3 = new Image(new FileInputStream("C:\\images\\yellowredflowers.jpg"));
	  
	  
	  /**************************/
      //Creating the image view 3
      ImageView imageView3 = new ImageView(image3);
      //Setting the image view parameters
      imageView3.setX(250);
      imageView3.setY(10);
      imageView3.setFitWidth(200);
      imageView3.setPreserveRatio(true);
	  //Label label2 = new Label("Label 2", imageView3);
	  //Scene scene = new Scene(label2, 300, 200);
	  
	  Image image4 = new Image(new FileInputStream("C:\\images\\fuschiaflowers.jpg"));
	  
      //Creating the image view 3
      ImageView imageView4 = new ImageView(image4);
      //Setting the image view parameters
      imageView4.setX(250);
      imageView4.setY(200);
      imageView4.setFitWidth(200);
      imageView4.setPreserveRatio(true);
	  //Label label4 = new Label("Label 4", imageView4);
	  //Scene scene = new Scene(label4, 300, 200);
	  //label.setFont(new Font("Arial", 14));
	  
      //Creating a Group object
      Group group = new Group(imageView1, imageView2, imageView3, imageView4);
     // group.getChilderen().add(label1);
	 //Creating a scene object
	  Scene scene = new Scene(group, 600, 600, Color.BEIGE);
	  //Setting title to the Stage 
      stage.setTitle("AD5");
	  //Adding scene to the stage
      stage.setScene(scene);
	  //Displaying the contents of the stage
      stage.show();
   }
   public static void main(String args[]) {
      launch(args);
   }
}  

