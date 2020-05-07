package ativ8;


public class Box<S,T> {

	private S item1;
	private T item2;
	
	public S getItem1() {
		return item1;
	}
	public void setItem1(S item1) {
		this.item1 = item1;
	}
	public T getItem2() {
		return item2;
	}
	public void setItem2(T item2) {
		this.item2 = item2;
	}
	
	public Box() {
		
	}
	
	public Box(S item1, T item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public void imprimeBox () {
		System.out.println(this.item1 + " / " + this.item2);
	}
	public void alteraItem1( S item) {
		this.item1 = item;
		
	}
	public void alteraItem2( T item) {
		this.item2 = item;
	}
}
