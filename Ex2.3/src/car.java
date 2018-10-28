
public class car {	
	/**
	 * @param args
	 */
	
	private String licensePlate;
	private String owner;
	private String adress;
	
	public car(String license, String own, String adr){
		licensePlate = license;
		owner = own;
		adress = adr;
	}
	
	
	public String getLicensePlate() {
		return licensePlate;
	}
	
	public String getOwner(){
		return owner;
	}
	
	public String getAdress() {
		return adress;
	}
	
	
	
	public static void main(String[] args) {
	
	}
}
