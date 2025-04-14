package villagegaulois;

import personnages.Gaulois;


import java.util.Objects;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;

public class Etal implements IEtal {
	private Gaulois vendeur;
	private Produit produit;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;
	private String descriptionSpecifique; // Ajout pour les spécificités d'étal

	public Etal(String descriptionSpecifique) {
		this.descriptionSpecifique = descriptionSpecifique;
	}

	@Override
	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	@Override
	public Gaulois getVendeur() {
		return vendeur;
	}

	@Override
	public int getQuantite() {
		return quantite;
	}

	@Override
	public Produit getProduit() {
		return produit;
	}

	@Override
	public String getDescriptionSpecifique() {
		return descriptionSpecifique;
	}

	@Override
	public void occuperEtal(Gaulois vendeur, Produit produit, int quantite) {
		 this.vendeur = vendeur;
	        this.produit = (Produit) produit; // Cast explicite ici
	        this.quantite = quantite;
	        this.etalOccupe = true;
	}

//
//	@Override
//	public void libererEtal() {
//		this.vendeur = null;
//		this.produit = null;
//		this.quantiteDebutMarche = 0;
//		this.quantite = 0;
//		this.etalOccupe = false;
//	}
//
//	@Override
//	public String toString() {
//	    return "Étal de " + Objects.toString(produit, "produits variés") + " - " + descriptionSpecifique;
//	}
}

