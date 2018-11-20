package paint;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point(2, 5);
		draw(p1);
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		draw(p2);

		
		Point p3 = new ColorPoint(150, 200, "red");
//		p3.setX(150);
//		p3.setY(200);
//		((ColorPoint)p3).setColor("red");
		draw(p3);
		
		Shape s1 = new Rect(10, 20, 100, 200);
		draw(s1);
		
		Shape s2 = new Triangle();
		draw(s2);
		
		Shape s3 = new Circle();
		draw(s3);
		
		//Downcasting인 경우 명시적으로 캐스팅으로 해야 한다.
		Circle c = (Circle)s3;
		c.setRadius(10);
		//((Circle)s3).setRadius(10);
		
		
		//Upcasting인 암시적으로 캐스팅 한다.
		Shape s4 = c;
		s4.setFillColor("red");
	}

	private static void draw(Drawable drawable) {
		drawable.draw();
	}
	
//	private static void drawPoint(Point point) {
//		point.show();
//	}
//	private static void drawShape(Shape shape) {
//		shape.draw();
//	}
	
//	private static void drawRect(Rect rect) {
//		rect.draw();
//	}
//	
//	private static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
	
}