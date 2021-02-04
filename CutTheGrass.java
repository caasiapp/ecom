import java.util.Scanner;

public class CutTheGrass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How tall is your grass now?");
        System.out.print("(cm): ");
        double currentLength = scanner.nextDouble();
        System.out.println("Great, now at what length do you want your grass to be cut?");
        System.out.print("(cm): ");
        double maxLength = scanner.nextDouble();
        stateOfTheGrass(currentLength, maxLength);
    }

    public static void stateOfTheGrass(double currentLength, double maxLength) {
        double days = (maxLength - currentLength) / 0.8;
        System.out.println("Days until the trim: " + days + " days.");
    }
}
