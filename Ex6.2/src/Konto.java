
public class Konto {
	String Besitzer;
	int Kontonummer;
	protected double Kontostand;
	
	static java.util.ArrayList<Object> protocol = new java.util.ArrayList<>();
	
	public Konto(String Besitzer, int Kontonummer, double Kontostand){
		this.Besitzer = Besitzer;
		this.Kontonummer = Kontonummer;
		this.Kontostand = Kontostand;
		protocol.add(this.Kontostand);
		
	}
	
	void einzahlen(double Betrag){
		this.Kontostand += Betrag;
		protocol.add(this.Kontostand);
	}
	
	void auszahlen(double Betrag){
		if (this.Kontostand - Betrag < 0){
			System.out.println("Nein");
		}
		else{
			this.Kontostand -= Betrag;
			protocol.add(this.Kontostand);
		}
	}
	
	static void kontoauszug(){
		System.out.println(protocol.toString());
		protocol.clear();
		
	}
	
	public String toString(){
		return Besitzer + " - " + Kontostand;
	}
	
	public static void main(String[] args){
		Konto konto = new Konto("Test", 12435, 1234.5);
		konto.einzahlen(500);
		konto.auszahlen(400);
		kontoauszug();
		System.out.println(protocol.toString());
	}
}
