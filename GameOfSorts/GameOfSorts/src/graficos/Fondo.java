package graficos;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Entidades.Entidad;
import Estados.Estado;
import Estados.Estado_Juego;
import Estados.Estado_Menu;
import Logica.Game;

public class Fondo extends Entidad{
	private BufferedImage imagen;
	public Fondo(Game game, float x, float y) {
		super(game, x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void update() {
	
	}
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.cielo,0,0,null);
		
	}
	
}
/*
public class Fondo extends Thread{
private int xImagen=0,cont;
private Thread hiloFondo;
private BufferedImage cielo,Hud;
private boolean ejecutando = true;
private Graphics g;


Display display;

public Fondo (Display display) {
	this.g = display.getCanvas().getGraphics();
}
@Override
public void run() {
	while (ejecutando) {
		update();
		}
	}
private void update() {
	g.drawImage(Assets.cielo,xImagen,0,null);
	g.drawImage(Assets.Hud,0,0,null);
	
}

}*/
