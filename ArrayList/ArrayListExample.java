import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList numbers = new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add("İstanbul");
		System.out.println(numbers.size());
		System.out.println(numbers.get(2));
		numbers.set(2, "Balıkesir");
		System.out.println(numbers.get(2));
		numbers.remove(1);
		System.out.println(numbers.get(1));
		
		for(Object i: numbers) {
			System.out.println(i);
		}
		
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("İstanbul");
		cities.add("Ankara");
		cities.add("İzmir");
		cities.remove("İzmir");
		Collections.sort(cities);
		
		for(String city: cities) {
			System.out.println(city);
		}
	}

}
