package geometrie;

import java.awt.Graphics;

public class Cercle implements Figure{
	public int rayon;
	
	public void trace(Graphics screen) {
		screen.drawOval(50, 50, rayon, rayon);
		
	}

	public float perimetre() {
		// TODO Auto-generated method stub
		return (float) (2*Math.PI*rayon);
	}

}
