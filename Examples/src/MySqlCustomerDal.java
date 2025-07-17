public class MySqlCustomerDal implements ICustomerDal, IRepository{

    @Override
    public void add() {
        System.out.println("Mysql added");
    }

    @Override
    public void addCustomer() {

    }
}
