import java.util.Scanner;

public class vücutkitleendeksi {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Kilonuzu (kg) giriniz");
			double kilo = input.nextDouble();
			
			System.out.print("Boyunuzu (metre) giriniz: ");
			double boy = input.nextDouble();
			
			double bmi = kilo / (boy * boy);
			
			System.out.printf("BMI = %.2F\n", bmi);
			
			// BMI kategorisi 
			if (bmi < 18.5) {
				System.out.println("Durum : Zayıf");
				
		    }else if (bmi < 24.9) {
			   System.out.println("Durum: Normal");
			   
	        } else if (bmi < 29.9) {
	            System.out.println("Durum: Fazla Kilolu");
	            
	        } else {
	            System.out.println("Durum: Obez");
	        }

	        input.close();
	    }
	}
