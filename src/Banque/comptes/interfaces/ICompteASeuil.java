package Banque.comptes.interfaces;

public interface ICompteASeuil {
	void retirer(double valeur);
	double getSeuil();
	void setSeuil(double seuil);
}
