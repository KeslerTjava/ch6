public class Gauss {
	public static void main (String [] args) {
		double x = 2;
		System.out.println("e^" + -x*x + " is:     " + Math.exp(-x*x));
		System.out.println("e^" + -x*x + "estimate:   " + gauss(x,1000));
	}
	public static double gauss(double x, int n) {
		double ans = 1;
		double old = 1;
		for (int i = 1; i < n; i++) {
			double newt = old * (-x*x/i);
			ans += newt;
			old = newt;
		} return ans;
}
}
