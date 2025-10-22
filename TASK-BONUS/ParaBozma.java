
public class ParaBozma {
	public static void main(String[] args) {

        int tutar = 278; // örnek miktar
        int[] banknotlar = {100, 50, 20, 10, 5, 2, 1};
        int kalan = tutar;

        System.out.println("Para Bozma Tablosu: " + tutar + " TL");
        for (int banknot : banknotlar) {
            int adet = kalan / banknot;
            kalan = kalan % banknot;
            if (adet > 0) {
                System.out.println(adet + " x " + banknot + " TL");
            }
        }
    }
}
