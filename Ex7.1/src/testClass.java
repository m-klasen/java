
public class testClass {

	public static void main(String[] args) {
		DoubleList liste = new DoubleList();
		liste.add(4);
		liste.add(5.5);
		liste.add(7);
		liste.insertFirst(1);
		liste.insertFirst(2);
		//liste.remove(3);
		//liste.remove(0);
		//liste.remove(5);
		System.out.println(liste.get(0));
		liste.printList();
	}

}
