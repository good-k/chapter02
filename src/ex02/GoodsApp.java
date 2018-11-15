package ex02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods("니콘", 3000000);
		System.out.println(camera.getCount());
		
		Goods cup = new Goods("컵", 5000);
		System.out.println(cup.getCount());
		
		Goods computer = new Goods("LG그램");
		System.out.println(computer.getCount());
			
		int discountCupPrice = cup.calcDiscountPrice(0.3f);
		System.out.println(discountCupPrice);
		
		
	}

}
