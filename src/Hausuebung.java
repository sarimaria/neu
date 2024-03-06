import java.util.Scanner;

public class Hausuebung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Alter eingeben:");
        int alter = scanner.nextInt();
        if (alter >= 24) {
            System.out.printf("Mit " + alter + " Jahren sind die Lenkerberechtigungen für AM, A1, A2, B/BE, C1/C1E und F möglich");
        } else if (alter >= 21) {
            System.out.println("Mit " + alter + " Jahren sind die Lenkerberechtigungen für C und D1/D1E möglich");
        } else if (alter >= 18) {
            System.out.printf("Mit " + alter + " Jahren sind die Lenkerberechtigungen für A2, B/BE, C1/C1E und F möglich");
        } else if (alter >= 17) {
            System.out.printf("Mit " + alter + " Jahren sind die Lenkerberechtigungen für B mit 17 möglich");
        } else if (alter >= 16) {
            System.out.printf("Mit " + alter + " Jahren sind die Lenkerberechtigungen für A1 und F möglich");
        } else if (alter >= 15) {
            System.out.printf("Mit " + alter + " Jahren ist die Lenkerberechtigungen für AM möglich");
        } else {
            System.out.printf("Zu Jung zum Fahren");
        }
    }
}