package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		//değişken isimlendirmeleri javada camelCase yazılır
		String ortaMetin ="İlginizi çekebilir";
	    String altMetin = "Vade süresi";
	    
	    System.out.println(ortaMetin);
	    System.out.println(altMetin);
	    
	    int vade = 12;
	    
	    // double ondalık sayı için yazılan kod
	    
	    double dolarDun = 18.25;
	    double dolarBugun = 18.30;
	    
	    // boolean mantıksal veri tipi
	    
	    boolean dolarDustuMu =	false;
	    
	    String okYonu = "";
	    
	    if (dolarBugun<dolarDun) {
	    	okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun>dolarDun) {
			okYonu = "up.svg";
		System.out.println(okYonu);}
	    
	    // equal.svg eşitlik anlamına geliyor
	    else { okYonu = "equal.svg";
		System.out.println(okYonu);    
			
		}
	    
	    //array liste anlamına gelir. Köşeli parantez gördüğün yerde veri tutuluyordur.
	    
	    String[] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan Alanlar", "Mutlu Emekli"};
	    System.out.println(krediler[0]);
	    System.out.println(krediler[1]);
	    System.out.println(krediler[2]);
	    
	    // for kodu bir şeyi bir şarta göre tekrarlar
	    // length boyut anlamına gelir. i++( bir bir artır) i--(bir bir azalt anlamına gelir)
	    
	    for (int i = 0; i < krediler.length; i++) {
	    	System.out.println(krediler[i]);
	    	
	    }
	}

}
