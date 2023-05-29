package Controllers.Consoles;

import BusinessLogic.Nursery.ReadDataOfLocalFile.ReadJsonFileOne;
import Models.Abstract.Animals.HumanFriend;
import Models.Nursery.NurseryOne.NurseryOne;
import View.Consoles.ConsolePrinterOne;
import View.UiConsole.UI;

import java.util.Scanner;

public class ConsoleControllerOne {
	private NurseryOne<HumanFriend> nurseryOne;
	private ReadJsonFileOne<HumanFriend> readJsonFileOne;
	
	public ConsoleControllerOne(NurseryOne<HumanFriend> nurseryOne, ReadJsonFileOne<HumanFriend> readJsonFileOne) {
		this.nurseryOne = nurseryOne;
		this.readJsonFileOne = readJsonFileOne;
	}
	
	public ConsoleControllerOne() {
		this.nurseryOne = new NurseryOne<>();
		this.readJsonFileOne = new ReadJsonFileOne<>();
	}
	
	public void runApplication() {
	readJsonFileOne.readFile();
	nurseryOne.setAllAnimals(readJsonFileOne.getAllAnimals());
	Scanner scanner = new Scanner(System.in);
	String inputUser = null;
	boolean flag = true;
		while (flag) {
			ConsolePrinterOne.print(UI.firstMenu);
			inputUser = scanner.nextLine().strip();
			if (inputUser.equals("1")) {
			
			} else if (inputUser.equals("2")) {
			
			} else if (inputUser.equals("3")) {
			
			} else if (inputUser.equals("4")) {
			
			} else if (inputUser.equals("5")) {
			
			} else if (inputUser.equals("6")) {
			
			} else if (inputUser.equals("7")) {
			
			} else {
				ConsolePrinterOne.print("Не известный выбор, всего предусмотрено 7 позиций развития событий.");
			}
		}
	}
	
	public NurseryOne<HumanFriend> getNurseryOne() {
		return nurseryOne;
	}
	
	public void setNurseryOne(NurseryOne<HumanFriend> nurseryOne) {
		this.nurseryOne = nurseryOne;
	}
	
	public ReadJsonFileOne<HumanFriend> getReadJsonFileOne() {
		return readJsonFileOne;
	}
	
	public void setReadJsonFileOne(ReadJsonFileOne<HumanFriend> readJsonFileOne) {
		this.readJsonFileOne = readJsonFileOne;
	}
}
