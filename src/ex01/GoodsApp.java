package ex01;

public class GoodsApp {
	public static int a;
	
	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(500000);
		
		camera.showInfo();
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(3000);
		cup.showInfo();
	}
}
