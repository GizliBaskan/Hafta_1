package Odevler;

public class MiniProject4 {
    public void run(){
        //ders 22 - mini proje 4 arkadas sayi

        int sayi1 = 2 ;
        int sayi2 = 18416;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 = toplam1 + i;
            }
        }
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                toplam2 = toplam2 + i;
            }
        }
        if (sayi1 == toplam2 && sayi2 == toplam1) {
            System.out.println(sayi1 + " ve " + sayi2 + " arkadaş sayıdır");
        }else {
            System.out.println(sayi1 + " ve " + sayi2 + " arkadaş sayı değildir");

        }
    }
}
