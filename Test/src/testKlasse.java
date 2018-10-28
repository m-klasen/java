
public class testKlasse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Modul d = new Modul("Test");
		Modul b = new Modul("dhsj");
		Student a = new Student("Max", "abc", 12425, 12323);
		d.bearbeiteAnmeldung(a);
		b.bearbeiteAnmeldung(a);
		
	}

}
