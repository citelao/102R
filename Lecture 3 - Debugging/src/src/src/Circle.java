package src;

public class Circle {

	double radius;
	
	public Circle(double x, double y, double radius) {
		this.radius = radius;
	}
	
	public boolean inCircle(double x, double y) {
		// The equation for a circle is
		// x^2 + y^2 = r^2
		// so a point in the circle is <= that number
		
		boolean rtn = (Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(this.radius, 2));
		
		return rtn;
	}
	
	public static void main(String[] args) {		
		double[] testPtXs = {
				1, 0, 5, 20, 3.4, 2.05, 0.15
		};
		
		double[] testPtYs = {
				0, 1, 3, 40, 0.2, 5, 1
		};
		
		// This tests correctly
		Circle testCircle1 = new Circle(0, 0, 4);
		
		System.out.println("Testing testCircle1");
		for (int i = 0; i < testPtYs.length; i++) {
			double cX = testPtXs[i];
			double cY = testPtYs[i];
			
			if (testCircle1.inCircle(cX, cY)) {
				System.out.println("(" + cX + ", " + cY + ") is in testCircle1");
			} else {
				System.out.println("(" + cX + ", " + cY + ") is NOT in testCircle1");
			}
		}
		
		// This does not
		Circle testCircle2 = new Circle(4, 2, 4);
		
		System.out.println("----");
		System.out.println("Testing testCircle2");
		for (int i = 0; i < testPtYs.length; i++) {
			double cX = testPtXs[i];
			double cY = testPtYs[i];
			
			if (testCircle2.inCircle(cX, cY)) {
				System.out.println("(" + cX + ", " + cY + ") is in testCircle2");
			} else {
				System.out.println("(" + cX + ", " + cY + ") is NOT in testCircle2");
			}
		}
	}

}
