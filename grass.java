import java.util.Scanner;
public class grass {

    String problemDescription;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hvor langt skal græsset være?");
        double grassHøjde = scan.nextDouble();

        System.out.println("Hvad er den maximale længde græsset må være");
        double grassMaximal = scan.nextDouble();

        System.out.println("Der er " + antalDage(grassHøjde, grassMaximal) + " dage til at græsset skal slås.");

    }

public static int antalDage(double grassLength, double grassMax){

   return (int) ((grassMax-grassLength)/0.8);
}

}
