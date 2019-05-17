package Clases;

import java.awt.geom.Rectangle2D;

public class Pastillas 
{

	private int x,y;
	private static final int ancho=20,alto=20;
	
	public Pastillas(int x, int y) 
	{
		this.x=x;
		this.y=y;
	}
	
	public Rectangle2D getPastillas() 
	{
		return new Rectangle2D.Double(x, y, ancho, alto);
	}


}
