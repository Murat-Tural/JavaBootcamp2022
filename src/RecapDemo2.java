
public class RecapDemo2 {

	public static void main(String[] args) {
	
		double [] myList = {1.2,2.4,4.8,9.6};
		double total = 0;
		double max = myList[0];
		for(double number:myList) {
			if (max<number) {
				max=number;
			}
			System.out.println(number);
			total+=number;
		
		}
		System.out.println("Toplam = " +total);
		System.out.println("En buyuk = " +max);
		
	}

}
