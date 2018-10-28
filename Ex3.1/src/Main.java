
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sheep a = new Sheep("123", new Fur(10));		
		Sheep b = (Sheep) a.shallowclone();
		
		System.out.println("" + a.toString());
		System.out.println("" + b.toString());
		
		b.name = "321";
		b.shear();
		
		System.out.println("" + a.toString());
		System.out.println("" + b.toString());
				
		Sheep c = (Sheep) a.deepclone();
		
		c.name = "231";
		
		System.out.println("" + a.toString());
		System.out.println("" + c.toString());
		
		if (a.equals(b)){
			System.out.println("A=B");
		}
		
	}

}
