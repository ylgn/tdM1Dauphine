package TestExercice4;

import org.junit.Test;

import Exercice4.Point;

public class TestPoint {

	@Test
	public void test() {
		Point p = new Point();
		// System.out.println(p.x+" "+p.y);
		// Réponse 4.2 : Cela ne fonctionne pas car comme les attributs
		// des point x et y sont private seule la classe Point y accès
		//En créant des getteurs et des setteurs ou en créeant une classe prenant en param des points
	}

}
