package Models.Animals.Pet;

import Models.Abstract.Animals.Pet;
import Models.Animals.Type;
import View.ConsolePrinter;

import java.util.Date;

public class Hamster extends Pet {
	
	private int timeMaxRun;
	private int distanceRun;
	
	public Hamster(String whoIsHePlayingWith, int loves, String favoriteFood, String favoriteToy) {
		super(whoIsHePlayingWith, loves, favoriteFood, favoriteToy);
	}
	
	public Hamster(String name, Date birthDay, int energy, int weight, Type type, String whoIsHePlayingWith, int loves, String favoriteFood, String favoriteToy) {
		super(name, birthDay, energy, weight, type, whoIsHePlayingWith, loves, favoriteFood, favoriteToy);
	}
	
	public int getENERGY_СONSUMPTION() {
		return 5;
	}
	
	public int getWEIGHT_LOSS() {
		return 5;
	}
	
	public int getTimeMaxRun() {
		return timeMaxRun;
	}
	
	public void setTimeMaxRun(int timeMaxRun) {
		this.timeMaxRun = timeMaxRun;
	}
	
	public int getDistanceRun() {
		return distanceRun;
	}
	
	public void setDistanceRun(int distanceRun) {
		this.distanceRun = distanceRun;
	}
	
	@Override
	public void toPlay() {
		ConsolePrinter.print("Хомяк стоит и смотрит на тебя своими черными глазами");
	}
}
