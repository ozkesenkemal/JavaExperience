public class CustomerManagerExample {
    private BaseLogger logger;
    public CustomerManagerExample(BaseLogger logger) {
        this.logger = logger;
    }
    public void add(){
        System.out.println("Adding Customer");
        logger.log("adding Customer");
    }
}
