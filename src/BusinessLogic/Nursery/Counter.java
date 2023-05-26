package BusinessLogic.Nursery;

public class Counter{
	private static int countAnimals = 0;
	
	public Counter() {
	}
	
	public static int getCountAnimals() {
		return countAnimals;
	}
	
	public static void setCountAnimals(int countAnimals) {
		Counter.countAnimals = countAnimals;
	}
	
}
