package Exo1;

import java.awt.event.ActionEvent;
import java.util.Observable;

import javax.swing.AbstractAction;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Controleur{
	private Modele modele;
	private Vue vue;
	
	public Controleur(Modele modele){
		this.modele = modele;
		this.vue = new Vue();
		UpdateTxt obs = new UpdateTxt(modele);
		
		ActionPlus listenerPlus = new ActionPlus(vue,modele);
		ActionMoins listenerMoins = new ActionMoins(vue,modele);
		ActionModifierTexte listenerModifierTexte = new ActionModifierTexte(vue,modele);
		
		this.vue.label.addActionListener(listenerModifierTexte);
		this.vue.btnPlus.addActionListener(listenerPlus);
		this.vue.btnMoins.addActionListener(listenerMoins);
		
		this.modele.init();
	}
	
	private class ActionPlus extends AbstractAction implements java.util.Observer {
		
		public ActionPlus(Vue vue, Modele modele){
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			try {
				Controleur.this.modele.incValue();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@Override
		public void update(Observable arg0, Object arg1) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class ActionMoins extends AbstractAction implements java.util.Observer {
		
		public ActionMoins(Vue vue,Modele modele){
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				modele.decValue();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@Override
		public void update(Observable arg0, Object arg1) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class ActionModifierTexte extends AbstractAction implements java.util.Observer {

		public ActionModifierTexte(Vue vue, Modele modele) {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				modele.setValue(Integer.parseInt(vue.label.getText()));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@Override
		public void update(Observable arg0, Object arg1) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class UpdateTxt implements java.util.Observer {
		
		private Modele modele;
		
		public UpdateTxt(Modele modele){
			this.modele = modele;
			this.modele.addObserver(this);
		}
		
		public void update(Observable arg0, Object arg1) {
			// TODO Auto-generated method stub
			vue.label.setText(String.valueOf(modele.getValue()));
			vue.repaint();
		}	
	}
}
