package Exercice4;

import java.util.ArrayList;

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
		Point p1 = new Point(1,2);
		Point p2 = p1;
		Point p3 = new Point(1,2);
		//Réponse Q 5.1 : 
		//System.out.println(p1==p2);
		//System.out.println(p2==p3);
		//Le code affiche true false car les objets sont comparés
		//et pas leurs attributs
		ArrayList<Point> list= new ArrayList<Point>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p1));
		System.out.println(list.indexOf(p3));
		//Utilise get(int index)
		System.out.println(p1.equals(new String()));
		//False car p1 ne pas être égale à un objet sans lien d'occurence
		
	}
	public boolean isSamePoint(Point p1,Point p2) {
		if(p1.x == p2.x && p1.y ==p2.y) {
			return true;
		}
		return false;
	}
	

}
