package Exo1;

public class Modele extends java.util.Observable {
	private int value;
	private static int MIN=0;
	private static int MAX=10;
	
	public Modele(int value) throws Exception{
		this.setValue(value);
	}
	
	public int getValue(){
		return this.value;
	}
	
	public void setValue(int value) throws Exception{
		if(value < MIN || value > MAX){
			throw new Exception("Veuillez rentrer un entier dans les bornes" + MIN +" - "+ MAX);
		} else {
			this.value = value;
			setChanged();
			notifyObservers();
		}
	}
	
	public void incValue() throws Exception{
		this.setValue(this.value+1);
	}
	
	public void decValue() throws Exception {
		this.setValue(this.value-1);
	}
	
	public void init(){
		this.setChanged();
		this.notifyObservers();
	}
}
