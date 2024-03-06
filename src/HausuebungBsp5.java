import java.util.Scanner;

public class HausuebungBsp5 {
    public static void addieren(int a,int b){
        int sum= a+b;
        System.out.println("Die Summe der Zahl ist " +sum);
    }
    public static void minmax(int a, int b){
        if (a<b){
            System.out.println("Die kleinere Zahl ist "+a+" die größere ist " +b);
        }
        else{
            System.out.println("Die kleinere Zahl ist "+b+" die größere ist " +a);
        }
    }
    public static void abs(int a){
        int abs;
       if (a<0){
          abs=-a;
       }
       else{
           abs=a;
       }
        System.out.println("Der absolute Wert der ersten Zahl ist: " +abs);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bitte 2 negative oder positive ganze Zahlen eingeben:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        addieren(a,b);
        minmax(a,b);
        abs(a);

    }
}
