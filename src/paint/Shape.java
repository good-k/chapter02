package paint;

public abstract class Shape implements Drawable {
	private String fillColor;
	private String lineColor;
	
	public Shape() {
		System.out.println("Shape() called");
	}
	
	public Shape(String fillColor, String lineColor) {
		System.out.println("Shape(String, String) called");
	}
	
	
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
}
