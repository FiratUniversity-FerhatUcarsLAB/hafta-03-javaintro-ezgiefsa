
public class hesapozeti {
	public static void main(String[] args) {
        String[] urunler = {"Süt", "Ekmek", "Yumurta (12'li)", "Peynir", "Elma"};
        double[] miktar = {2, 3, 1, 0.5, 1.2};
        double[] birimFiyat = {12.50, 4.00, 30.75, 85.00, 20.00};

        double toplamTutar = 0;
        System.out.println("");
        System.out.printf("| %-22s | %-7s | %-16s | %-16s |\n", "Ürün", "Miktar", "Birim Fiyat (₺)", "Toplam Fiyat (₺)");
        System.out.println("");
        for (int i = 0; i < urunler.length; i++) {
            double toplam = miktar[i] * birimFiyat[i];
            toplamTutar += toplam;
            System.out.printf("| %-22s | %-7.2f | %-16.2f | %-16.2f |\n", urunler[i], miktar[i], birimFiyat[i], toplam);
        }
        System.out.println("");
        System.out.printf("| %-48s | %-16.2f |\n", "Genel Toplam (₺)", toplamTutar);
        System.out.println("");
    }

}
