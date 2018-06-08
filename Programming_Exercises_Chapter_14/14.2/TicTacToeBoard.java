import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeBoard extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		// Create grid
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setPadding(new Insets(50, 50, 50, 50));
		
		// Get images
		Image imageX = new Image("Pictures/x.gif");
		Image imageO = new Image("Pictures/o.gif");
		
		// Place images randomly
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				int randomNum = (int)(Math.random() * 3);
				
				if(randomNum == 0)
				{
					gp.add(new ImageView(imageX), i, j);
				}
				else if(randomNum == 1)
				{
					gp.add(new ImageView(imageO), i, j);
				}
				else
				{
					gp.add(new ImageView(), i, j);
				}
			}
		}
		
		// Show
		Scene scene = new Scene(gp);
		primaryStage.setTitle("Exercise_14.2");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	// Launch application
	public static void main(String[] args)
	{
		Application.launch(args);
	}
}
