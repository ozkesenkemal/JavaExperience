//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        calculateSum(1);
        calculateSum(1,2);
        calculateSum(1,2,3);
        calculateSum(1,2,3,4);
        calculateSum(1,2,3,4,5);
    }

    private static void calculateSum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}