import java.util.Scanner;

public class Hausuebung {
    public static void ungerade(int a) {
        if (a % 2 == 0) {
            System.out.printf("Die Zahl " + a + " ist gerade");
        } else {
            System.out.printf("Die Zahl " + a + " ist ungerade");
        }
    }
    public static void main(String[] args) {
            //Übung 1
        Scanner scanner = new Scanner((System.in));
        System.out.println("Bitte beliebige ganze Zahl eingeben: ");
        int zahl = scanner.nextInt();
        ungerade(zahl);

    }
}
