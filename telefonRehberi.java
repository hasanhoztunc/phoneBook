
package telefonrehberi;

import java.io.*;
import java.util.*;
public class telefonRehberi 
{
     public static void main(String[]args) throws FileNotFoundException
    {
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
    System.out.println("\nDevam etmek ister misiniz:");
    secin = 0;
	
    System.out.println("0-Çıkış");
    System.out.println("e-Devam ");
    System.out.println("______________________");
    System.out.println("Yapmak istediğiniz işlemi seçiniz");

while(klavye.next().equals("e"))
        {
Scanner sc=new Scanner (System.in);
System.out.println("Yapmak istediğiniz işlemi seçiniz");
System.out.println("1-Kişi ekle");
System.out.println("2-Kişileri listele");
System.out.println("3-Kişi sil");

int secim=klavye.nextInt();
islemYap yapın=new islemYap("C:\\Users\\Monster\\Desktop\\phonebookproje\\veri3.txt");
switch(secim)
{
case 1:
    kisiBilgiler bilgiler = new kisiBilgiler();
    System.out.print("İsim Giriniz : ");
    bilgiler.setIsim(sc.next());
    System.out.print("Soyisim Giriniz : ");
    bilgiler.setSoyisim(sc.next());
    System.out.print("Numara Giriniz : ");
    bilgiler.setNumara(sc.next());
    yap.kisiEkle(bilgiler);   
    break;
case 2:
    System.out.print(yap.veriGoruntule());
    break;
case 3:
    System.out.print("Silmek istediğiniz kişinin ismini soyismini giriniz:");
    yap.kisiSil(sc.next());
    break;
}
    System.out.println("\nDevam etmek ister misiniz:");
    secin = 0;
    System.out.println("0-Çıkış");
    System.out.println("e-Devam ");
    System.out.println("______________________");
    System.out.println("Yapmak istediğiniz işlemi seçiniz");
        }
    }
}

