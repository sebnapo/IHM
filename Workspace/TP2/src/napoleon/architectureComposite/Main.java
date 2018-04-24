package napoleon.architectureComposite;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Liste c1 = new Cellule(1, new Cellule(4,new Cellule(12, new Vide())));
		Liste c2 = new Vide();
		
		// Test for longueur()
		System.out.println(c2.size());
		System.out.println(c1.size());
		
		// Test for find()
		System.out.println(c1.find(12));
		System.out.println(c1.find(0));
		System.out.println(c2.find(3));
		
		//Test for max()
		System.out.println(c1.max());
		System.out.println(c2.max());
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.isEmpty());
		System.out.println(c2.isEmpty());
	}

}
