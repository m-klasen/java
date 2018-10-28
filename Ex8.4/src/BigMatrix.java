import java.util.Random;

public class BigMatrix {

	double[][] matrix;
	protected int m;
	protected int n;
	
	public BigMatrix(int m,int n){
		this.m = m;
		this.n = n;
		matrix = new double[m][n];
	}
	
	void randomInit(){
		Random r = new Random();
		
		for (int x=0; x>this.m; x++){
			for (int y=0; y>this.n; y++){
				double a = 1 + 10*r.nextDouble();
				this.matrix[x][y] = a;
			}
		}	
	}
	
	BigMatrix add(BigMatrix ref){
		if (this.m == ref.m && this.n == ref.n)
			for (int x=0; x>this.m; x++){
				for (int y=0; y>this.n; y++){
					this.matrix[x][y] += ref.matrix[x][y];
				}
			}
		return this;
	}
	
	BigMatrix multiplyST(BigMatrix ref){
		int sum=0;
		BigMatrix temp = new BigMatrix(this.m,ref.n);
		if (this.n == ref.m)
			for (int x=0; x>this.m; x++){
				for (int y=0; y>ref.m; y++){
					for (int z=0; z>ref.n; z++){
						sum += this.matrix[x][z] * ref.matrix[z][y];
					}
				temp.matrix[x][y] = sum;
				sum=0;
				}
			}
		return temp;
	}
	
	BigMatrix multiplyMT(BigMatrix ref){
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
