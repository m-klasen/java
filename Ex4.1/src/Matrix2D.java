import java.util.Arrays;


public class Matrix2D {

	/**
	 * @param args
	 */
	double[][] matrix;
	int m;
	int n;
	
	public Matrix2D(int m, int n){
		this.m = m;
		this.n = n;
		matrix = new double[m][n];
	}
	
	public Matrix2D(double[][] matrix){
		m = matrix.length;
		n = matrix[0].length;
		this.matrix = new double[m][n];
		for (int i=0; i<m;i++){
			for (int j=0; j<n;j++){
				this.matrix[i][j] = matrix[i][j];
			}
		}
	}
	
	public static void printmatrix(double[][] x){
		System.out.println(Arrays.deepToString(x));		
	}
	
	public Object applyOperator(Operator o){
		return o.execute(this);
	}
	
	public static void main(String[] args) {
		double[][] d = { {1,2},{5,3}};
		Matrix2D m = new Matrix2D(d);
		
		Operator alloperators[] = {
			new determinantOperator(), 
			new traceOperator(),
			new symmetryOperator(), 
			new transposeOperator()};
			for(Operator o : alloperators) {
				System.out.println("Ergebnis " + o.getClass().toString());
				System.out.println(m.applyOperator(o).toString());
				}
		
		
		
	}

}
