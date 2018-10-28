
public class Clothing extends Product {
	int groesse;
	String material;
	
	public Clothing(String name, String desc, double price, String mat, int gros) {
		super(name, desc, price);
		this.material = mat;
		this.groesse = gros;
	}
	
	public String toString() {
		return name + " - " + description + " - " + price + " EUR" +" - aus " + material + " - Größe: "+ groesse;
	}
}
