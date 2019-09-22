package Exercice7;

public class Point {
	private int x;
	private int y;
	private static int compteurDePointsCréés = 0;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
		compteurDePointsCréés++;
		
	}
	
	public Point(int x) {
		this.x = x;
		compteurDePointsCréés++;
		
	}
	public Point() {
		compteurDePointsCréés++;
	}

	public static void main(String[] args) {
		Cercle c = new Cercle(new Point(1,2), 2);
		
		

	}
	public boolean isSamePoint(Point p1,Point p2) {
		if(p1.x == p2.x && p1.y ==p2.y) {
			return true;
		}
		return false;
	}
	public void translate(int dx, int dy) {
		this.x = x+dx;
		this.y = y+dx;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}

}
