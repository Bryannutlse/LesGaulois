package Personnages;



public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	
	
	public String getNom() {
		return nom;
	}
	
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
		
	}
	
	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}
	
	public void fabriquerPotion(int quantite , int forcePotion) {
		chaudron.remplirChaudron(quantite,forcePotion);
		
	}
	
	public void booster(Gaulois gaulois) {
		if (chaudron.resterPotion()) {
		        
		        String nomGaulois = gaulois.getNom();
		        
		        if (nomGaulois.equals("Obélix")) {
		            parler("Non, " + nomGaulois + " ! Et tu le sais très bien !");
		        } 
		        else {
		            chaudron.prendreLouche();
		            
		            int forcePotion = chaudron.forcePotion();
		            
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
