package mukemmelSayi;

public class mukemmelSayi {

	public static void main(String[] args) {
	
		int a=7;
		int total=0;
		// boolean mukemmel=true;
		// 6
		// 28 mükemmel sayılardır.
		
		for (int i=1;i<a;i++) {
			if (a%i==0) {
				total=total+i;
			}
		}
		if (a==total) {
			System.out.println("sayımız mükemmel bir sayıdır.");
		}else {
			System.out.println("sayımız mükemmel bir sayı değildir");
		}
	}

}
