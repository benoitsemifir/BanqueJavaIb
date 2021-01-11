package Banque;

import Banque.Interfaces.ICompteRemunere;

public class Run {

	public static void main(String[] args) {

		Client client = new Client(007,"Routier", "Benoît",27);

		Compte compteCourant = new Compte(478,100);

		client.ajouterCompte(compteCourant);


		System.out.println(client.toString());

		System.out.println(client.getComptes());

		CompteRemunere livretA = new CompteRemunere(285, 10, 0.005);

		CompteASeuil CompteJeune = new CompteASeuil(16,50,0);

		CompteAseuilRemunere casr = new CompteAseuilRemunere(8, 25, 0.0038, 50); 


		client.ajouterCompte(livretA);
		client.ajouterCompte(CompteJeune);
		client.ajouterCompte(casr);


		System.out.println(client.toString());

		System.out.println(client.getComptes());

		System.out.println(client.getCompte(8).getSolde());
		client.getCompte(8).retirer(20);
		System.out.println(client.getCompte(8).getSolde());
		client.getCompte(8).retirer(20);
		System.out.println(client.getCompte(8).getSolde());

	for (Compte compte: client.getComptes()) {
		if(compte instanceof ICompteRemunere) {
//			DownCast de Compte vers l'interface ICompteRemunere
			// compte prend le rôle de compte remuneré;
			((ICompteRemunere) compte).verserInterets();
		}
	}

	//System.out.println(Arrays.toString(client.getComptes()));
	System.out.printf("Le client %s a les comptes %s", client.toString(), client.getComptes());
	//System.out.format("Le client %s a les comptes %s", client.toString(), client.getComptes());
	//System.out.println(String.format("Le client %s a les comptes %s", client.toString(), client.getComptes()));

}

}
