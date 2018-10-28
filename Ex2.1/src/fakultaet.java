
public class fakultaet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("n: ");
		long n = sc.nextLong();
		System.out.print("k: ");
		long k = sc.nextLong();
		System.out.println("n! = " + fakul(n));
		System.out.println("N über K = " + binom(n,k));
		System.out.println("N über k * k! = " + lotto(n,k));
	}
	
	private static long fakul(long n){
		if (n==0 || n==1)
			return 1;
		else
			return n*fakul(n-1);
	}

	private static long binom(long n,long k){
		if (k < 0)
			return 0;
		else if (n < k)
			return 0;
		else
			return fakul(n)/(fakul(k)*fakul(n-k));	
	}
	
	private static long lotto(long n, long k){
		if (k < 0)
			return 0;
		else if (n < k)
			return 0;
		else
			return (fakul(n)/(fakul(k)*fakul(n-k)))*fakul(k);
	
	}
}
