/*Java da mantýksal ifadeler için if else koþullu durumlarý kullanýlýr
 * if(koþul1){		
 * 			// koþul1 doðru ise (//true dönerse) bu kod bloðu ile çalýþacaktýr
 * }
 * else if(koþul2){
 * 			// eðer koþul1 doðru deðil koþul2 doðru ise (//true dönerse) bu kod bloðu çalýþacaktýr
 * }
 *  else if(koþul3){
 * 			// eðer koþul1 ve koþul2 doðru deðil koþul3 doðru ise (//true dönerse) bu kod bloðu çalýþacaktýr
 * }
 * ...
 * ...
 * else{
 *  		//Yukarýdaki koþullarýn hiçbiri doðru deðilse bu kod bloðu çalýþacaktýr 
 *  		  koþul _n
 * }
 * 
 * 
 */



public class Ders4_aliÝfelsemantýksalifadeler {
	public static void main(String[]args){

		if (20>18) {
			System.out.println("20 sayýsý 18 sayýsýndan büyüktür");
			
		}
		
	int x=24;
	int y=12;
		if (x>y) {
			System.out.println(x +" sayýsý "+ y +" sayýsýndan büyüktür");
			
		}
		
		
	int saat=10;
	if(saat<18) { //true dönerse çalýþýr
		System.out.println("iyi günler");
		}
	
	else {
		System.out.println("iyi akþamlar");
	 }
	
int saat2=22;
if(saat2<10) { //true dönerse çalýþýr
	System.out.println("Günaydýn");
	}
else if (saat2<18) {
	System.out.println("iyi günler");
	}
else if (saat2>22) {
	System.out.println("iyi akþamlar");
	}
else {
	System.out.println("iyi geceler");
	
 	}
	int testScore=100;
	char grade; // grade seri anlamda kullanýmlaktadýr.
	if (testScore>=90) {
		grade='A';
	}
	else if (testScore>=80) {
		grade='B';
	}
	else if (testScore>=70) {
		grade='C';
	}
	else if (testScore>=60) {
		grade='D';
	}
	else {
		grade='F';
		System.out.println("dersten kaldýnýz");
	}
	System.out.println("Ders Notunuz:"+grade);
	}
}








