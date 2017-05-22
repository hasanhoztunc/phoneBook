
package telefonrehberi;

import java.io.FileNotFoundException;
import java.util.*;
public class telefonRehberi {
     public static void main(String[]args) throws FileNotFoundException{
Scanner klavye=new Scanner (System.in);
         System.out.println("Yapmak istediğiniz işlemi seçiniz");
System.out.println("1-Kişi ekle");
System.out.println("2-Kişileri listele");
System.out.println("3-Kişi sil");
int secin=klavye.nextInt();
islemYap yap=new islemYap("C:\\Users\\Monster\\Desktop\\phonebookproje\\veri3.txt");
switch(secin)
		{
case 1:
     kisiBilgiler bilgiler = new kisiBilgiler();
	System.out.print("İsim Giriniz :");
	bilgiler.setIsim(klavye.next());
	System.out.print("Soyisim Giriniz :");
	bilgiler.setSoyisim(klavye.next());
	System.out.print("Numara Giriniz:");
	bilgiler.setNumara(klavye.next());
	yap.kisiEkle(bilgiler);   
    break;
case 2:
	 System.out.print(yap.veriGoruntule());
        break;
case 3:
	System.out.print("Silmek istediğiniz kişinin ismini soyismini giriniz:");
	yap.kisiSil(klavye.next());
	break;
		}
		System.out.println("\nDevam etmek ister misin:");
		secin = 0;
	
       while(klavye.next().equals("e")){
   
       
       }
     }
     }

