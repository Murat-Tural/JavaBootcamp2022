
public class MulktiDimensionalArrayDemo {

	public static void main(String[] args) {
		
		String [][] sehirler = new String [3][3];
		sehirler [0][0] = "Istanbul";
		sehirler [0][1] = "Kocaeli";
		sehirler [0][2] = "Sakarya";
		sehirler [1][0] = "Izmir";
		sehirler [1][1] = "Mugla";
		sehirler [1][2] = "Aydin";
		sehirler [2][0] = "Erzurum";
		sehirler [2][1] = "Kars";
		sehirler [2][2] = "Van";
		
		    for(int i=0; i<=2;i++) {
			System.out.println("-----------");
			for (int j=0 ; j<=2;j++) {
			System.out.println(sehirler[i][j]);	
		}
		
		}

	}

}
