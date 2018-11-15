package ex02;

public class Goods {
	
	private String name;
	private int price;
	private int count;

	public Goods(String name) {
		this(name, 0);
		//this.name = name;
	}
	
	public Goods(int price) {
		this("", price);
	}
	
	public Goods() {
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		plusCount();
	}
	
	public void plusCount() {
		count = count+1;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int calcDiscountPrice(float discountRate) {
		int discountPrice = price - (int)(price * discountRate);
		return discountPrice;
	}
	
	public void showInfo() {
		System.out.println("상품: " + name + "   가격: " + price);
	}	
}
