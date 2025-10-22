
public class saatdönüştürme {
	public static void main(String[] args) {
		
		int toplamSaniye = 3666; // örnek değer
		int saat = toplamSaniye / 3600;
		int dakika = (toplamSaniye % 3600) / 60;
		int saniye = toplamSaniye % 60;
		System.out.printf("%d saniye = %d:%02d:%02d\n", toplamSaniye,saat,dakika,saniye);
	
	}
}
