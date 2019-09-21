package Exercice6;

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
		//Réponse question 4.1 
		//=> Cela fonction car les données x et y appartiennent 
		//à la classe et sont initialement initée à zéro lors de la création de l'objet.
		LigneBrisee line =  new LigneBrisee();
		//System.out.println(line.contains(null));
		line.add(p);
		//System.out.println(line.contains(null));
		//line.add(null);
		//System.out.println(line.contains(null));
		

	}
	public boolean isSamePoint(Point p1,Point p2) {
		if(p1.x == p2.x && p1.y ==p2.y) {
			return true;
		}
		return false;
	}

}
