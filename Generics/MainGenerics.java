import java.util.ArrayList;

public class MainGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Ankara");
		cities.add("İstanbul");
		//cities.add(1);
		MyList<String> list = new MyList<>();
		list.Add("Ankara");
		//list.Add(1);
		
		MyList<CustomerGeneric> list2 = new MyList<CustomerGeneric>();
		list2.Add(new CustomerGeneric());
		list2.Add(new CustomerGeneric());
		
		CustomerDalGeneric customerDal = new CustomerDalGeneric();
		customerDal.add(new CustomerGeneric());
	}

}


