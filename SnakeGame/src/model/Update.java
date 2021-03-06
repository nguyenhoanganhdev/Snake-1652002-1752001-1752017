package model;

import java.awt.Color;

public class Update {

	private Color color;
	
	private Point point;
	
	public Update(Color color, Point point) {
		
		super();
		this.color = color;
		this.point = point;
	}
	
	public Color getColor() {
		
		return this.color;
	}
	
	public int getX() {
		
		return this.point.getX();
	}
	
	public int getY() {
		
		return this.point.getY();
	}
	
	public Point getPoint() {
		
		return this.point;
	}
}
