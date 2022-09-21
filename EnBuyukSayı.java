package enBuyukSayı;

public class EnBuyukSayı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b=7;
		int c=9;
		
		int enBuyuk=a;
		
		if (a<b) {
			enBuyuk=b;
		}
		
		if(b<c) {
			enBuyuk=c;
		}
			
		System.out.println("En büyük sayı " +enBuyuk);
		
		/* if (a>b && a>c)
		  {
			 System.out.println("En büyük sayı a");
		  }
		 if (b>c && b>a)
		 {
			 System.out.println("En büyük sayı b");
		 }
		 if (c>a && c>b)
		 {
			 System.out.println("En büyük sayı c");
		 }  */
		 	 
	}

}
