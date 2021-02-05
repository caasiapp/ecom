import java.lang.reflect.Array;


public class Searching {
    public static void main(String[] args) {
        String[] kunstnerArray = {"Branco", "Kesi", "Gilli", "Trey & Zay", "Node"};
        System.out.println(lookForStringInArray(kunstnerArray, "Kesi")); // Skriv string her.
    }

    public static int lookForStringInArray(String[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (Array.get(arr, i).toString().toLowerCase().equals(str.toLowerCase())) { //Er nu ikke case sensitive.
                System.out.println("Index position of the matching string is: " + i);
                System.exit(0);
            }
        }
        return -1;
    }
}