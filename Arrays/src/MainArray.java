//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainArray {
    public static void main(String[] args) {
        String[] students = {"Kemal", "Özgür", "Merve"};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        for (String student : students) {
            System.out.println(student);
        }

        String[][] cities = new  String[2][2];

        cities[0][0] = "İstanbul";
        cities[0][1] = "Yalova";
        cities[1][0] = "Balıkesir";
        cities[1][1] = "İzmir";

        for (int i = 0; i < cities[0].length; i++) {
            for (int j = 0; j < cities[1].length; j++) {
                System.out.print(cities[i][j] +" ");
            }
            System.out.println();
        }
    }
}