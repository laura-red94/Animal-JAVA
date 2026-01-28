package Animal;

public class Serpent implements Animal {
	private String nom;
	private String couleur;
	private String espece;

	public Serpent(String nom, String couleur, String espece) {
		this.nom = nom;
		this.couleur = couleur;
		this.espece = espece;
	}
	
	public String getNom() {
		return this.nom;
	}
	public String getCouleur() {
		return this.couleur;
	}
	
	public String getEspece() {
		return this.espece;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public void setEspece(String espece) {
		this.espece = espece;
	}
	
	//Polymorphisme
	@Override
	public void parler() {
		System.out.println("Le serpent "+getNom()+ " de couleur "+getCouleur()+" est un "+getEspece() +", il siffle et fait pizz pizz");
	}

	@Override
	public void sedeplacer() {
		System.out.println("Le serpent "+getNom()+ " de couleur "+getCouleur()+" est un "+getEspece() +", il se déplace en rampant");
	}
	
	@Override
	public void dormir() {
		System.out.println("Le serpent "+getNom()+ " de couleur "+getCouleur()+" est un "+getEspece() +", il dort dans son trou ");
	}
	@Override
	public void manger(String nourriture) {
		System.out.println("Le serpent "+getNom()+ " de couleur "+getCouleur()+" est un "+getEspece() +", il se nourrit de " +nourriture);
	}
	
	//Méthode spécifique à la classe
	public void ramper() {
		System.out.println("Le serpent "+getNom()+ " de couleur "+getCouleur()+" est un "+getEspece() +", il rampe et peut se déplacer sur terre comme dans les eaux.");
	}

}