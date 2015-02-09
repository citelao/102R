package src;

public class StepCounted {

	/* http://stackoverflow.com/questions/891031/is-there-a-method-that-calculates-a-factorial-in-java */
	public static long factorial(long n) {
        long fact = 1; // this  will be the result
        for (long i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
	
	public static double stirling(int n) {
		double rtn = (double) (Math.sqrt(2 * Math.PI * n) * n * Math.exp(-n));
		return rtn;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 400; i++) {
			System.out.println("i: " + i + " factorial: " + factorial(i) + "; stirling: " + stirling(i));
		}

	}
}
