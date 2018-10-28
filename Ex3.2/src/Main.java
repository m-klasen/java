
public class Main {

	public static void main(String[] args) {
	 Food food;
	 food = new Cauliflower();
	 System.out.println(food.getMeal());
	 food = new Spaghetti();
	 System.out.println(food.getMeal());
	 food = new Price();
	 System.out.println(food.getMeal());
	 
	 Student student = new Student();
	 
	 Cauliflower essen1 = new Cauliflower();
	 student.eat(essen1);
	 
	 Spaghetti essen2 = new Spaghetti();
	 student.eat(essen2);
	 
	 Food essen = new Cauliflower();
	 student.eat(essen);
	}

}
