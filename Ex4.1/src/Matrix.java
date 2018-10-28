public class Matrix {

	/**
	 * @param args
	 */
	double m, n, o, p;
	
	public Matrix(double m, double n, double o, double p){
		this.m = m;
		this.n = n;
		this.o = o;
		this.p = p;
	}
	

	public static void printmatrix(Matrix x){
		System.out.println(x.toString());		
	}
	
	public Object applyOperator(Operator2 o){
		return o.execute(this);
	}
	
	public static void main(String[] args) {
		Matrix m = new Matrix(1,2,3,4);
		
		Operator2 alloperators[] = {
			new determinantOperator2(), 
			new traceOperator2(),
			new symmetryOperator2(), 
			new transposeOperator2()};
			for(Operator2 o : alloperators) {
				System.out.println("Ergebnis " + o.getClass().toString());
				System.out.println(m.applyOperator(o).toString());
				}
	}

}
