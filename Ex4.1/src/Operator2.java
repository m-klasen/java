
public interface Operator2 {

	public Object execute(Matrix matrix2d);
	
	}

class determinantOperator2 implements Operator2 {
	public Object execute(Matrix A){
		double determ;
		
		determ = A.m * A.p - A.o * A.n;

		return determ;
	}
}

class traceOperator2 implements Operator2 {
	public Object execute(Matrix B){
		double t;
		
		t = B.m + B.p;
		return t;
	}
}

class symmetryOperator2 implements Operator2 {
	public Object execute(Matrix A){
		if (A.o == A.n){
			return "Die Matrix ist symmetrisch";
		}
		else {
			return "Die Matrix ist nicht symmetrisch";
		}
	}
}

class transposeOperator2 implements Operator2 {
	public Object execute(Matrix A){
		Matrix temp = new Matrix(A.m,A.n,A.o,A.p);
		temp.m = A.m;
		temp.p = A.p;
		temp.o = A.n;
		temp.n = A.o;
		
		return temp;
	}
}




