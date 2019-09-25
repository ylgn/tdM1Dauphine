package Exercice_Villes;

public class VilleInteressante extends Ville {
	private String meilleurPointdInteret;
	public VilleInteressante(String nom, double coordLo, double coordLa,String meilleurPointdInteret) {
		super(nom, coordLo, coordLa);
		// TODO Auto-generated constructor stub
		this.meilleurPointdInteret = meilleurPointdInteret;
		addAttribute(meilleurPointdInteret);
	}

}
