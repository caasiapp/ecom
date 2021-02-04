package exercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortering {

    public static void main(String[] args) {

        List<String> alfabet = new ArrayList<String>();

        alfabet.add("Abekat");
        alfabet.add("Musefælde");
        alfabet.add("Ananas");
        alfabet.add("Slut");
        alfabet.add("Solskin");

        System.out.println("Navne der ikke er sorteret i rækkefølge:");
        System.out.println("");

        if(!alfabet.isEmpty()){

            for(String order:alfabet){

                System.out.println(order);
            }

            Collections.sort(alfabet);
            Collections.reverse(alfabet);

            System.out.println("");
            System.out.println("Navne sorteret i alfabetisk rækkefølge:");
            System.out.println(alfabet);

        }
    }
}