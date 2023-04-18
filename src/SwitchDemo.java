
public class SwitchDemo {

	public static void main(String[] args) {
		
		char grade = 'D';
		switch(grade) {
		case 'A':
			System.out.println(" Mukemmel : gectiniz");
			break;
		case 'B':
			System.out.println("Cok guzel : gectiniz");
			break;
		case 'C':
			System.out.println("Guzel : gectiniz");
			break;
		case 'D':
			System.out.println("Fena degil : gectiniz");
			break;
		case 'F':
			System.out.println("Maalesef : kaldınız");
			break;
			default:
				System.out.println("Gecersiz not girdiniz");
				
		}
	}

}
