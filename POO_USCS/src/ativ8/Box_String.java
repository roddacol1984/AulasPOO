package ativ8;

public class Box_String {

	private String item1;
	private String item2;

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public Box_String() {

	}

	public Box_String(String item1, String item2) {
		this.item1 = item1;
		this.item2 = item2;
	}

	public void ImprimeBoxString() {
		System.out.println(this.item1 + " / " + this.item2);
	}

	public void AlteraItem1(String item) {
		this.item1 = item;
	}

	public void AlteraItem2(String item) {
		this.item2 = item;
	}
}
