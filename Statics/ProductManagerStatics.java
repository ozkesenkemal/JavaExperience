
public class ProductManagerStatics {
	public void add(ProductStatics product) {		
		if(ProductValidator.isValid(product)) {
		System.out.println("valid product added");
		}else {
			System.out.println("not valid product");
		}
	}
}
