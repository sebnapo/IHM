package napoleon.architectureComposite;

public class Cellule implements Liste {
	
	int val;
	Liste next;
	
	public Cellule(int val, Liste next){
		this.val = val;
		this.next = next;
	}
	public int size() {
		int cpt = this.next.size();
		if(cpt > Integer.MAX_VALUE) return Integer.MAX_VALUE;
		return cpt+=1;
	}
	//@Override
	public boolean find(int n) {
		boolean res = this.next.find(n);
		if(this.val == n){
			return true;
		}
		return res;
	}
	
	public int max() {
		int tmp = this.next.max();
		if(tmp < this.val) {
			return this.val;
		}
		return tmp;
	}
	
	@Override
	public String toString(){
		return "La liste contient "+ this.size() + " éléments";
	}
	public boolean isEmpty() {
		if(this.size() == 0){
			return true;
		}
		return false;
	}
	
}
