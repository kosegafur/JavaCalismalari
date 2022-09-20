package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "   Bugün hava çok güzel.   ";
		System.out.println(mesaj);
		// length: Metinin karakter sayısını(uzunluğunu) verir.
		System.out.println("Eleman Sayısı: " + mesaj.length());
		// charAt: Dizinin parantez içerisinde belirttiğimiz karakterin karşılığını
		// verir.
		System.out.println("5.Eleman: " + mesaj.charAt(4));
		// concat: Belirttiğimiz metin ile parantez içindeki metni birleştirir.
		System.out.println(mesaj.concat("Yaşasın!"));
		// startsWith: Önünde belirtilen metin parantez içindeki karakter ile başlıyor
		// mu sorusunun cevabını "true" ya da "false" olarak döner.
		System.out.println(mesaj.startsWith("G"));
		// endsWith: Önünde belirtilen metin parantez içindeki karakter ile bitiyor
		// mu sorusunun cevabını "true" ya da "false" olarak döner.
		System.out.println(mesaj.endsWith("l."));
		// getChars : Başında bulunan metinin (Kaçıncı karakterden başlayacağını(dahil),
		// Kaçıncı karakterde bitireceğini(dahil değil), nereye atayacağını, Atayacağı
		// yeni karakterin başında kaç tane boşluk bırakacağı) yazılır. Sonrasında yeni
		// karakteri oluşturur.
		char[] karakterler = new char[7];
		mesaj.getChars(0, 5, karakterler, 1);
		System.out.println(karakterler);
		// indexOf : Parantez içinde belirtilen karakterin metinde baştan sola ilk yakın
		// olan kaçıncı karakter olduğunu verir.
		System.out.println(mesaj.indexOf("g"));
		// lastIndexOf : Parantez içinde belirtilen karakterin metinde baştan sağa ilk
		// yakın olankaçıncı karakter olduğunu verir.
		System.out.println(mesaj.lastIndexOf("g"));
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println(mesaj);
		// replace : Metindeki istenilen karakteri, başka istenilen karakter ile
		// değiştirir (Değiştiricek karakter, Yeni atanacak karakter)
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		// substring : Metinin içinde belirtilen hangi karakterden sonrasını (kaçıncı
		// karakter sayısı(dahil) olduğu ya da yanında ek olarak kaçıncı karaktere kadar
		// alınması istenildiği(dahil değil) burada yazılır).
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2, 5));
		// split : Parantez içerisinde belirtilen karakterin metin içerisinde öncesi ve
		// sonrasında bulunan her bir parçayi dizin olarak döndürür.
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		// toLowerCase : Metinin büyük harflerini küçük harfe çevirir.
		System.out.println(mesaj.toLowerCase());
		// toUpperCase : Metinin küçük harflerini büyük harfe çevirir.
		System.out.println(mesaj.toUpperCase());
		// trim : Metinin başında ve sonunda bulunan boşlukları siler.
		System.out.println(mesaj.trim());
	}

}
