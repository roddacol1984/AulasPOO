package ativ8;


public class Box<T> {

	private T item1;
	private T item2;
	
	public T getItem1() {
		return item1;
	}
	public void setItem1(T item1) {
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
	
	public Box(T item1, T item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public void imprimeBox () {
		System.out.println(this.item1 + " / " + this.item2);
	}
	public void alteraItem1( T item) {
		this.item1 = item;
		
	}
	public void alteraItem2( T item) {
		this.item2 = item;
	}
}
