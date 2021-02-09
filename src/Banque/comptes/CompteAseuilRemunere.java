package Banque.comptes;

import Banque.comptes.interfaces.ICompteASeuil;

public class CompteAseuilRemunere extends CompteRemunere implements ICompteASeuil {
	
	private double seuil;

	public CompteAseuilRemunere(int numero, double solde, double taux, double seuil) {
		super(numero, solde, taux);
		this.seuil = seuil;
	}

	@Override
	public double getSeuil() {
		return this.seuil;
	}

	@Override
	public void setSeuil(double seuil) {
		this.seuil = seuil;
		
	}

	public void retirer(double val) {
		if(this.getSolde()-val > this.seuil) {
			this.setSolde(this.getSolde()-val);
			System.out.println("OK");
		}else {
			System.out.println("Dépassement du seuil");
		}
	}

	@Override
	public String toString() {
		return "CompteAseuilRemunere [getSeuil()=" + getSeuil() + ", getTaux()=" + getTaux() + ", calculerInterets()="
				+ calculerInterets() + ", toString()=" + super.toString() + ", getSolde()=" + getSolde()
				+ ", getNumero()=" + getNumero() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
