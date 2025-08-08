
public class MainSpring {
	public static void main(String[] args) {
		CustomerManagerSpring customerManager = new CustomerManagerSpring(new OracleCustomerDalSpring());
		customerManager.add();
		
	    customerManager = new CustomerManagerSpring(new MySqlCustomerDalSpring());
		customerManager.add();
	}
}
