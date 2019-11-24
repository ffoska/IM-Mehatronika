package geometry;

import java.awt.Graphics;

public class Line extends Shape{
	private Point startPoint;
	private Point endPoint;
	
	public Line() {

	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}

	// (xStartPoint,yStartpoint)-->(xEndPoint,yEndpoint)
	public String toString() {
		return startPoint+"-->"+endPoint;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Line) {
			Line temp = (Line) obj;
			return startPoint.equals(temp.startPoint) && endPoint.equals(temp.endPoint);
		}
		return false;
	}
	
	public boolean contains(int x, int y) {
		return (startPoint.distance(x, y) + endPoint.distance(x, y)) - length() < 2;
	}

	public double length() {
		return startPoint.distance(endPoint.getX(), endPoint.getY());
	}

	public Point getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawLine(startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());
	}
}
