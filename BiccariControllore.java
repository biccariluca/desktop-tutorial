import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
public class BiccariControllore implements Initializable {
	private Francesco oggetto;
	String nome = null;
	String cognome = null;
	int eta = 0;
	double conto = 0.0;
	String specializzazione = null;
	@FXML
	private TextField nomeFld;
	@FXML
	private TextField cognomeFld;
	@FXML
	private TextField etaFld;
	@FXML
	private TextField contoFld;
	@FXML
	private TextField specializzazioneFld;
	@FXML
	private TextArea risultatoTxA;
	@FXML
	private URL Location ;
	@FXML
	private ResourceBundle resources;
	public BiccariControllore (String titolo){
		oggetto=new Francesco();
	}
	@Override
	public void initialize(URL Location, ResourceBundle resources){
		risultatoTxA.setText("___________");
	}
	//metodo gestione bottone
	@FXML
	public void visualizza(){
		//controllo se ci sono le informazioni
		
		if ((nomeFld.getText().isEmpty()) || (cognomeFld.getText().isEmpty()) || (etaFld.getText().isEmpty()) || (contoFld.getText().isEmpty()) || (specializzazioneFld.getText().isEmpty())){
			risultatoTxA.setText("informazioni mancanti");
		
		}else{
			nome = nomeFld.getText();	
		    oggetto.setNome(nome);
			cognome = cognomeFld.getText();	
		    oggetto.setCognome(cognome);
			eta = Integer.parseInt(etaFld.getText());
			oggetto.setEta(eta);
			conto = Double.parseDouble(contoFld.getText());
			oggetto.setConto(conto);
			specializzazione = specializzazioneFld.getText();	
		    oggetto.setSpecializzazione(specializzazione);
			risultatoTxA.setText(oggetto.toString());
		}
	}
}
	
	