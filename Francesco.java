//16.09.2020 BICCARI CORSARO
public class Francesco extends Biccari{
	//VARIABILI
	private int eta;
	private  String specializzazione;
	//COSTRUTTORE.
	public Francesco(){ 
		super();
		this.eta = 0;
		this.specializzazione = null;
	}
	public Francesco(String n,String c,int cc,int eta,String specializzazione){ 
		super(n,c,cc);
		this.eta = eta;
		this.specializzazione = specializzazione;
	}
	//SET
	public void setEta(){
		this.eta = eta;
	}	
	public void setSpecializzazione(){
		this.specializzazione = specializzazione;
	}
	//GET	
	public int getEta(){
		return this.eta;
	}
	public String getSpecializzazione(){
		return this.specializzazione;
	}
	//TOSTRING
	public String toString() {
		String z = "\n";
			z += super.toString();
			z+= "\neta: " + this.eta +
			    "\nspecializzazione: " + this.specializzazione ;

		return z;
   	}
}
