/**
 * la classe Chat va implémenter toutes les méthodes de l'interface Animal
 * 
 */

package Animal;
public class Chat implements Animal {
	private String nom;
	private String couleur;

	public Chat(String nom, String couleur) {
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
		System.out.println("Le chat "+getNom()+ " de couleur "+getCouleur()+ " miaule et fait miaouh miaouh ");
	}

	@Override
	public void sedeplacer() {
		System.out.println("Le chat "+getNom()+ " de couleur "+getCouleur()+ " se déplace à 4 pattes ");
	}
	
	@Override
	public void dormir() {
		System.out.println("Le chat "+getNom()+ " de couleur "+getCouleur()+ " dort dans son coussin ");
	}
	@Override
	public void manger(String nourriture) {
		System.out.println("Le chat "+getNom()+ " de couleur "+getCouleur()+ " se nourrit de " +nourriture);
	}
	
	//Méthode spécifique à la classe
	public void segratter() {
		System.out.println("Le chat "+getNom()+ " de couleur "+getCouleur()+ " se gratte les oreilles ");
	}

}