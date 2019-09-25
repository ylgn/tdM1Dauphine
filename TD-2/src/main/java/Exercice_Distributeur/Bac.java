package Exercice_Distributeur;

import java.util.ArrayList;

public  class Bac {
	private String format;
	final static int MAX_CAPACITY = 10;
	private int capacity = 0; 
	private ArrayList<Canette> listDesCanettes = new ArrayList<Canette>();	
	
	public Bac(String format) {
		this.format = format;
	}
	
	public String toString() {
		StringBuffer chaine = new StringBuffer();
		chaine.append("Détail du bac de capacité max = "+MAX_CAPACITY+"\n");
		chaine.append("Liste des "+capacity+" canettes :\n");
		for (Canette canette : listDesCanettes) {
			chaine.append("* "+canette.toString()+"\n");
		}
		return chaine.toString();
		
	}
	//public abstract void addCanette() throws BacPleinException;
	public void addCanette(Canette c) throws BacPleinException, MauvaisFormatException {
		if (capacity ==MAX_CAPACITY) {
			throw new BacPleinException();
		}else if (this.format != c.getFormat()) {
			throw new MauvaisFormatException();
		}else{
			listDesCanettes.add(c);
			capacity++;
		}
	}
	
	
}
