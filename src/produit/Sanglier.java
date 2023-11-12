package produit;

public class Sanglier extends Produit {
	private int poids;
	private String Chasseur;
	public Sanglier(String nom, Unite unite,int poids,String Chasseur) {
		super("sanglier", unite.KILOGRAMME);
		this.poids=poids;
		this.Chasseur=Chasseur;
	}

	@Override
	public String description() {
		return "sanglier de "+poids+" kg chasse par "+Chasseur;
	}

}
