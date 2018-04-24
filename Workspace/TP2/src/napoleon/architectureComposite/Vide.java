package napoleon.architectureComposite;

public class Vide implements Liste {

	public int size() {
		return 0;
	}

	public boolean find(int n) {
		return false;
	}

	public int max() {
		return Integer.MIN_VALUE;
	}
	
	@Override
	public String toString(){
		return "La liste contient "+ this.size() + " élément";
	}

	public boolean isEmpty() {
		return true;
	}
	
}
