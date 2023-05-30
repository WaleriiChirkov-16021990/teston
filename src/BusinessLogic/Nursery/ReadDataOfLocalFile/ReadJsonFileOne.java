package BusinessLogic.Nursery.ReadDataOfLocalFile;

import Models.Abstract.Animals.HumanFriend;
import Models.Animals.Type;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReadJsonFileOne <T extends HumanFriend> {
	private Map<Type, Map<T, ArrayList<T>>> allAnimals;
	private JSONObject jsonObject;
	
	public ReadJsonFileOne(Map<Type, Map<T, ArrayList<T>>> allAnimals) {
		this.allAnimals = allAnimals;
	}
	public ReadJsonFileOne() {
		this.allAnimals = new HashMap<>();
	}
	
	public void readFile() {
		try {
			this.jsonObject = (JSONObject) readJsonSimpleDemo("src\\DataBases\\LocalFiles\\DataNurseryOne.json");
		} catch (Exception e) {
			throw new RuntimeException("Отсутствует локальная база!",e.fillInStackTrace());
		}
		this.allAnimals = (Map<Type, Map<T, ArrayList<T>>>) jsonObject;
		ArrayList<T> arrayListCat = new ArrayList<>();
		ArrayList<T> arrayListDog = new ArrayList<>();
		ArrayList<T> arrayListHamster = new ArrayList<>();
		HashMap<String,HashMap<String,ArrayList<T>>> hashMap = new HashMap<>();
		HashMap<String, ArrayList<T>> animaPet = new HashMap<>();
		HashMap<String, ArrayList<T>> animaPack = new HashMap<>();
		arrayListCat = allAnimals.get(Type.Pet.toString()).get("Cat");
		arrayListDog = allAnimals.get(Type.Pet.toString()).get("Dog");
		arrayListHamster = allAnimals.get(Type.Pet.toString()).get("Hamster");
		animaPet.put("Cat",arrayListCat);
		animaPet.put("Dog",arrayListDog);
		animaPet.put("Hamster",arrayListHamster);
		hashMap.put("Pet",animaPet);
	}
	
//	public void writeJsonSimpleDemo(String filename) throws Exception {
//		JSONObject sampleObject = new JSONObject();
//		sampleObject.put("name", "Stackabuser");
//		sampleObject.put(Type.PackAnimal, 35);
//
//		JSONArray messages = new JSONArray();
//		messages.add("Hey!");
//		messages.add("What's up?!");
//
//		sampleObject.put("messages", messages);
//		Files.write(Paths.get(filename), sampleObject.toJSONString().getBytes());
//	}
	
	
	public JSONObject getJsonObject() {
		return jsonObject;
	}
	
	public void setJsonObject(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}
	
	private Object readJsonSimpleDemo(String s) throws Exception{
		FileReader reader = new FileReader(s);
		JSONParser jsonParser = new JSONParser();
		return jsonParser.parse(reader);
	}
	
	public Map<Type, Map<T, ArrayList<T>>> getAllAnimals() {
		return allAnimals;
	}
	
	public void setAllAnimals(Map<Type, Map<T, ArrayList<T>>> allAnimals) {
		this.allAnimals = allAnimals;
	}
}
