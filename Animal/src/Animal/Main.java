package Animal;

public class Main {
	public static void main(String[] args) {
		System.out.println("---------------------------------------------");
		System.out.println("----------------LES ANIMAUX------------------");
		System.out.println("---------------------------------------------");
		
		
		//On ne peut pas créer d'objet avec l'interface, elle ne sert que pour les classes;
		//Animal chat = new Animal("Filou", "marron");
		
		Chat chat = new Chat("filou", "marron");
		//chat.parler();
		//chat.sedeplacer();
		//chat.manger("poisson");
		//chat.dormir();
		//méthodes spécifiques à chat
		//chat.segratter();
		//System.out.println("La famille de " +chat.getNom()+ " est "+chat.famille);
		//System.out.println("---------------------------------------------");
		Chien chien = new Chien("Rex", "noir");
		//chien.parler();
		//chien.sedeplacer();
		//chien.manger("poulet");
		//chien.dormir();
		//chien.jouer();
		//System.out.println("---------------------------------------------");
		Oiseau oiseau = new Oiseau("Piaf", "blanche");
		//oiseau.parler();
		//oiseau.sedeplacer();
		//oiseau.manger("vers");
		//oiseau.dormir();
		//oiseau.voler();
		//System.out.println("---------------------------------------------");
		Serpent serpent = new Serpent("Anaconda", "beige", "reptile");
		//serpent.parler();
		//serpent.sedeplacer();
		//serpent.manger("proies");
		//serpent.dormir();
		//serpent.ramper();
		Humain homme = new Humain("Yanis", "Clair", "Français", 180, 85);
		//homme.parler();
		//homme.sedeplacer();
		//homme.manger("proies");
		//homme.dormir();
	    //homme.lire();
		System.out.println("----------------POLYMORPHISME------------------");
		System.out.println("-------------Les animaux parlent---------------");
		
		Animal[] animaux = {chat, chien, oiseau, serpent};
		for(Animal a : animaux) {
			a.parler();
		}
		System.out.println("-------------Les animaux se déplacent---------------");
		for(Animal a : animaux) {
			a.sedeplacer();
		}
		System.out.println("-------------Les animaux se nourrient---------------");
		for(Animal a : animaux) {
			a.manger("herbe");
		}
		System.out.println("-------------Les animaux dorment---------------");
		for(Animal a : animaux) {
			a.dormir();
		}
		System.out.println("-------------Méthodes spécifiques---------------");
		chat.segratter();
		chien.jouer();
		oiseau.voler();
		serpent.ramper();
		homme.lire();
	}

	
}
	

