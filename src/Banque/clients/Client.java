package Banque.clients;

import java.util.Arrays;

import Banque.comptes.Compte;

public class Client  {
	private String nom;
	private String prenom;
	private int age;
	private int numero;
	private Compte[] comptes = new Compte[5];
	
	public Compte[] getComptes() {
		return comptes;
	}

	public void setComptes(Compte[] comptes) {
		this.comptes = comptes;
	}

	public Client() {
		
	}
	
	public Client(int numero, String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void ajouterCompte(Compte compte) {
		
		for (int i = 0; i < comptes.length; i++) {
			if(comptes[i] == null) {
				comptes[i] = compte;
				return;
			}
		}
		System.out.println("Nombre de compte dépassé !");			
	}
	
	public Compte getCompte(int numero) {
		for(Compte cpt : this.comptes) {
			if( cpt.getNumero() == numero) {
				return cpt;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", numero=" + numero + ", comptes="
				+ Arrays.toString(comptes) + "]";
	}
}
