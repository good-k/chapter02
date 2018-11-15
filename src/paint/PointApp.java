package paint;

public class PointApp {

	public static void main(String[] args) {

		Point p1 = new Point(2, 5);
		//System.out.println(p1.getX());
		//System.out.println(p1.getY());
		p1.show();
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		
		p2.show();
		p2.show(false);
	}
}
