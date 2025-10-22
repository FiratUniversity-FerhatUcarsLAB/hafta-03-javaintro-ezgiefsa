
public class dönüsümtablosu {public static void main(String[] args) {

    // 1 mil = 1.609 kilometre
    double katsayi = 1.609;
    int[] milDegerleri = {1, 5, 10, 20, 50};

    System.out.println("");
    System.out.println("|  Mil   |  Kilometre (km)  |");
    System.out.println("");

    for (int mil : milDegerleri) {
        double km = mil * katsayi;
        System.out.printf("| %-6d | %-16.3f |\n", mil, km);
    }

    System.out.println("");
    }
}
	
