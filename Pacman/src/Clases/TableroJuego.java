package Clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class TableroJuego extends JPanel
{
	Pacman r1 = new Pacman(10,200);
	Pilares p1 = new Pilares(205,100);
	Pilares p2 = new Pilares(575,100);
	Pastillas pa1 = new Pastillas(0,0);
	Pastillas pa2 = new Pastillas(0,0);
	
	
	public TableroJuego() 
	{
		setBackground(Color.BLACK);
	}
	@Override
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.WHITE);
		dibujarPuntaje(g2);
		dibujar(g2);
		actualizar();
	}
	
	public void dibujar(Graphics2D g) 
	{
		g.fill(r1.getRaqueta());
		g.fill(p1.getPilares());
		g.fill(p2.getPilares());
		g.fill(pa1.getPastillas());
		g.fill(pa2.getPastillas());
	}
	public void actualizar() 
	{
		r1.moverR1(getBounds());
	}
	public void iterarJuego() 
	{
		while(true) 
		{
			repaint();
			try {
				Thread.sleep(2);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	/*private boolean colision(Rectangle2D r) 
	{
		return pelota.getPelota().intersects(r);
	}*/
	private void dibujarPuntaje(Graphics2D g) 
	{
        Graphics2D g1 = g, g2 = g;
        Font score = new Font("Arial", Font.BOLD, 30);
        g.setFont(score);

        
        }
}