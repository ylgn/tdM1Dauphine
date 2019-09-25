package Exercice_Distributeur;

public class MauvaisFormatException extends Exception {
	public MauvaisFormatException() {
		super("Mauvais format : Impossible d'ajouter la canette");
	}
}
