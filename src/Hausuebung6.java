import java.util.Scanner;

public class Hausuebung6 {
    public static double celsius(double a){
        return (a+1.8)+32;
    }
    public static double fahrenheit(double a){
        return (a-32)/1.8;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bitte umzurechnenden Wert eingeben:");
        double a=scanner.nextDouble();
        System.out.println("Soll der Wert in Celsius oder Fahrenheit umgerechnet werden?");
        String auswahl=scanner.next().toLowerCase();
        if (auswahl.equals("celsius")){
            double neu= fahrenheit(a);
            System.out.println(neu);
        }
        else if (auswahl.equals("fahrenheit")){
            double neu=celsius(a);
            System.out.println(neu);
        }
        else{
            System.out.println("falsche Eingabe");
        }
    }
}
