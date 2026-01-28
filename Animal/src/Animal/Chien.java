package Animal;

public class Chien implements Animal {
	private String nom;
	private String couleur;

	public Chien(String nom, String couleur) {
		this.nom = nom;
		this.couleur = couleur;
	}
	
	public String getNom() {
		return this.nom;
	}
	public String getCouleur() {
		return this.couleur;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	//Polymorphisme
	@Override
	public void parler() {
		System.out.println("Le chien "+getNom()+ " de couleur "+getCouleur()+ " aboie et fait wouaf wouaf ");
	}

	@Override
	public void sedeplacer() {
		System.out.println("Le chien "+getNom()+ " de couleur "+getCouleur()+ " se déplace à 4 pattes ");
	}
	
	@Override
	public void dormir() {
		System.out.println("Le chien "+getNom()+ " de couleur "+getCouleur()+ " dort dans sa niche ");
	}
	@Override
	public void manger(String nourriture) {
		System.out.println("Le chien "+getNom()+ " de couleur "+getCouleur()+ " se nourrit de " +nourriture);
	}
	
	//Méthode spécifique à la classe
	public void jouer() {
		System.out.println("Le chien "+getNom()+ " de couleur "+getCouleur()+ " joue à la balle ");
	}

}