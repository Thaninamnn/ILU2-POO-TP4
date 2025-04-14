package villagegaulois;

import personnages.Gaulois;


import java.util.Objects;

import personnages.Gaulois;
import produit.Produit;

public class Etal<P extends Produit> implements IEtal<P> {
	private Gaulois vendeur;
	private P produit;
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
	public P getProduit() {
		return produit;
	}

	@Override
	public String getDescriptionSpecifique() {
		return descriptionSpecifique;
	}

	@Override
	public void occuperEtal(Gaulois vendeur, P produit, int quantite) {
		this.vendeur = vendeur;
		this.produit = produit;
		this.quantiteDebutMarche = quantite;
		this.quantite = quantite;
		this.etalOccupe = true;
	}

	@Override
	public void libererEtal() {
		this.vendeur = null;
		this.produit = null;
		this.quantiteDebutMarche = 0;
		this.quantite = 0;
		this.etalOccupe = false;
	}

	@Override
	public String toString() {
	    return "Étal de " + Objects.toString(produit, "produits variés") + " - " + descriptionSpecifique;
	}
}

