public class main {
	public static void main(String [] args){
		
		
//		Angestellter Manni = new Angestellter("Manfred","Schmidt",56,2300);
//		Manni.printProfile();
//		Manni.Altern();
//		Manni.gehaltErhöhen(50);
//		Manni.printProfile();
//		
//		Praktikant Patty = new Praktikant("Patrick", "Star", 23);
//		Patty.printProfile();
//		Patty.Altern();
//		Patty.printProfile();	
//		Patty.gehaltErhöhen(60);
//		Patty.printProfile();
		
//		Auto auto1 = new Lastwagen();
//		System.out.println(auto1.reifen); // Ausgabe 1)
//		System.out.println(((Lastwagen) auto1).reifen);  // Ausgabe 2)
//		System.out.println(auto1.getReifen()); // Ausgabe 3)
//		System.out.println(((Lastwagen) auto1).getReifen()); // Ausgabe 4)
		
//		
//		Product Papier = new Product("Papier", "A4", 2.52);
//		System.out.println(Papier.toString());
//		
//		Clothing Hemd = new Clothing("Hemd", "Herren-Hemd", 33.61, 48, "Baumwolle");
//		System.out.println(Hemd.toString());
//		
//		Catalogue Otto = new Catalogue();
//		Otto.newProduct(Papier);
//		Otto.newProduct(Hemd);
//		Otto.printMe();
//		Otto.printMe();
		
		
//		//Aufgabe 4b
//		Component h1 = new PassGate();		//Eingänge
//		Component h2 = new PassGate();
//		
//		Component a1 = new AndGate();		//Gates
//		Component a2 = new AndGate();
//		Component n = new NotGate();
//		Component o = new OrGate();
//		
//		h1.connectTo(a1);					//h1+h2 -> a1 ->n ->a2
//		h2.connectTo(a1);
//		a1.connectTo(n);
//		n.connectTo(a2);
//		
//		h1.connectTo(o);					//h1+h2 -> o -> a2
//		h2.connectTo(o);
//		o.connectTo(a2);
//		
//		Circuit c1 = new Circuit();			// a2 Ausgang
//		c1.exitgates.add(a2);
//		
//		h1.state = false;					// Eingänge initalisieren
//		h2.state = true;
//		
//		System.out.println(c1.simulate().get(0)); 	//a2 Ausgang konsole
		
		
		//Aufgabe 4c
		Component h1 = new PassGate();		//Eingänge
		Component h2 = new PassGate();
		Component time = new TimeGate();
		
		h1.state = true;					// Eingänge initalisieren
		h2.state = true;
		
		Component And = new AndGate();		// Gates initalisieren
		Component Or = new OrGate();
		Component Not = new NotGate();
		Component XOR = new XorGate();
		Component Nand = new NandGate();
		Component Nor = new NorGate();
		
		h1.connectTo(And);
		h2.connectTo(And);
		
		h1.connectTo(Or);
		h2.connectTo(Or);
		
		h1.connectTo(Not);
		
		h1.connectTo(XOR);
		h2.connectTo(XOR);
		
		h1.connectTo(Nand);
		h2.connectTo(Nand);
		
		h1.connectTo(Nor);
		h2.connectTo(Nor);
		
		Circuit Exit = new Circuit();
		
		Exit.exitgates.add(And);
		Exit.exitgates.add(Or);
		Exit.exitgates.add(Not);
		Exit.exitgates.add(XOR);
		Exit.exitgates.add(Nand);
		Exit.exitgates.add(Nor);
		Exit.exitgates.add(time);
		
		for(int Counter=0; Counter < Exit.exitgates.size(); Counter ++){
			System.out.println(Exit.simulate().get(Counter));
		}
		
		
	}

}