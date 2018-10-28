public class myprogramm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		car car1 = 
				new car("BN-54", "Max", "De");
		car car2 =
				new car("BN-390", "Philipp", "Fr");
		TrafficOffice to1 = new TrafficOffice();
		to1.registerCar(car1);
		System.out.println("Car1: " + car1.getLicensePlate() + "" + car1.getAdress() + " " + car1.getOwner());
		System.out.println("Car2: " + car2.getLicensePlate() + "" + car2.getAdress() + " " + car2.getOwner());

	}

}
