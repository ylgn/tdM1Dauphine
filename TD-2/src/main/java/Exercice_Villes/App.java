package Exercice_Villes;

import java.util.ArrayList;

import Exercice_Logger.Logger;
import Exercice_Logger.classeDeTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        

        ArrayList<Ville> listeDesVilles = new ArrayList<Ville>();
        
      
        
        
        Ville paris = new VilleInteressante("PARIS", 48.85, 2.34,"TOUR EIFFEL");
        Ville bordeaux = new Ville("BORDEAUX",44.85,-0.56);
        Ville nice = new Ville("NICE",43.70,7.25);
        
        listeDesVilles.add(paris);
        listeDesVilles.add(bordeaux);
        listeDesVilles.add(nice);
        
        for (Ville ville : listeDesVilles) {
			System.out.println(ville.toString());
		}
        
    }
}
