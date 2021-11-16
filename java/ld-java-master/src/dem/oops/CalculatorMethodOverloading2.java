package dem.oops;

public class CalculatorMethodOverloading2 {
	void add(Point point1, Point point2) {
		int resultX = point1.x + point2.x;
		int resultY = point1.y + point2.y;
		System.out.println("X " +resultX + " Y " + resultY);
	}
	void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	void add(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println(result);
	}
	
	void add(float num1, float num2) {
		float result = num1 + num2;
		System.out.println(result);
	}
	
	void add(float num1, float num2, float num3) {
		float result = num1 + num2 + num3;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		CalculatorMethodOverloading2 simpleCalculator = new CalculatorMethodOverloading2();
//		create the first point
		Point point1 = new Point();
		point1.x = 5;
		point1.y = 10;
		
// create the second point
		Point point2 = new Point();
		point2.x = 25;
		point2.y = 30;
		
		simpleCalculator.add(point1, point2);
	}
}


class Point{
	int x;
	int y;
}