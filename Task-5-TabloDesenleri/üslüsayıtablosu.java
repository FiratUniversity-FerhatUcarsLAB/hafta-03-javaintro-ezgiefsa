
public class üslüsayıtablosu {
	public static void main(String[] args) {

        System.out.println("");
        System.out.println("| a   | a^2     | a^3     |");
        System.out.println("");

        for (int a = 1; a <= 5; a++) {
            int aKare = a * a;
            int aKup = a * a * a;

            System.out.printf("| %-3d | %-7d | %-7d |\n", a, aKare, aKup);
        }

        System.out.println("");
    }
}
