import java.sql.SQLOutput;
import java.util.Arrays;

public class Donnerstag73 {
    /*public static int sum(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        return sum;
        for(int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
    }
    public static void printArray(int[] numbers){
        String output="";
        for(int number:numbers){
            System.out.print(number+ ", ");
        }
        System.out.println(numbers[numbers.length-1]);
            for (int i = 0; i<numbers.length-1; i++) {
                System.out.print(numbers[i]);
            }
        System.out.print(numbers[numbers.length-1]);
        }
public static boolean zahln(int[] numbers,int n){
    for (int number: numbers){
        if (number ==n){
            return true;
        }
    }
    return  false;
    }

     */
    public static int[] zahlen(int[] arr) {
        int[] array1 = new int[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            array1[count] = arr[i];
            count++;
        }
        return array1;
    }

    public static void main(String[] args) {
     /*   int[] array = new int[3];
        array[0]=4;
        array[1]=5;
        array[2]=6;
        int[] arr = {4,5,6};
        System.out.println(Arrays.toString(arr));*/
        /* int[] array = {5,9,4,1,7,9};
        printArray(array)

        int[] boo= {1,6,9,3,6,8,9,3,5};
        System.out.println(zahln(boo,2));
        int[] array = {1,5,3,8,54,7,9,3,56,8};
        System.out.println(sum(array));
        int[] boo={1,2,3};
        System.out.println(Arrays.toString(zahlen(boo)));
        int[][] array = new int[3][3];
        int[][] array2 = {{10, 11, 12}, {20, 21, 22}, {30, 31, 32}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
            }
            System.out.println("Array");
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    System.out.println(array[i][j] + " ");
                }
                System.out.println();
            }

        }
        System.out.println();*/
        int[][] array = {{10, 11, 12}, {20, 21, 22}, {30, 31, 32}};
        int length=9;
        int[] array2=new int[length];
        int counter=0;
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array2[counter]=array [i][j];
                counter++;
                if(i==j){
                    sum+= array[i][j];
                }
            }

        }
        System.out.println(Arrays.toString(array2));
        System.out.println(sum);
    }
}