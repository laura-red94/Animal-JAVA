package Animal;

public class Humain implements Animal {
	private String nom;
	private String teint;
	private String nationalité;
	private int taille;
	private int poids;
	
	//Le consctructeur

	public Humain(String nom, String teint, String nationalité, int taille, int poids) {
		this.nom = nom;
		this.teint = teint;
		this.nationalité = nationalité;
		this.taille = taille;
		this.poids = poids;
	}
	
	public String getNom() {
		return this.nom;
	}
	public String getTeint() {
		return this.teint;
	}
	
	public String getNationalité() {
		return this.nationalité;
	}
	
	public int  getTaille() {
		return this.taille;
	}
	
	public int getPoids() {
		return this.poids;
	}
	
	

	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setTeint(String teint) {
		this.teint = teint;
	}
	
	public void setNationalité(String nationalité) {
		this.nationalité = nationalité;
	}
	
	public void setTaille(String taille) {
		this.taille = taille;
	}
	
	public void setPoids(String poids) {
		this.poids = poids;
	}
	
	//Polymorphisme
	@Override
	public void parler() {
		System.out.println("L'Homme "+getNom()+ " de teint "+getTeint()+" mesurant "+getTaille() +"cm et pesant "+getPoids()+ "kg, parle "+getNationalité());
	}

	@Override
	public void sedeplacer() {
		System.out.println("L'Homme "+getNom()+ " de teint "+getTeint()+" mesurant "+getTaille() +"cm et pesant "+getPoids()+ "kg, parle "+getNationalité()+ "marche avec ses 2 jambes");
	}
	
	@Override
	public void dormir() {
		System.out.println("L'Homme "+getNom()+ " de teint "+getTeint()+" mesurant "+getTaille() +"cm et pesant "+getPoids()+ "kg, parle "+getNationalité()+ " dort dans son lit");
	}
	@Override
	public void manger(String nourriture) {
		System.out.println("L'Homme "+getNom()+ " de teint "+getTeint()+" mesurant "+getTaille() +"cm et pesant "+getPoids()+ "kg, parle "+getNationalité()+ " se nourrit de "+nourriture);
	}
	
	//Méthode spécifique à la classe
	public void lire() {
		System.out.println("L'Homme "+getNom()+ " de teint "+getTeint()+" mesurant "+getTaille() +"cm et pesant "+getPoids()+ "kg, parle "+getNationalité()+ " et lit des romans.");
	}

	
	
}