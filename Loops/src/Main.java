//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Count: " + i);
        }


        int i = 0;
        while(i < 20){
            System.out.println("Count: " + i);
            i++;
        }

        i = 0;
        do{
            System.out.println("Count: " + i);
            i += 2;
        }while (i < 20);
    }
}