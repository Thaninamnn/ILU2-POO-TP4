package scenarioTest;

import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {

//	public static void acheterProduit(Etal[] marche, String produit, int quantiteSouhaitee) {
//		int quantiteRestante = quantiteSouhaitee;
//		for (int i = 0; i < marche.length && quantiteRestante != 0; i++) {
//			Etal etal = marche[i];
//			int quantiteDisponible = etal.contientProduit(produit, quantiteRestante);
//			if (quantiteDisponible != 0) {
//				int prix = etal.acheterProduit(quantiteDisponible);
//				String chaineProduit = accorderNomProduit(produit, quantiteDisponible);
//				System.out.println("A l'étal n° " + (i + 1) + ", j'achete " + quantiteDisponible + " " + chaineProduit
//						+ " et je paye " + prix + " sous.");
//				quantiteRestante -= quantiteDisponible;
//			}
//		}
//		String chaineProduit = accorderNomProduit(produit, quantiteSouhaitee);
//		System.out.println("Je voulais " + quantiteSouhaitee + " " + chaineProduit + ", j'en ai acheté "
//				+ (quantiteSouhaitee - quantiteRestante) + ".");
//	}

	private static String accorderNomProduit(String produit, int quantiteSouhaitee) {
		String chaineProduit = produit;
		if (quantiteSouhaitee > 1) {
			chaineProduit = produit + "s";
		}
		return chaineProduit;
	}

	public static void main(String[] args) {
	     // Déclaration du tableau d'étals, mais ici il est spécifié que le tableau ne contiendra que des étals de Sanglier
        IEtal<Sanglier>[] marche = new IEtal[3];

        // Création des étals de Sanglier
        IEtal<Sanglier> etalSanglier1 = new Etal<>("Billot intégré pour découpe de sangliers");
        IEtal<Sanglier> etalSanglier2 = new Etal<>("Étal spécifique pour découpe");

        // Ajout des étals au tableau marche
        marche[0] = etalSanglier1;
        marche[1] = etalSanglier2;

        // Affichage des descriptions spécifiques pour chaque étal
        System.out.println("Description de l'étal Sanglier 1: " + marche[0].getDescriptionSpecifique());
        System.out.println("Description de l'étal Sanglier 2: " + marche[1].getDescriptionSpecifique());

        
    }
		

	}


