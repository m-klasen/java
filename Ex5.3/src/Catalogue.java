public class Catalogue {	
	
	static java.util.HashSet<Product> Catalogue = new java.util.HashSet<Product>();
	 
	public static void main(String[] args) {

		Product p = new Product("Papier","DINA4", 2.52);
		Clothing c = new Clothing("Hemd", "Herren-Hemd", 33.61, "Baumwolle", 48);
		Catalogue.add(p);
		Catalogue.add(c);
		
		p.getPriceWithTax();
		c.getPriceWithTax();
		System.out.println(p.toString()+ "\t Mit Steuern: " + p.getPriceWithTax());
		System.out.println(c.toString()+ "\t Mit Steuern: " + c.getPriceWithTax());
		
		
		printMe();
	}
	
	static void printMe(){
		System.out.println(Catalogue.toString());
		
	}

}
