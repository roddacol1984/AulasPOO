package ativ8;

public class TesteBoxT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<String, Integer> a = new Box<String, Integer>("Rodrigo", 40);
		a.imprimeBox();
		a.alteraItem1("Aimée");
		a.alteraItem2(40);
		a.imprimeBox();

		Box<Integer, String> b = new Box<Integer, String>(45, "Aimée");
		b.imprimeBox();
		b.alteraItem1(334);
		b.alteraItem2("Rodrigo");
		b.imprimeBox();

	}

}
