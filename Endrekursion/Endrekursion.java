package Endrekursion;

public class Endrekursion{
    public static void main(String[] args) {
        System.out.println("Fakultät:");
        System.out.println("===============");

        long timeFakR1 = System.nanoTime();
        int fakR = fakultaetRekursiv(4);
        long timeFakR2 = System.nanoTime();
        System.out.println("Rekursiv: "+fakR+"\t Zeit: "+ (timeFakR2 - timeFakR1)+" Nanosekunden");

        long timeFakE1 = System.nanoTime();
        int fakE = fakultaetEndrekursiv(1,4);
        long timeFakE2 = System.nanoTime();
        System.out.println("Endrekursiv: "+fakE+"\t Zeit: "+ (timeFakE2 - timeFakE1)+" Nanosekunden");

        System.out.println();

        System.out.println("Summe:");
        System.out.println("===============");

        long timeSumR1 = System.nanoTime();
        int sumR = summeRekursiv(4);
        long timeSumR2 = System.nanoTime();
        System.out.println("Rekursiv: "+sumR+"\t Zeit: "+(timeSumR2 - timeSumR1)+" Nanosekunden");

        long timeSumE1 = System.nanoTime();
        int sumE = summeEndrekursiv(0,4);
        long timeSumE2 = System.nanoTime();
        System.out.println("Endrekursiv: "+sumE+"\t Zeit: "+(timeSumE2 - timeSumE1)+" Nanosekunden");

        System.out.println();

        System.out.println("Potenz:");
        System.out.println("===============");
        
        long timePowR1 = System.nanoTime();
        int powR = powfakRekursiv(4,2);
        long timePowR2 = System.nanoTime();
        System.out.println("Rekursiv: "+powR+"\t Zeit: "+(timePowR2 - timePowR1)+" Nanosekunden");

        long timePowE1 = System.nanoTime();
        int powE = powfakEndrekursiv(4,2,1);
        long timePowE2 = System.nanoTime();
        System.out.println("Endrekursiv: "+powE+"\t Zeit: "+(timePowE2 - timePowE1)+" Nanosekunden");

        System.out.println();
    }

    public static int fakultaetRekursiv(int x){
        if (x == 0){
            return 1;
        }
        return x * fakultaetRekursiv(x - 1);
    }

    public static int summeRekursiv(int x){
        if (x == 1){
            return 1;
        }
        return x + summeRekursiv(x - 1);
    }

    public static int powfakRekursiv(int x, int y){
        if (y == 0){
            return 1;
        }
        return x * powfakRekursiv(x, y - 1);
    }

    //Endrekursion:

    public static int fakultaetEndrekursiv(int x, int n){
        if (n == 0){
            return x;
        }
        return fakultaetEndrekursiv(x * n,n - 1);
    }

    public static int summeEndrekursiv(int x, int n){
        if (n == 0){
            return x;
        }
        return summeEndrekursiv(x + n,n - 1);
    }

    public static int powfakEndrekursiv(int x, int y, int n){
        if (y == 0){
            return n;
        }
        return powfakEndrekursiv(x, y - 1, n * x);
    }

}