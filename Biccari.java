public class Biccari{
	
    //VARIABILI
	
    private String nome;
    private String cognome;
    private int conto;
    //COSTRUTTORE
	public Biccari(){
	    this.nome = null;
	    this.cognome = null;
		this.conto = 0;
	} 
    public Biccari(String nome, String cognome , int conto){
	    this.nome = nome;
	    this.cognome = cognome;
		this.conto = conto;
	} 
	 //SETTERS
        public void setNome (String nome){
            this.nome = nome;
            
        }
        public void setCognome (String cognome){
            this.cognome = cognome;
        }
        public void setConto (int conto){
            this.conto = conto;
        }
     
	 //GETTERS
    

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public int getConto() {
        return this.conto;
    }
	//TOSTRING
    public String toString() {
        return  "Persona[nome = " + this.nome +
                ", cognome = " + this.cognome + ", NumeroContocorente = " + this.conto + " ]";
    }
	   }