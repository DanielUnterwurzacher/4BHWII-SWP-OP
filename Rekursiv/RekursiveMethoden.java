package Rekursiv;

public class RekursiveMethoden {
	public static void main(String[] args) {
        System.out.println("Fakultät:");
        System.out.println("===============");
        System.out.println("Rekursiv:");
		System.out.println(fakultaetRekursiv(4));
        System.out.println("Iterativ:");
        System.out.println(fakultaetIterativ(4));

        System.out.println();

        System.out.println("Summe:");
        System.out.println("===============");
        System.out.println("Rekursiv:");
		System.out.println(summeRekursiv(4));
        System.out.println("Iterativ:");
        System.out.println(summeIterativ(4));

        System.out.println();

        System.out.println("Potenz:");
        System.out.println("===============");
        System.out.println("Rekursiv:");
		System.out.println(powfakRekursiv(4,2));
        System.out.println("Iterativ:");
        System.out.println(powfakIterativ(4,2));
	}
	
    public static int fakultaetRekursiv(int x){
        if (x == 0){
            return 1;
        }
        return x * fakultaetRekursiv(x - 1);
    }

    public static int fakultaetIterativ(int x){
        int ergebnis = 1;
        for(int i=1;i<=x;i++){
            ergebnis *= i;
        }
        return ergebnis;
    }
    
    public static int summeRekursiv(int x){
        if (x == 1){
            return 1;
        }
        return x + summeRekursiv(x - 1);
    }

    public static int summeIterativ(int x){
        int ergebnis = 0;
        for(int i = 0; i<=x; i++){
            ergebnis+=i;
        }
        return ergebnis;
    }

    public static int powfakRekursiv(int x, int y){
        if (y == 0){
            return 1;
        }
        return x * powfakRekursiv(x, y - 1);
    }

    public static int powfakIterativ(int x, int y){
        int ergebnis = x;
        for (int i = 1; i < y; i++){
            ergebnis *=x;
        }
        return ergebnis;
    }

}
