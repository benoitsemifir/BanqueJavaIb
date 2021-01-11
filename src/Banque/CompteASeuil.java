package Banque;

import Banque.Interfaces.ICompteASeuil;

public class CompteASeuil extends Compte implements ICompteASeuil {

	private double seuil;

	public CompteASeuil() {
		this(0, 0, 0);
	}

	public CompteASeuil(int numero, double solde, double seuil) {
		super(numero, solde);
		this.seuil = seuil;
	}

	public double getSeuil() {
		return seuil;
	}

	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}
	
	
	public void retirer(double val) {
		if(this.getSolde()-val > this.seuil) {
			this.setSolde(this.getSolde()-val);
			System.out.println("OK");
		}else {
			System.out.println("Dépsassement du seuil");
		}
	}
	
	@Override
	public String toString() {
		return "CompteASeuil [getSeuil()=" + getSeuil() + ", getSolde()=" + getSolde() + ", getNumero()=" + getNumero()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

		
}
