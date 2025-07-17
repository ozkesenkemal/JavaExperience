
public class ProductValidator {
	static {
		System.out.println("static const runned");
	}
	
	public ProductValidator() {
		System.out.println("const runned");
	}
	
	public static boolean isValid(ProductStatics product) {
		return product.price > 0 && !product.name.isEmpty();
	}
	
	public static class AnotherClass{
		public static void remove() {
			System.out.println("inner static class");
		}
	}
}
