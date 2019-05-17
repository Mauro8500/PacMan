package Clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EventoTeclado extends KeyAdapter
{
	static boolean w, s, d, a;
	
    @Override
    public void keyPressed(KeyEvent e) 
    {
        int id = e.getKeyCode();
        
        if (id == KeyEvent.VK_W) 
        {
            w = true;
        }
        if (id == KeyEvent.VK_S) 
        {
            s = true;
        }
        if (id == KeyEvent.VK_D) 
        {
            d = true;
        }
        if (id == KeyEvent.VK_A) 
        {
            a = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        int id = e.getKeyCode();
        
        if (id == KeyEvent.VK_W) 
        {
            w = false;
        }
        if (id == KeyEvent.VK_S) 
        {
            s = false;
        }
        if (id == KeyEvent.VK_D) 
        {
            d = false;
        }
        if (id == KeyEvent.VK_A) 
        {
            a = false;
        }
    }
}
