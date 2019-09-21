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
		Point p = new Point(2,1);
		String point = "("+p.x+","+p.y+")";
		System.out.println(compteurDePointsCréés);
		System.out.println(point);
		Point o = new Point();
		point = "("+o.x+","+o.y+")";
		System.out.println(compteurDePointsCréés);
		System.out.println(point);
		Point i = new Point(2);
		point = "("+i.x+","+i.y+")";
		System.out.println(point);
		System.out.println(compteurDePointsCréés);
		
		

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

}
