package Exercice_Distributeur;

public class Canette {
	private String nom;
	private String format;
	
	public Canette(String nom,String format) {
		this.nom = nom;
		this.format = format;
	}
	
	public String getNom() {
		return nom;
	}

	public String getFormat() {
		return format;
	}
	
	public String toString() {
		return "Nom "+this.nom+" | Format "+ this.format;
	} 

}
