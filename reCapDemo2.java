package reCapDemo2;

public class reCapDemo2 {

	public static void main(String[] args) {

		// double [] sayi= new double [4];
		double[] sayi = { 1.2, 3.5, 4.6, 6.7 };

		double total = 0;
		double max = sayi[0];

		for (double sayilar : sayi) {

			if (max < sayilar) {
				max = sayilar;
			}
			total = total + sayilar;

		}
		System.out.println("Toplam: " + total);
		System.out.println("En Büyük Sayı: " + max);

	}

}
