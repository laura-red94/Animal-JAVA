/**
 * INTERFACE : c'est comMe un contrat que devront respecter toutes les classes Animal
 * l'interface ne peut contenir que des methodes non implémentées et des constantes
 */


package Animal;
public interface Animal {
	//propriété Constante
	String famille = "Animal";
	
	//les méthodes
	void parler ();
	void sedeplacer();
	void manger(String nourriture);
	void dormir();
	
}
