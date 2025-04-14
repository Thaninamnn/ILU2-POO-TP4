package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public interface IEtal<P extends Produit> {

	boolean isEtalOccupe();

	Gaulois getVendeur();

	int getQuantite();

	P getProduit();

	String getDescriptionSpecifique();

//	void occuperEtal(Gaulois vendeur, P produit, int quantite);
//
//	void libererEtal();
//
//	String toString();

}