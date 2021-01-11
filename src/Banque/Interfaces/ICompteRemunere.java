package Banque.Interfaces;

public interface ICompteRemunere {

	double calculerInterets();
	void verserInterets();
	double getTaux();
	void setTaux(double taux);
}
