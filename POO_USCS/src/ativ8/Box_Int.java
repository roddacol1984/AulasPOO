package ativ8;

public class Box_Int {

	private Integer item1;
	private Integer item2;

	public Integer getItem1() {
		return item1;
	}

	public void setItem1(Integer item1) {
		this.item1 = item1;
	}

	public Integer getItem2() {
		return item2;
	}

	public void setItem2(Integer item2) {
		this.item2 = item2;
	}

	public Box_Int() {
		
	}
	public Box_Int(Integer item1, Integer item2) {
		this.item1 = item1;
		this.item2 = item2;
	}

	public void ImprimeBoxInt(){
		System.out.println(this.item1 + " / " + this.item2);
	}
	public void AlteraItem1( Integer item){
		this.item1 = item;
	}
	public void AlteraItem2( Integer item){
		this.item2 = item;
		
	}
}
