package Personnages;



public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron();
	
	
	
	public String getNom() {
		return nom;
	}
	
	
	
	
	public Druide(String nom, int force) {
		
		this.nom = nom;
		this.force = force;
	}




	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
		
	}
	
	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}
	
	public void fabriquerPotion(int quantite , int forcePotion) {
		chaudron.remplirChaudron(quantite,forcePotion);
		parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de" 
		+ forcePotion + ".");
		
	}
	
	public void booster(Gaulois gaulois) {
		if (chaudron.resterPotion()) {
		        
		        String nomGaulois = gaulois.getNom();
		        
		        if (nomGaulois != null && nomGaulois.equals("Obélix")) {
		            parler("Non, " + nomGaulois + " ! Et tu le sais très bien !");
		        } 
		        else {
		            chaudron.prendreLouche();
		            
		            int forcePotion = chaudron.prendreLouche();
		            
		            gaulois.boirePotion(forcePotion);
		            
		            parler("Tiens " + nomGaulois + " : un peu de potion magique.");
		        }
		        
		    } 
		    else {
		        parler("Désolé " + gaulois.getNom() 
		               + " : il n'y a plus une seule goutte de potion.");
		    
		}

		
	}
	
	
	
	
	
	
}
