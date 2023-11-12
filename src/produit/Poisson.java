package produit;

public class Poisson extends Produit {
	
	private String dateDePeche;
	public Poisson(String nom, Unite unite,String date) {
		super("poisson", unite.PIECE);
		this.dateDePeche=date;
	}
	@Override
	public String description() {
		return "poisson peche"+dateDePeche;
	}
	



}
