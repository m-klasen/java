
public class Modul {

	/**
	 * @param args
	 */
	private String name;
	private java.util.ArrayList<Student> hoerer = new java.util.ArrayList<>();
	
	public boolean bearbeiteAnmeldung(Student s){
		if (hoerer.size() == 100)
			return false;
		else
			hoerer.add(s);
			return true;
	}
	
	
	public Modul(String name){
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		
	}

}
