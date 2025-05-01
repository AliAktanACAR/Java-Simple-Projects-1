
public class Ders6_aliAritmatikOperatorler {
	public static void main(String[]args){
/*Aritmatik operatörler
 * Java diliyle toplama, çýkarma, bölme, çarpma, mod alma, artýrma, eksiltme gibi aritmetik iþlemlerin  kullanýldýðý programlar
 * Mod alma iþlemi bir sayýnýn baþka bir sayýya bölümünden kalaný verir
 * Artýrma eksiltme operatörleri sayýyý bir artýrýr yada eksiltir
 *
 */
int x=10;
int y=4;
	System.out.println("Sonuç : "+(x+y));
	System.out.println("Sonuç : "+(x-y));
	System.out.println("Sonuç : "+(x*y));
	System.out.println("Sonuç : "+(double)(x/y)); //10 bölü 4 iþleminde kalan 2 olmasýna raðmen sonuç 2 olarak gözüküyor bunu deðiþtirmek için double kullanýlmalýdýr
	System.out.println("Sonuç : "+(x/(double)y)); //sonuç 2.5
	System.out.println("Sonuç : "+((double)x/y)); //sonuç 2.5
	System.out.println("Sonuç : "+((double)x/(double)y)); // sonuç 2.5
	System.out.println("Sonuç : "+(x%y));
	
	// Atama, Artýrma ve Azaltma
int a=10;
a= a+1; // a=10+1 a=11
	System.out.println("a'nýn deðeri : "+a);
a= a-1;
	System.out.println("a'nýn deðeri : "+a);
int b=20;
b=b+3;
	System.out.println("b'nin deðeri : "+b);
b+=3;
	System.out.println("b'nin deðeri : "+b);	
b+=5;
	System.out.println("b'nin deðeri : "+b);
b*=5;
	System.out.println("b'nin deðeri : "+b);		

int c=10;
c++;
System.out.println("c'nin deðeri : "+c);
++c;
System.out.println("c'nin deðeri : "+c);
c--;
System.out.println("c'nin deðeri : "+c);
--c;

System.out.println("c'nin deðeri : "+ ++c);
System.out.println("c'nin deðeri : "+ ++c); // önündeki + (birlikte getir) operatörü ile karýþabileceði için çok tercih edilmez
System.out.println("c'nin deðeri : "+ c);
System.out.println("c'nin deðeri : "+ c--); // c nin deðerini 1 azaltarak iþlemde düþürür
System.out.println("c'nin deðeri : "+ c);
System.out.println("c'nin deðeri : "+ --c); // c nin deðerini ilk olarak 1 azaltacak



	}
}
