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
	public Point getCenter() {
		return this.p;
	}
	public double surface() {
		return (Math.PI * Math.pow(rayon, 2));
	}
	public boolean equals(Cercle a, Cercle b) {
		if (a.surface() == b.surface()) {
			return true;
		}
		return false;
	}
	public boolean contains(Point a) {
		if (distance(a)<=rayon) {
			return true;
		}
		return false;
	}
	public double distance(Point a) {
		return Math.sqrt(Math.pow(a.getX()-p.getX(),2)+Math.pow(a.getY()-p.getY(),2));
	}
	
}
