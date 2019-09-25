package Exercice_Distributeur;

public class Distributeur {
	private Bac bac1;
	private Bac bac2;
	
	public Distributeur(Bac bac1, Bac bac2) {
		this.bac1 = bac1;
		this.bac2 = bac2;
	}
	
	public void addCanetteDansBac(Bac bacChoisi, Canette canetteAjouter) {
		try {
			bacChoisi.addCanette(canetteAjouter);
		} catch (BacPleinException e) {
			// TODO Auto-generated catch block
			System.err.println("Bac plein");
			//Utile pour fichier log 
			//e.printStackTrace();
		} catch (MauvaisFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Mauvais format");
		}
	}
	public String toString(){
		StringBuffer chaine = new StringBuffer();
		chaine.append(bac1.toString());
		chaine.append(bac2.toString());
		return chaine.toString();
	}
}
