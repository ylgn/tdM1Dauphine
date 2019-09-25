package Exercice_Distributeur;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final String TYPE_LARGE = "large";
        final String TYPE_LONGUE = "longue";
        
    	Bac bac1 = new Bac(TYPE_LARGE);
        Bac bac2 = new Bac(TYPE_LONGUE);
        
    	Distributeur distributeur = new Distributeur(bac1,bac2);
    	
        distributeur.addCanetteDansBac(bac1, new Canette("Heineken",TYPE_LARGE));
        distributeur.addCanetteDansBac(bac1, new Canette("Heineken",TYPE_LARGE));
        distributeur.addCanetteDansBac(bac1, new Canette("Heineken",TYPE_LARGE));
        distributeur.addCanetteDansBac(bac1, new Canette("Heineken",TYPE_LARGE));
        distributeur.addCanetteDansBac(bac1, new Canette("Heineken",TYPE_LARGE));
        distributeur.addCanetteDansBac(bac1, new Canette("Heineken",TYPE_LARGE));
        distributeur.addCanetteDansBac(bac1, new Canette("Heineken",TYPE_LONGUE));
        distributeur.addCanetteDansBac(bac1, new Canette("Heineken",TYPE_LARGE));
        distributeur.addCanetteDansBac(bac1, new Canette("Heineken",TYPE_LARGE));
        distributeur.addCanetteDansBac(bac1, new Canette("Heineken",TYPE_LARGE));
        distributeur.addCanetteDansBac(bac1, new Canette("Heineken",TYPE_LARGE));
        distributeur.addCanetteDansBac(bac1, new Canette("Heineken",TYPE_LARGE));
        
        distributeur.addCanetteDansBac(bac2, new Canette("Coca-cola",TYPE_LARGE));
        distributeur.addCanetteDansBac(bac2, new Canette("Coca-cola",TYPE_LONGUE));
        distributeur.addCanetteDansBac(bac2, new Canette("Coca-cola",TYPE_LONGUE));
        distributeur.addCanetteDansBac(bac2, new Canette("Coca-cola",TYPE_LONGUE));
        distributeur.addCanetteDansBac(bac2, new Canette("Coca-cola",TYPE_LONGUE));
        distributeur.addCanetteDansBac(bac2, new Canette("Coca-cola",TYPE_LARGE));
        distributeur.addCanetteDansBac(bac2, new Canette("Coca-cola",TYPE_LONGUE));
        distributeur.addCanetteDansBac(bac2, new Canette("Coca-cola",TYPE_LONGUE));
        distributeur.addCanetteDansBac(bac2, new Canette("Coca-cola",TYPE_LONGUE));
        distributeur.addCanetteDansBac(bac2, new Canette("Coca-cola",TYPE_LONGUE));
        distributeur.addCanetteDansBac(bac2, new Canette("Coca-cola",TYPE_LONGUE));
       
        
        System.out.println(distributeur.toString());
        
    }
}
