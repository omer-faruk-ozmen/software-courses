package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu = "İnternet Şubesine gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
					
		System.out.println(internetSubeButonu);
		
		if(dolarDun<dolarBugun) {   //true or false value
			System.out.println("Dolar düşüş resmi");
		}else if(dolarDun>dolarBugun){
			System.out.println("Dolar yükseliş resmi");
		}else{
			System.out.println("Dolar değişmedi resmi");
		}
		
		String kredi1 = "Hızlı Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Çiftçi Kredisi";
		String kredi5 = "MSB Kredisi";
		String kredi6 = "MEB Kredisi";
		String kredi7 = "Kültür Bakanlığı Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		String[] krediler = {
				"Hızlı Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"MSB Kredisi",
				"MEB Kredisi",
				"Kültür Bakanlığı Kredisi"
				};
		
		//foreach döngüsü
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		for(int i = 0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		//stack
		//sayısal veri tipleri değer tip olarak tutulur
		//value type
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2; //değer sadece atanır arasında bağlantı kalmaz.
		sayi2 = 100;
		System.out.println(sayi1);
		
		//stack and heap
		//array'ler referans tip olarak tutulur.
		//referance type
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2; //sayılar1'in adresi sayılar2'nin adresi oluyor.
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		//Strig'ler char array olarak tutulur
		String sehir1 = "Ankara"; //['A','N','K',...] , value tipe benzer.
		String sehir2 = "İstanbul";
		sehir1 = sehir2;
		sehir2 = "İzmir";
		System.out.println(sehir1);
	
	}
	
}