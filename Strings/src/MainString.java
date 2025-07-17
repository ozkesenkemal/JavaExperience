//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainString {
    public static void main(String[] args) {
        String str = "this is a demo string";
        System.out.println(str);

        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(3));
        System.out.println(str.concat(" added"));
        System.out.println(str);
        System.out.println(str.startsWith("t"));
        System.out.println(str.startsWith("T"));
        System.out.println(str.endsWith("g"));
        System.out.println(str.indexOf("demo"));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.replace("d", "e"));
        System.out.println(str.substring(3, 8));
        System.out.println(str.trim());

        char[] myCharArr = new char[5];
        str.getChars(0,5,myCharArr,0);
        for (int i = 0; i < myCharArr.length; i++) {
            System.out.println(myCharArr[i]);
        }

        for (String item: str.split(" ")) {
            System.out.println(item);
        }
    }
}