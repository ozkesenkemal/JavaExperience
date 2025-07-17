import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainExample {
    public static void main(String[] args) {
        isPrime();
        isVowel("E");
        isVowel("t");
        writeSuperNumbers();
        writeFriendNumbers();
        inheritanceExample();
        polimorphismExample();
        abstractExample();
        interfaceExample();

    }

    private static void interfaceExample() {
        ICustomerDal customerDal = new OracleCustomerDal();
        customerDal.add();
        System.out.println("interface finished");
    }

    private static void abstractExample() {
        GameCalculator[] gameCalculators = new GameCalculator[] { new ManGameCalculator(), new WomanGameCalculator(), new KidsGameCalculator()};

        for (GameCalculator gameCalculator : gameCalculators) {
            gameCalculator.calculate();
            gameCalculator.gameOver();
        }
    }

    private static void polimorphismExample() {
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EMailLogger(), new DatabaseLogger(), new ConsoleLogger()};

        for (BaseLogger logger : loggers) {
            logger.log(logger.getClass().getSimpleName());
        }
        CustomerManagerExample customerManager = new CustomerManagerExample(new DatabaseLogger());
        customerManager.add();
    }

    private static void inheritanceExample() {
        BaseCreditManager[] baseCreditManagerList = new BaseCreditManager[]{new TeacherCreditManager(), new AgricultureCreditManager()};
        CreditUI creditUI = new CreditUI();

        for (BaseCreditManager baseCreditManager : baseCreditManagerList) {
            creditUI.callCredits(baseCreditManager);
            System.out.println(baseCreditManager.calculate(100));
        }
    }

    private static void writeFriendNumbers() {
        for (int i = 1; i <= 1000; i++) {
            int result1 = findDividersSum(i);

            if (i != result1 && findDividersSum(result1) == i) {
                System.out.println(result1 + " and " + i + " friend numbers");
            }
        }
    }

    private static int findDividersSum(int i) {
        int sum = 0;
        for (int j = 1; j < i; j++) {
            if (i % j == 0) {
                sum += j;
            }
        }

        return sum;
    }

    public static void isPrime() {
        boolean isPrime;
        for (int i = 2; i < 25; i++) {
            isPrime = true;
            for (int j = 2; j < 25; j++) {
                if (i <= j) {
                    continue;
                }
                if (i % j == 0) {
                    isPrime = false;
                    System.out.println(i + "Asal değil");
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i + "Asal");
            }
        }
    }

    private static void isVowel(String word) {
        switch (word.toLowerCase()) {
            case "a":
            case "e":
            case "ı":
            case "i":
            case "o":
            case "ö":
            case "u":
            case "ü":
                System.out.println(word + " İnce sesli");
                break;
            default:
                System.out.println(word + " Kalın sesli");
                break;
        }
    }

    private static void writeSuperNumbers() {
        int sum = 0;
        int superNumber = 6;
        List<Integer> dividers = new ArrayList<Integer>();
        int i = 1;
        for (i = 1; i < 100; i++) {
            if (i > superNumber) {
                for (int j = 0; j < dividers.size(); j++) {
                    sum += dividers.get(j);
                }

                if (sum == superNumber) {
                    System.out.println(superNumber);
                }

                sum = 0;
                i = 0;
                dividers = new ArrayList<Integer>();
                superNumber++;
                continue;
            }

            if (superNumber % i == 0 && superNumber != i) {
                dividers.add(i);
            }
        }
    }
}