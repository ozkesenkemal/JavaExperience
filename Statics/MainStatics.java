
public class MainStatics {

	public static void main(String[] args) {
		ProductManagerStatics manager = new ProductManagerStatics();
		ProductStatics product = new ProductStatics();
		product.name ="kalem";
		product.price = 10;
		manager.add(product);
		product = new ProductStatics();
		product.name ="kalem";
		product.price = 0;
		manager.add(product);
		
		DatabaseHelper.Crud.CreateConnection();
		DatabaseHelper.Crud.Update();
	}

}
