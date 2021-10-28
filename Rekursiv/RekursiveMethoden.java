package Rekursiv;

public class RekursiveMethoden {
	public static void main(String[] args) {
		System.out.println(fakultaet(4));
		System.out.println(summe(4));
		System.out.println(powfak(4,2));
	}
	
    public static int fakultaet(int x){
        if (x == 0){
            return 1;
        }
        return x * fakultaet(x - 1);
    }
    
    public static int summe(int x){
        if (x == 1){
            return 1;
        }
        return x + summe(x - 1);
    }

    public static int powfak(int x, int y){
        if (y == 0){
            return 1;
        }
        return x * powfak(x, y - 1);
    }

}
