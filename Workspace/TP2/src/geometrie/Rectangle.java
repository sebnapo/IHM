package geometrie;

import java.awt.Graphics;

public class Rectangle implements Figure{
	public int longueur;
	public int largeur;
	
	
	public void trace(Graphics screen) {
		screen.drawRect(50, 50, longueur, largeur);
		
	}

	public float perimetre() {
		// TODO Auto-generated method stub
		return longueur*largeur;
	}

}
