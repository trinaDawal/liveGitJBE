package ex.inheritance.dynamicpoly;
//IP : draw() of Shape, Rectangle, Triangle
public class AppDynamicPoly {
	public static void main(String[] args) {
		DrawingTool drawingTool = null;
//		dynamic polymprphism
		double randomValue = Math.random();
		if(randomValue > 0.5)
		{
		drawingTool = new Pencil();
		}
		else {
			drawingTool = new Pen();
		}
		drawingTool.draw();
		
		DrawingTool drawingTool2 = new DrawingTool();
		drawingTool2.draw();
	}
}

//class DrawingTool{
//	void draw() {
//		System.out.println("drawing on pen or paper");
//	}
//}
//
//class Pen extends DrawingTool {
//	void draw() {
//		System.out.println("non erasable drawing");
//	}
//}
//
//class Pencil extends DrawingTool {
//	void draw() {
//		System.out.println("erasable drawing");
//	}
//}