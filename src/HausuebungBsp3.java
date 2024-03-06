import java.util.Scanner;

public class HausuebungBsp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Temperatur zwischen -20 und 35 Grad eingeben");
        int temperatur = scanner.nextInt();
        System.out.println("Wie ist das Wetter? Auswahlmöglichkeiten:\nsonnig\nbewölkt\nregen");
        String wetter = scanner.next().toLowerCase();
        switch (wetter) {
            case "sonnig":
                if (temperatur <= 0) {
                    System.out.println("Zuhause bleiben und Tee trinken");
                } else if (temperatur <= 10) {
                    System.out.println("Warm anziehen und in der Sonne spazieren gehen");
                } else if (temperatur <= 25) {
                    System.out.println("In der Sonne sitzen und einen Kaffee trinken");
                } else {
                    System.out.println("Baden gehen");
                }
                break;
            case "bewölkt":
                if (temperatur <= 0) {
                    System.out.println("Zuhause bleiben und Tee trinken");
                } else if (temperatur <= 10) {
                    System.out.println("Zuhause bleiben und einen Filmeabend machen");
                } else if (temperatur <= 25) {
                    System.out.println("In die Stadt gehen und bummeln");
                } else {
                    System.out.println("Wandern");
                }
                break;
            case "regen":
                if (temperatur <= 0) {
                    System.out.println("Es schneit! Sitze vor dem Fenster und beobachte den Schneefall");
                } else if (temperatur <= 10) {
                    System.out.println("Ins Kino gehen");
                } else if (temperatur <= 25) {
                    System.out.println("Im Regen spazieren gehen");
                } else {
                    System.out.println("Im Regen tanzen");
                }
                break;

        }
    }
}




