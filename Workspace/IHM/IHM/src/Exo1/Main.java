package Exo1;

import javax.swing.JFrame;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Modele ent = new Modele(3);
			Modele ent2 = new Modele(3);
			Controleur control = new Controleur(ent);
			Controleur control2 = new Controleur(ent2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}	
	}

}
