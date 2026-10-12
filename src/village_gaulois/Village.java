package village_gaulois;

import Personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;
	
	public Village(String nom, Gaulois chef, int nbVillageoisMax) {
		super();
		this.nom = nom;
		this.chef = chef;
		this.villageois = new Gaulois[nbVillageoisMax];
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		gaulois.setVillage(this);
		nbVillageois++;
		
		
	}
	 public Gaulois trouverVillageois(int numVillageois) {
		 int ind = numVillageois - 1;
		 if (ind < 0 || ind >= nbVillageois) {
			 System.out.println("Il n'y a pas autant d'habitants dans notre village !");
			 return null;
			 
		 }
		 
		 return villageois[ind];
	 }
	 
	 public void afficherVillageois() {
		 System.out.println("Dans le village " + nom + " du chef " + chef.getNom() + "vivent les légendaires gaulois :");
		 
		 for (int i =0; i<nbVillageois; i++) {
			 System.out.println("-" + villageois[i].getNom());
		 }
	}
	 
	 public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix" , 6);
		Village village = new Village("Village des Irréductibles", abraracourcix , 30);
		
		village.trouverVillageois(30);
		
		Gaulois asterix = new Gaulois("Astérix" , 8);
		village.ajouterVillageois(asterix);
		
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		
		Gaulois obelix = new Gaulois("Obelix" , 25);
		village.ajouterVillageois(obelix);
		village.afficherVillageois();
		
		Gaulois doublepolemix = new Gaulois("Doublepolemix" , 4);
		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublepolemix.sePresenter();
		
	}
	
	
	
	

}
