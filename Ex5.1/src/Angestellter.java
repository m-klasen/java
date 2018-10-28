
class Angestellter {
	protected String vorname;
	protected String nachname;
	protected int alter;
	protected int gehalt;
	
	public int newAlter(int alter){
		return this.alter = alter + 1;
	}
	
	public int newgehalt(int gehalt, int bonus){
		return this.gehalt = gehalt + bonus;
	}
	
	public Angestellter(String Vorname, String Nachname, int alter, int gehalt){
		this.vorname = Vorname;
		this.nachname = Nachname;
		this.alter = alter;
		this.gehalt = gehalt;
	}
}
