import java.util.Scanner;

public class Kvadrat {
    public static void main(String[] args) {

        askUser();

    }

    public static void askUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter symbol you want to make the square of: ");
        String symbol = scanner.nextLine();
        System.out.println("Enter number of rows: ");
        int numRows = scanner.nextInt();


        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numRows-1; j++) {
                System.out.print(symbol + "  ");
            }
            System.out.println(symbol);
        }
    }
}
