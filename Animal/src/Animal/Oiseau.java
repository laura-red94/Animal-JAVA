package Animal;

public class Oiseau implements Animal {
	private String nom;
	private String couleur;

	public Oiseau(String nom, String couleur) {
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
		System.out.println("L'oiseau "+getNom()+ " de couleur "+getCouleur()+ " piaille et fait piou piou ");
	}

	@Override
	public void sedeplacer() {
		System.out.println("L'oiseau "+getNom()+ " de couleur "+getCouleur()+ " se déplace dans les airs");
	}
	
	@Override
	public void dormir() {
		System.out.println("L'oiseau "+getNom()+ " de couleur "+getCouleur()+ " dort dans les arbres ");
	}
	@Override
	public void manger(String nourriture) {
		System.out.println("L'oiseau "+getNom()+ " de couleur "+getCouleur()+ " se nourrit de " +nourriture);
	}
	
	//Méthode spécifique à la classe
	public void voler() {
		System.out.println("L'oiseau "+getNom()+ " de couleur "+getCouleur()+ " vole au-dessus des villes. ");
	}

}