import java.util.ArrayList;


public class Bibliotek {

    public static void main(String[] args) {
        ArrayList<Bog> bookList = new ArrayList<>();

        Bog bog1 = new Bog(55648, "Kick-ass", 2010);
        Bog bog2 = new Bog(85477, "Bear Grylls", 2020);
        Bog bog3 = new Bog(95811, "Java Pocket Guide", 2005);
        Bog bog4 = new Bog(85477, "Kick Booty", 2011);

        bookList.add(bog1);
        bookList.add(bog2);
        bookList.add(bog3);

        System.out.println(bookList.toString());
        System.out.println(hasSameISBN(bog4, bookList));


    }

    public static boolean hasSameISBN(Bog bookOfChoice, ArrayList<Bog> test) {

        for (int i = 0; i < test.size(); i++) {
            if (bookOfChoice.getISBN() == test.get(i).getISBN()) {
                return true;
            }
        }
        return false;
    }
}
