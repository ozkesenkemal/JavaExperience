public class Calculator {
    public int Add(int number1, int number2) {
        return number1 + number2;
    }

    public int Substract(int number1, int number2) {
        return number1 - number2;
    }

    public int Multiply(int number1, int number2) {
        return number1 * number2;
    }

    public int Divide(int number1, int number2) {
        if(number2 == 0){
            throw new ArithmeticException("Division by zero");
        }
        return number1 / number2;
    }
}
