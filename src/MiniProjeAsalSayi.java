import java.util.zip.ZipInputStream;

public class MiniProjeAsalSayi {

	public static void main(String[] args) {
		
		int number = 365;
		int remainder = number % 2;
		Boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Sayi asal degildir.");
			return;
		}
		
		if(number<1) {
			System.out.println("Gecersiz sayi.");
			return;
		}
		
		for (int i=2;i<17;i++) {
			if (number%i==0) {
				isPrime=false;
			}
		}
		if (isPrime) {
			System.out.println("Sayi asaldir.");
		}else {
			System.out.println("Sayi asal degildir.");
		}
		

	}

}
