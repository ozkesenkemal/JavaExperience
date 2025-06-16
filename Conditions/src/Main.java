//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 20;

        if (a < 20) {
            System.out.println("less than 20");
        } else if (a == 20) {
            System.out.println("equals to 20");
        } else {
            System.out.println("greater than 20");
        }

        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Süper Pass");
                break;
            case 'B':
            case 'C':
                System.out.println("Pass nice");
                break;
            case 'D':
                System.out.println("Pass with D");
                break;
            default:
                System.out.println("Fail");
                break;
        }


    }
}