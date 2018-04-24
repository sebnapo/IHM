package airHocker;

import java.awt.Rectangle;

public class Pulsar extends Palet {
	public int taille = 5;
	boolean monte= true;
	@Override
	public Rectangle getRect(){
		if(monte) taille++;
		if(taille == 15){
			monte = false;
		}
		if(!monte) taille--;
		if(taille == 5){
			monte = true;
		}
		System.out.println(taille);
    	return new Rectangle(x,y,taille,taille);
    }
}
