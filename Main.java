package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// 220 ve 284 arkadaş sayılardır
		
		int a=220;
		int b=284;
		int sumA=0;
		int sumB=0;
		
	for (int i=1;i<a;i++) {
		if (a%i==0) {
			sumA=sumA+i;
		}
	}
	
	for (int j=1;j<b;j++) {
		if (b%j==0) {
			sumB=sumB+j;
		}
	}
    if (sumA==b && sumB==a) {
    	System.out.println("Bu sayılar arkadaş sayılardır.");
    }
    else {
    	System.out.println("Bu sayılar arkadaş sayılar değildir.");
    }
    	
	}

}
