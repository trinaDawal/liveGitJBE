package ex.basics;

public class ColorChooser {
	public static void main(String[] args) {
		String colors[] = { "red", "green", "blue" };
		for (int i = 0; i < 3; i++) {
			double random = Math.random();
			if (random > 0.75) {
				System.out.println(colors[0]);
			} else if (random > 0.5) {
				System.out.println(colors[1]);
			} else {
				System.out.println(colors[2]);
			}
		}
	}
}
