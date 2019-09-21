package Exercice7;

public class Cercle {
	private Point p;
	private int rayon;
	
	public Cercle(Point p, int rayon) {
		this.p = p;
		this.rayon = rayon;
	}
	
	public String toString() {
		return "Centre : "+p.toString()+" \nRayon :"+rayon;
	}
	public void translate(int dx, int dy) {
		p.translate(dx, dy);
	}
}
