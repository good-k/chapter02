package ex01;

public class Goods {
	private String name;
	private int price;
	
	public Goods() {
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Goods(String name) {
		this(name, 0);
	}
	
	public Goods(int price) {
		this("", price);
	}
	
	
	public void setName(String n) {
		name = n ;
	}
	
	public void setPrice(int p) {
		price = p ;
	}
	
	public void showInfo() {
		System.out.println("상품: " + name + "   가격: " + price);
	}
}
