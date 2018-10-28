import java.util.Random;

public class Bank {
	
	double rucklage;
	
	java.util.ArrayList<Konto> bank = new java.util.ArrayList<>();
	java.util.ArrayList<Double> Investment = new java.util.ArrayList<>();
	
	public Bank(double rucklage){
		this.rucklage = rucklage;
	}
			
	void neuesKonto(String n, int p, double s){
		Konto x = new Konto(n,p,s);
		bank.add(x);
		
	}
	
	void kontoauflösen(int nmr){
		for (int i=0;i < bank.size() ; i++){
			if (nmr == bank.get(i).Kontonummer){
				this.bank.remove(i);
			}
		}
	}
	
	void transfer(int nmr,Bank x){
		for (int i=0;i < bank.size() ; i++){
			if (nmr == bank.get(i).Kontonummer){
				x.neuesKonto(this.bank.get(i).Besitzer,this.bank.get(i).Kontonummer,this.bank.get(i).Kontostand);
				this.bank.remove(i);
			}
		}
	}
	
	void invest(int x){
		double gelder=0;
		double investment=0;
		double curr= rucklage;						//Max Rücklage in Hilfvariable um später mit max. investment vergleichen zu können
		for (int i=0; i < bank.size() ; i++){
			gelder = bank.get(i).Kontostand;		// Geld jedes einzelnen Bank-Kontos auslesen
			
			if (curr/2>rucklage-gelder){			// Wenn Konto mehr als 50% der rücklagen hat.	
				investment += rucklage/2;
				rucklage -= rucklage/2;
			}
			else if (curr/2<rucklage-gelder){		// Wenn Konto weniger als 50% der rücklagen hat.
				rucklage -= gelder;
				investment += gelder;
			} 
		}
		
		if (investment==0){
			Investment.add(investment);
		}
		else{
			for (int i=0; i<x; i++){
				Investment.add(investment);
				Random rn = new Random();
				int percent = rn.nextInt(50 + 1) + 70;
				investment *= ((double)percent/100);
			}
		}
	}
}

