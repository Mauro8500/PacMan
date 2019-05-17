package Clases;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Pilares 
{
	private int x,y;
	private static final int ancho=25,alto=250;
	
	public Pilares(int x, int y) 
	{
		this.x=x;
		this.y=y;
	}
	
	public Rectangle2D getPilares() 
	{
		return new Rectangle2D.Double(x, y, ancho, alto);
	}

}
