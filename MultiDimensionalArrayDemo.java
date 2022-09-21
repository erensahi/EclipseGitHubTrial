
public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
		
		String [][] sehir =new String [3][3];
		
		   sehir [0][0]= "İstanbul";
		   sehir [0][1]= "Balıkesir";
		   sehir [0][2]= "Kocaeli";
		   sehir [1][0]= "Ankara";
		   sehir [1][1]= "Kayseri";
		   sehir [1][2]= "Konya";
		   sehir [2][0]= "Ordu";
		   sehir [2][1]= "Rize";
		   sehir [2][2]= "Artvin";
		   
		   for(int i=0;i<3;i++) {
			   System.out.println("--------------------");
			   for(int j=0;j<3;j++) {
				   System.out.println(sehir[i][j]);
			   }
		   }

	}

}
