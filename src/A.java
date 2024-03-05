import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        for (int i = 2025; i <= 2125 ; i++) {
            System.out.println(sj);
        }
    }
        public static void sj(int i){
        String schaltjahr;
        String keinSJ;
            if (i%4==0 && i%100==0){
                return keinSJ;
                }
                else if (i%4==0 && i%400 ==0){
                    return  schaltjahr;
                }
                else if(i%4==0){
                return schaltjahr;
            }
                else{
                System.out.println("Ubgültige Eingabe");
            }
            }
    }
