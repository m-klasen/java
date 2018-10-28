import java.util.Arrays;


public interface Operator {

	public Object execute(Matrix2D matrix2d);
	
	}

class determinantOperator implements Operator {
	public Object execute(Matrix2D A){
		double determ;
		
		determ = A.matrix[0][0] * A.matrix[1][1] - A.matrix[0][1] * A.matrix[1][0];
		
		return determ;
	}
}

class traceOperator implements Operator {
	public Object execute(Matrix2D B){
		double t;
		
		t = B.matrix[0][0] + B.matrix[1][1];
		
		return t;
	}
}

class symmetryOperator implements Operator {
	public Object execute(Matrix2D A){
		if (A.matrix[0][1] == A.matrix[1][0]){
			return "Die Matrix ist symmetrisch";
		}
		else {
			return "Die Matrix ist nicht symmetrisch";
		}
	}
}

class transposeOperator implements Operator {
	public Object execute(Matrix2D A){
		Matrix2D temp = new Matrix2D(A.m,A.n);
		temp.matrix[0][0] = A.matrix[0][0];
		temp.matrix[1][1] = A.matrix[1][1];
		temp.matrix[0][1] = A.matrix[1][0];
		temp.matrix[1][0] = A.matrix[0][1];
		
		return Arrays.deepToString(temp.matrix);
	}
}




