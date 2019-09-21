package Exercice6;

import java.util.LinkedList;

public class LigneBrisee {
	//private int nombreMaxiDePoints;
	//private int compteurDePointsAjoutés = 0;
	//private Point[] tabDePoints;
	private LinkedList<Point> tabDePoints;
	
	public LigneBrisee() {
		//this.nombreMaxiDePoints = nombreMaxiDePoints;
		//this.tabDePoints = new Point[nombreMaxiDePoints];	
		this.tabDePoints = new LinkedList<Point>();
	}
	
	public void add(Point p) {
		/*if (compteurDePointsAjoutés == nombreMaxiDePoints) {
			 System.err.println("Line full");
		}else {
			tabDePoints[compteurDePointsAjoutés++]=p;
		
		}*/
		tabDePoints.add(p);
	}
	
	
	public int pointCapacity() {
		//return nombreMaxiDePoints;
		return 1;
	}
	//devient size()
	public int nbPoints() {
		//return compteurDePointsAjoutés;
		return tabDePoints.size(); 
	}
	
	public boolean contains(Point p) {
		/*for (Point point : tabDePoints) {
			if(point.isSamePoint(point, p)) {
				return true;
			}
		}
		return false;
		*/
		return tabDePoints.contains(p);
	}
}
