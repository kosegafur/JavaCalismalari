package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'Z';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli Harf");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce Sesli Harf");
			break;
		default:
			System.out.println("Sesli Harf Değildir!");
		}

	}

}
