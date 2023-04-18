
public class SayiBulma {

	public static void main(String[] args) {
		
		int [] sayilar = new int [] {1,2,4,6,8,9,5};
		int aranacak = 3;
		Boolean varMi= false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi= true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayi mevcuttur");
		}else {
			System.out.println("Sayi mevcut degildir");
		}
		
	}

}
