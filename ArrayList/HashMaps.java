import java.util.HashMap;

public class HashMaps {
	public static void main(String[] args) {
		HashMap<String,String> dictionary = new HashMap<String, String>();
		dictionary.put("table", "masa");
		dictionary.put("pencil", "kalem");
		dictionary.put("mouse", "fare");
		dictionary.remove("mouse");
		
		for(String str: dictionary.keySet()) {
			System.out.println(str+ " value: "+ dictionary.get(str));
		}
		System.out.println(dictionary.size());
	}
}
