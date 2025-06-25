public class TeacherCreditManager  extends BaseCreditManager{
    @Override
    public double calculate(double amount) {
        return amount * 1.4;
    }
}
