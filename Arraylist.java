import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>();
        test.add("Æble");
        test.add("Banan");
        test.add("Kiwi");
        System.out.println(doesArraylistContainString(test,"Banan"));
    }
    public static boolean doesArraylistContainString(ArrayList<String> arr, String string) {

        if (arr.contains(string)) {
            System.out.println("The string has been found");
            return true;
        }
        if (!arr.contains(string)) {
            arr.add(string);
            System.out.println(Arrays.toString(arr.toArray()));
            return false;
        }
        return false;
    }
}
