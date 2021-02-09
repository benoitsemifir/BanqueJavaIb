package Banque.comptes;

public class Compte {


	private double solde;
	private int numero;
	
	public Compte() {
		this.solde = 0;
		this.numero = 0;
	}
	
	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public int getNumero() {
		return numero;
	}
	
	/**
	 * Setter du numéro
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void ajouter(double montant) {
		this.solde += montant;
	}
	
	public void retirer (double montant) {
		if(this.solde < montant) {
			System.out.println("Seuil dépassé !");
		}else {			
			this.solde -= montant;
		}
	}
	
	public String toString() {
		return this.getClass() + " numéro "+this.numero + " Solde "+this.solde+"€";
	}
	
}
