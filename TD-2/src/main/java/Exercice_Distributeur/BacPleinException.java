package Exercice_Distributeur;

public class BacPleinException extends Exception {
	public BacPleinException() {
		super("Bac plein : Impossible d'ajouter une canette de plus sinon explosion");
	}
}
