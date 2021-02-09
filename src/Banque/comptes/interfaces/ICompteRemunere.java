package Banque.comptes.interfaces;

public interface ICompteRemunere {

	double calculerInterets();
	void verserInterets();
	double getTaux();
	void setTaux(double taux);
}
