package Bubblesort;
import java.util.Arrays;

public class Bubblesort{
    public static void main(String[] args) {
        int[] x = {3,2,7,5,9};
        System.out.println("Unsortiertes Array:");
        System.out.println(Arrays.toString(x));
        System.out.println("Sortiertes Array:");
        System.out.println(Arrays.toString(sort(x)));
    }

    public static int[] sort (int[] array){
        boolean again = true;
        while(again){
            for(int x = 0; x < array.length-1;x++){
                again = false;
                if(array[x] > array[x+1]){
                    int i = array[x];
                    array[x] = array[x+1];
                    array[x+1] = i;
                    again = true;
                }
            }
        }
        return array;
    }
}