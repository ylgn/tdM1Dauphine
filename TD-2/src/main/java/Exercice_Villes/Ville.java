package Exercice_Villes;

import java.util.ArrayList;

public class Ville {
	private String nom;
	private double coordLongitude;
	private double coordLatitude;
	private ArrayList<String> attributList = new ArrayList<String>();
	

	
	public Ville(String nom, double coordLo, double coordLa) {
		this.nom = nom;
		this.coordLongitude = coordLo;
		this.coordLatitude = coordLa;
		String coord = "("+coordLatitude+" N,"+coordLongitude +" O)";
		addAttribute(this.nom);
		addAttribute(coord);
	}
	
	public String toString() {
		StringBuilder toReturn = new StringBuilder();
		toReturn.append("[");
		for (String s : attributList) {
			if (s.equals(attributList.get(attributList.size()-1))){
				toReturn.append(" "+s);
			}else {
			toReturn.append(" "+s+",") ;}
		}
		return toReturn.append("]").toString();	
	}
	
	public void addAttribute(String aToAdd) {
		this.attributList.add(aToAdd);
	}
	
	
}
