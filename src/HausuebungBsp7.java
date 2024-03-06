import java.util.Scanner;

public class HausuebungBsp7 {
    public static double umrechnen(double a, String b) {
        switch (b) {
            case "usd":
                a = a * 1.09;
                break;
            case "czk":
                a = a * 25.36;
                break;
            case "huf":
                a = a * 392.93;
                break;
            case "pln":
                a = a * 4.30;
                break;
            default:
                System.out.println("falsche Eingabe");
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte umzurechnenden Betrag (Euro) eingeben:");
        double wert = scanner.nextDouble();
        System.out.println("Bitte die gewünschte Währung auswählen:\nUSD\nCZK\nHUF\nPLN");
        String waehrung = scanner.next().toLowerCase();
        double a=umrechnen(wert, waehrung);
        System.out.println("Euro umgerechnet in " + waehrung.toUpperCase() + " beträgt: " + a);
    }

}
