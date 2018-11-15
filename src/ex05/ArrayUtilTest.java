package ex05;

public class ArrayUtilTest {

	public static void main(String[] args) {
		//1.doubleToInt
		double[] d1 = {45.2, 53.6, 64.4};
		int[] a4 = ArrayUtil.doubleToInt(d1);
		for(int i = 0; i < a4.length; i++) {
			System.out.println(a4[i]);
		}
		
		System.out.println("======================");
		
		
		//2.intToDouble
		int[] a5 = {45, 53, 64};
		double[] d2 = ArrayUtil.intToDouble(a5);
		for(int i = 0; i < d2.length; i++) {
			System.out.println(d2[i]);
		}
		
		System.out.println("======================");
		
		//3.concat(int[] s1, int[] s2)
		int[] a1 = {10, 20, 30};
		int[] a2 = {100, 200, 300, 400};
		
		int[] a3 = ArrayUtil.concat(a1, a2);
		for(int i = 0; i < a3.length; i++) {
			System.out.println(a3[i]);
		}
	}
}
