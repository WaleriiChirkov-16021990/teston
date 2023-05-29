import BusinessLogic.Nursery.ReadDataOfLocalFile.ReadJsonFileOne;
import BusinessLogic.Nursery.ShowAllAnimals.ShowAllAnimalsOne;
import Models.Abstract.Animals.HumanFriend;
import Models.Animals.Type;
import org.json.simple.JSONObject;

import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello world!");
		ReadJsonFileOne<HumanFriend> humanFriendReadJsonFileOne = new ReadJsonFileOne<HumanFriend>();
		humanFriendReadJsonFileOne.readFile();
		
		new ShowAllAnimalsOne<HumanFriend>(humanFriendReadJsonFileOne.getAllAnimals());
//		humanFriendReadJsonFileOne.writeJsonSimpleDemo("Clouse.json");
//		System.out.println(humanFriendReadJsonFileOne.getAllAnimals().;
//		for (Type r :
//				Type.values()) {
//			Set<HumanFriend> animals = humanFriendReadJsonFileOne.getAllAnimals().get(r.toString()).keySet();
//			for (HumanFriend s:
//			     animals) {
//			for (int i = 0; i < animals.size(); i++) {
//				if (humanFriendReadJsonFileOne.getAllAnimals().get(r.toString()).get(animals.toArray()[i]).get(i).getName().equals("Morris")) {
//					System.out.println(humanFriendReadJsonFileOne.getAllAnimals().get(r.toString()).get(animals.toArray()[i]));
//					System.out.println();
//				}
				
//			}

//			}
//			System.out.println();
		}
	}
//}
