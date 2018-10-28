
public class Student {

	/**
	 * @param args
	 */
	
	private String Vorname;
	private String Nachname;
	private int Matrikel;
	private int Semest;
	
	public String getVorname(){
		return Vorname;
	}
	
	public String getNachname(){
		return Nachname;
	}
	
	public int getMatrikel(){
		return Matrikel;
	}
	
	public int getSemester(){
		return Semest;
	}
	
	public Student(String Vorname, String Nachname, int Matrikel, int Semest){
		this.Vorname = Vorname;
		this.Nachname = Nachname;
		this.Matrikel = Matrikel;
		this.Semest = Semest;		
	}
	
	void anmelden(Modul m){
		
		System.out.println(this.getVorname()+ this.getNachname() + "Ich wurde " + m.bearbeiteAnmeldung(this) + "Zugelassen");
	}


}
