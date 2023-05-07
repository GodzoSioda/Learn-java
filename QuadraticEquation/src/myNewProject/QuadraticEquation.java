package myNewProject;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		// the quadratic equation:
		
        double d, x1, x2, z1, z2;
		double a = 3;
		double b = 2.5;
		double c = -0.5;
		   d=Math.sqrt((b*b) - 4*a*c);
		System.out.println("D = " +d);
			  x1 = (-b+d)/(2*a);
			  x2 = (-b-d)/(2*a);
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		      z1 = (a*(x1*x1))+(b*x1)+c;
		      z2 = (a*(x2*x2))+(b*x2)+c;
		System.out.println("z1 = " +z1);
		System.out.println("z2 = " +z2);
	}

}
