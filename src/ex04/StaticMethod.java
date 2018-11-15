package ex04;

public class StaticMethod {
	private int n;
	private static int m;
	
	public void f1() {
		n = 10;
		// 원래 클래스 이름으로 접근해야 한다.
		// 하지만, 같은 클래스 안에서는 생략가능
		// StaticMethod.m = 10;
		m = 10;
		
	}
	
	public static void f2() {
		// 오류: static에서는 Instance 접근할 수 없다.
		// n = 10;
		
		m = 10;
	}
	
	public void f3() {
		f1();
		// StaticMethod.f2();
		f2();
	}
	
	public static void f4() {
		// 오류
		// f1();
		f2();
	}
}
