/*Java da mantıksal ifadeler için if else koşullu durumları kullanılır
 * if(koşul1){		
 * 			// koşul1 doğru ise (//true dönerse) bu kod bloğu ile çalışacaktır
 * }
 * else if(koşul2){
 * 			// eğer koşul1 doğru değil koşul2 doğru ise (//true dönerse) bu kod bloğu çalışacaktır
 * }
 *  else if(koşul3){
 * 			// eğer koşul1 ve koşul2 doğru değil koşul3 doğru ise (//true dönerse) bu kod bloğu çalışacaktır
 * }
 * ...
 * ...
 * else{
 *  		//Yukarıdaki koşulların hiçbiri doğru değilse bu kod bloğu çalışacaktır 
 *  		  koşul _n
 * }
 * 
 * 
 */



public class Ders4_aliİfelsemantıksalifadeler {
	public static void main(String[]args){

		if (20>18) {
			System.out.println("20 sayısı 18 sayısından büyüktür");
			
		}
		
	int x=24;
	int y=12;
		if (x>y) {
			System.out.println(x +" sayısı "+ y +" sayısından büyüktür");
			
		}
		
		
	int saat=10;
	if(saat<18) { //true dönerse çalışır
		System.out.println("iyi günler");
		}
	
	else {
		System.out.println("iyi akşamlar");
	 }
	
int saat2=22;
if(saat2<10) { //true dönerse çalışır
	System.out.println("Günaydın");
	}
else if (saat2<18) {
	System.out.println("iyi günler");
	}
else if (saat2>22) {
	System.out.println("iyi akşamlar");
	}
else {
	System.out.println("iyi geceler");
	
 	}
	int testScore=100;
	char grade; // grade seri anlamda kullanımlaktadır.
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
		System.out.println("dersten kaldınız");
	}
	System.out.println("Ders Notunuz:"+grade);
	}
}








