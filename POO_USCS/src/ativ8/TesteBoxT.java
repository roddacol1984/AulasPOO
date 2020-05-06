package ativ8;

public class TesteBoxT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<Integer> a = new Box<Integer>(20,40);
		a.imprimeBox();
		a.alteraItem1(50);
		a.alteraItem2(40);
		a.imprimeBox();
		
		Box<String> b = new Box<String>("Rodrigo", "Aimée");
		b.imprimeBox();
		b.alteraItem1("Aimée");
		b.alteraItem2("Rodrigo");
		b.imprimeBox();
		
		
		
		
	}

}
