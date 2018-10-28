public class Complex {

	double real;
	double imag;
	
	
	public Complex(double r, double i){
		real = r;
		imag = i;
	}
	
	Complex add(Complex ref){		
		Complex x = new Complex(this.real + ref.real,this.imag + ref.imag);
		return x;
	}
	

	Complex multiply(Complex ref){
		Complex x = new Complex(this.real*ref.real-this.imag*ref.imag, this.imag*ref.real+this.real*ref.imag);
		return x;
	}
	
	double get_abs(){
		return Math.sqrt(this.real*this.real + this.imag*this.imag);
	}
	
	
	public static boolean diverges(Complex c, int maxiter){
		Complex z0 = new Complex(0,0);
		for (int i=0; i<maxiter;i++){
				z0 = z0.multiply(z0);
				z0 = z0.add(c);
			if(z0.get_abs()>1000) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		Complex z1 = new Complex(1,2);
		Complex z2 = new Complex(4,5);
		Complex z0 = new Complex(0,0);
		z0 = z1.add(z2);
		//z1.multiply(z2);
		System.out.println(z0.real);
		System.out.println(z0.imag);
		System.out.println(z2.get_abs());
		
	}

}
