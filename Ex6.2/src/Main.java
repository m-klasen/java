
public class Main {

	public static void main(String[] args){
		Bank bank1 = new Bank(1000000);
		Bank bank2 = new Bank(7000000);
		Bank bank3 = new Bank(20000000);
		
		bank1.neuesKonto("Test1", 1243, 8000000);
		bank2.neuesKonto("test2", 1456, 8000000);
		bank3.neuesKonto("test3", 3256, 8000000);
		bank1.invest(100);
		bank2.invest(100);
		bank3.invest(100);
		
		//Bank1
		System.out.println("Bank1: "+ bank1.Investment);	
		System.out.println("Nach 100 Investments: " + bank1.Investment.get(99));
		System.out.println("Verlust: " + (bank1.Investment.get(99)- bank1.Investment.get(0)));
		System.out.println("Verlust %: " + ((bank1.Investment.get(0) - bank1.Investment.get(99))/ bank1.Investment.get(0)));
		
		//Bank2
		System.out.println("Bank2: " + bank2.Investment);
		System.out.println("Nach 100 Investments: " + bank2.Investment.get(99));
		System.out.println("Verlust: " + (bank2.Investment.get(99)- bank2.Investment.get(0)));
		System.out.println("Verlust %: " + ((bank2.Investment.get(0) - bank2.Investment.get(99))/ bank2.Investment.get(0)));
		
		//Bank3
		System.out.println("Bank3: " + bank3.Investment);	
		System.out.println("Nach 100 Investments: " + bank3.Investment.get(99));
		System.out.println("Verlust: " + (bank3.Investment.get(99)- bank3.Investment.get(0)));
		System.out.println("Verlust %: " + ((bank3.Investment.get(0) - bank3.Investment.get(99))/ bank3.Investment.get(0)));
	
		bank1.transfer(1243, bank2);
		bank2.transfer(1456, bank3);
		
		System.out.println(bank1.bank);
		System.out.println(bank2.bank);
		System.out.println(bank3.bank);

	}

}
