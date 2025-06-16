//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.AddCustomer();
        customerManager.UpdateCustomer();
        customerManager.DisplayCustomer();
        customerManager.DeleteCustomer();

        ValueOrReferanceType valueOrReferanceType = new ValueOrReferanceType();
        valueOrReferanceType.ShowValueType();
        valueOrReferanceType.ShowReferanceType();

        Calculator calculator = new Calculator();
        System.out.println(calculator.Add(3, 4));
        System.out.println(calculator.Substract(5, 2));
        System.out.println(calculator.Multiply(3, 4));
        System.out.println(calculator.Divide(12, 4));

        Product product2 = new Product(2,"const","desc",2,5);

        Product product = new Product();
        product.setName("yeni ürün");
        product.setId(1);
        product.setDescription("yeni ürün açıklaması");
        product.setPrice(100);
        product.setStockAmount(5);

        System.out.println(product.getId());
        System.out.println(product2.getId());
        System.out.println(product.getName());
        System.out.println(product.getDescription());
        System.out.println(product.getPrice());
        System.out.println(product.getStockAmount());

        ProductManager productManager = new ProductManager();
        productManager.AddProduct(product);
    }
}