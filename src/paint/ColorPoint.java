package paint;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		//부모의 생성자를 명시하지 않으면 부모의 기본생성자가 자동으로 들어간다.
		//super();
		System.out.println("ColorPoint() called");
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
//		setX(x);
//		setY(y);
		this.color = color;
		System.out.println("ColorPoint(int , int, String) called");
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		System.out.println(
			"점[x=" + getX() + 
			", y=" + getY() + 
			", color=" + color +
			"]을 그렸습니다.");
	}
	
	
}