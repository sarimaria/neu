import java.util.Scanner;

public class HausuebungBsp4 {
    public static double berechnen(double kg, double m) {
        return kg/(m*m);
    }
    public static void ausgabe(double kg, double m) {
        double bmi = berechnen(kg,m);
        System.out.println("Der BMI beträgt: " + bmi);
        if (bmi <= 18.5) {
            System.out.println("Untergewicht");
        } else if (bmi <= 25) {
            System.out.println("Normalgewicht");
        } else if (bmi <= 30) {
            System.out.println("Übergewichtig");
        } else if (bmi > 30.1) {
            System.out.println("Adipositas");
        }
        else{
            System.out.println("Bitte Eingaben überprüfen");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Gewicht eingeben");
        double kg = scanner.nextDouble();
        System.out.println("Bitte Körpergrösse in Meter angeben:");
        double m = scanner.nextDouble();
        berechnen(kg, m);
        ausgabe(kg,m);
        }
    }