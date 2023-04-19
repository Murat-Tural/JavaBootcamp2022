package methodOverloading;

public class Main {

	public static void main(String[] args) {
		
		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.topla(15, 25));
		
		DortIslem dortIslem2 = new DortIslem();
		System.out.println(dortIslem2.topla2(15, 25, 35));
	}

}
