
public class carpimtablosu {
	public static void main(String[] args) {

        int sayi = 2; //2'nin çarpım tablosu

        System.out.println("");
        System.out.println("|  2'nin Çarpım Tablosu  |");
        System.out.println("");

        for (int i = 1; i <= 10; i++) {
            int sonuc = sayi * i;
            System.out.printf("|  %d x %2d = %2d       |\n", sayi, i, sonuc);
        }

        System.out.println("");
    }
}
