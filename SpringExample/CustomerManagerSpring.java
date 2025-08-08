
public class CustomerManagerSpring {
	ICustomerDalSpring customerDal;

	public CustomerManagerSpring(ICustomerDalSpring customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		System.out.println("");
		customerDal.add();
	}
}
