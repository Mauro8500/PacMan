package Clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Pacman 
{
	private int x,y;
	private static final int ancho=10,alto=45;
	
	public Pacman(int x, int y) 
	{
		this.x=x;
		this.y=y;
	}
	
	public Rectangle2D getRaqueta() 
	{
		return new Rectangle2D.Double(x, y, ancho, alto);
	}
	
	public void moverR1(Rectangle limites) 
	{
		if(EventoTeclado.w && y > limites.getMinY()) 
		{
			y--;
		}
		if(EventoTeclado.s && y < limites.getMaxY()-alto) 
		{
			y++;
		}
		if(EventoTeclado.d && y > limites.getMinY()) 
		{
			x++;
		}
		if(EventoTeclado.a && y < limites.getMaxY()-ancho) 
		{
			x--;
		}
	}
}
