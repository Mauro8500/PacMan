package Clases;

import javax.swing.JFrame;

public class Ventana extends JFrame
{
	private final int ancho=800, alto=500;
	private TableroJuego lamina;
	public Ventana() 
	{
		setTitle("Pac-man");
		setSize(ancho, alto);
		setLocationRelativeTo(null);//ubica la ventana al medio de la pantalla
		setResizable(false);//hace que no se pueda modificar el ancho de la pantalla
		lamina = new TableroJuego();
		add(lamina);
		addKeyListener(new EventoTeclado());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lamina.iterarJuego();
	}
}
