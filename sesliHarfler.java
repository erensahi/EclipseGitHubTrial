package sesliHarfler;

public class sesliHarfler {

	public static void main(String[] args) {
		
		char harf='İ';
		
		char []kalın= {'a','ı','o','u','A','I','O','U'};
		char []ince = {'e','i','ö','ü','E','İ','Ö','Ü'};
		int k=1;
		
		for (int i=0;i<8;i++)
		{
			if(harf==kalın[i]) {
				k=1;
			}
		    if (harf==ince[i]) {
		    	k=2;
		    }
		}
       if (k==1) {
    	   System.out.println("girilen harf kalın harftir.");
       }
       if (k==2) {
    	   System.out.println("girilen harf ince harftir.");
       }
       
     /*  switch (harf)
       {
       case 'A':
       case 'I':
       case 'O':
       case 'U':
       case 'a':
       case 'ı':
       case 'o':
       case 'u':
    	   System.out.println("kalın harf");
    	   break;
    	   default:
    		   System.out.println("ince harf");
       } */
       
	}

}
