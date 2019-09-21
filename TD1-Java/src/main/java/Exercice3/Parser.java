package Exercice3;

public class Parser {
	public String concatenationTabAvecChar(String[] tabString,char lettre) {
		String resultat = new String();
		
		for (String string : tabString) {
			if(string!=tabString[tabString.length -1]) {
				resultat+= string+lettre;
			}else
				resultat+= string;
		}
		return resultat;
	}
	public String[] concatenationStringAvecChar(String s,char lettre) {
		String[] resultat = {};
		resultat = s.split(String.valueOf(lettre));
		return resultat;
	}

}
