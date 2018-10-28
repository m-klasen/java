
interface Food {
	public String getMeal();
}

class Cauliflower implements Food {
	public String getMeal() {
		return "Blumenkohl an Gorgonzolasoße";
	}
}
	
class Spaghetti implements Food {
	public String getMeal() {
		return "Spaghetti Bologneser Art";
	}
}

class Price implements Food {
	public String getMeal(){
		return "Spaghetti 8€, Cauliflower 9,50€";
	}
}