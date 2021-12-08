package Bubblesort;
import java.util.Arrays;
import java.util.Random;

public class Bubblesort{
    public static void main(String[] args) {
        int[] x = fillArray(100);
        System.out.println("Unsortiertes Array:");
        System.out.println(Arrays.toString(x));
        System.out.println("Sortiertes Array:");
        long a = System.nanoTime();
        int[] y = sort(x);
        long b = System.nanoTime();
        System.out.println(Arrays.toString(y));
        System.out.println("Benötigte Zeit: "+(b-a)+" Nanosekunden");
    }

    public static int[] sort (int[] array){
        for(int x = array.length; x > 1; x--){
            for(int i = 0; i < x-1; i++){
                if(array[i] > array[i+1]){
                    int help = array[i];
                    array[i] = array[i+1];
                    array[i+1] = help;
                }
            }
        }
        return array;
    }

    public static int[] fillArray(int laenge){
        int[] array = new int[laenge];
        Random rand = new Random(); 

        for (int i = 0; i<array.length; i++){
            int value = rand.nextInt(100); 
            array[i] = value;
        }

        return array;
    }
}