
public class CustomerManagerInterface {
	private ICustomerDal customerDal;
	public CustomerManagerInterface(ICustomerDal customerDal){
		this.customerDal = customerDal;
	}
	
	public void add() {
		customerDal.add();
	}
}
