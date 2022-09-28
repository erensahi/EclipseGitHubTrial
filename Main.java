package sayiBulma;

public class Main {

	public static void main(String[] args) {
		
		// int [] sayi = new int [] {1,2,4,6,7,8,9};
		int [] sayi = {1,2,3,5,7,8,9,76};
        int aranacakSayi =11;
       boolean k=false;
        
        for(int deger: sayi){
        	if (deger==aranacakSayi) {
        		k=true;
        	}
        }
        
        if (k) {
        	System.out.println("Aranan sayı dizide bulunmaktadır.");
        }
        else {
        	System.out.println("Aranan sayı dizide bulunmamaktadır");
        }
        
	}

}
