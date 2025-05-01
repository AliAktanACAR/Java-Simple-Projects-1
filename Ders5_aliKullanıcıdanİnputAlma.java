import java.util.Scanner;

public class Ders5_aliKullanýcýdanÝnputAlma {
	public static void main(String[]args){
/*		
		Scanner myObj=new Scanner(System.in);
		//ctrl+shift+o tuþlarýna birlikte basýyoruz
		System.out.println("Bir Tam Sayý Giriniz :");
		int a=myObj.nextInt();
		System.out.println("girilen sayý :"+a);
//**********************************************************************
		Scanner input=new Scanner(System.in);
		int a1,b1;
		
		System.out.println("a sayýsýný giriniz :");
		a1=input.nextInt();		
		System.out.println("b sayýsýný giriniz :");
		b1=input.nextInt();		
		
		System.out.println("A sayýsý :"+a1);
		System.out.println("B sayýsý :"+b1);
		System.out.println("a ve b sayýlarýnýn toplamý :"+(a1+b1));
//**********************************************************************
		Scanner giris=new Scanner(System.in);
		String isim, soyisim;
		System.out.println("isim ve soyisminizi giriniz :");
		isim=giris.next();
		soyisim=giris.next();
		
		System.out.println("Ýsminizin baþ harfi :"+isim.charAt(0));
		System.out.println("soyisminizin baþ harfi :"+soyisim.charAt(0));	
*/	
//**********************************************************************				
				
Scanner giris=new Scanner(System.in);
System.out.println("adýnýzý giriniz : ");
String ad=giris.nextLine();
		
System.out.println("soyadýnýzý giriniz : ");
String soyad=giris.nextLine();
			
System.out.println("yaþýnýzý giriniz : ");
int yaþ=giris.nextInt();
  	
System.out.println("maaþýnýzý giriniz : ");
double maaþ=giris.nextDouble();

System.out.println("adýnýz ve soyadýnýz :" +ad+soyad);
System.out.println("yaþýnýz :"+yaþ);
System.out.println("maaþýnýz :"+maaþ);

				
						
		
		
	}
}
