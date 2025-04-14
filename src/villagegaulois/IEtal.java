package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public interface IEtal {

	boolean isEtalOccupe();

	Gaulois getVendeur();

	int getQuantite();

	Produit getProduit();

	String getDescriptionSpecifique();

	void occuperEtal(Gaulois vendeur, Produit produit, int quantite);
//
//	void libererEtal();
//
//	String toString();

}