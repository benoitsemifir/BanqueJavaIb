package Banque.comptes;

import Banque.comptes.interfaces.ICompteRemunere;

public class CompteRemunere extends Compte implements ICompteRemunere {
	private double taux;
	
	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	public CompteRemunere(int numero, double solde, double taux) {
		super(numero, solde);
		setTaux(taux);
	}
	
	public double calculerInterets() {
		return this.getTaux()*this.getSolde();
	}
	
	public void verserInterets() {
		double interets = this.calculerInterets();
		double newSolde = this.getSolde() + interets;
		this.setSolde(newSolde);
	}
	
	@Override
	public String toString() {
		String str = super.toString() + " taux : " + this.getTaux();
		return str;
	}
}
