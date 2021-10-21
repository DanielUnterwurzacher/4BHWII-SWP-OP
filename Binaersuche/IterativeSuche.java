package Binaersuche;

public class IterativeSuche {
	//HALLO
	private static int anzahlSchritte;
	
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println("Iterative Methode:");
		System.out.println("===============================");
		if (iterativ(7, arr)) {
			System.out.println("Zahl wurde gefunden!");
			System.out.println("Benötigte Schritte: "+anzahlSchritte);
		}else {
			System.out.println(anzahlSchritte+" Schritte ausgeführt - Die gesuchte Zahl war nicht dabei.");
		}
		
		System.out.println();
		System.out.println("Binäre Methode:");
		System.out.println("===============================");
		
		if (binaer(7, arr)) {
			System.out.println("Zahl wurde gefunden!");
			System.out.println("Benötigte Schritte: "+anzahlSchritte);
		}else {
			System.out.println(anzahlSchritte+" Schritte ausgeführt - Die gesuchte Zahl war nicht dabei.");
		}

		
	}
	
	public static boolean iterativ(int x, int[] arr) {
		anzahlSchritte = 0;
		for(int i = 0; i< arr.length; i++) {
			anzahlSchritte++;
			if(arr[i] == x) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean binaer(int x, int[] arr) {
		
		anzahlSchritte = 0;
		int mitte = arr.length / 2;
		int obereGrenze = arr.length;
		int untereGrenze = -1;
		
		while(mitte < arr.length && mitte > -1) {
			anzahlSchritte++;
			if(arr[mitte] == x) {
				return true;
			}
			else if(arr[mitte] < x) {
				untereGrenze = mitte;
				mitte += (obereGrenze - mitte)/2;
			}
			else if(arr[mitte] > x) {
				obereGrenze = mitte;
				mitte -= (mitte - untereGrenze)/2;
			}

			if((mitte == 0 && arr[mitte] != x) || (mitte == arr.length-1 && arr[mitte] != x)) {
				return false;
			}
		}
		return false;
		
	}

}
