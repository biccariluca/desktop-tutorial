import javafx.application.Application;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import java.io.FileInputStream;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class BiccariMain extends Application{
	public static void main (String[]args){
		Application.launch(args);
	}
	//
	public void start(Stage stage) throws IOException{
		
		//creazione di un caricatore fxml
		FXMLLoader caricatore = new FXMLLoader();
		// collegamento con controller
		caricatore.setController(new BiccariControllore("BiccariControllore"));
		
		//file fxlm
		String miofilefxml = "BiccariFXML.fxml"; //deve essere nella stessa cart.
		FileInputStream fxmlStream = new FileInputStream(miofilefxml);
		
		// creo un oggetto con la root del file fxml
		Pane root = (Pane) caricatore.load(fxmlStream);
		
		//creo la scena e ci metto root
		Scene scena = new Scene(root);
		
		//metto la scena sullo stage
		stage.setScene(scena);
		//metto un titolo
		stage.setTitle("Biccari");
		
		//visualizzo lo stage 
		stage.show();
		
	}
}