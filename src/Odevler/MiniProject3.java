package Odevler;

public class MiniProject3 {
    public void run() {
        int sayi = 152;
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam+i;

            }

        }
        if (toplam == sayi){
            System.out.println(sayi+ " sayısı, mükemmel bir sayıdır.");
        }else {
            System.out.println(sayi+ " sayısı, mükemmel bir sayı değildir.");

        }
    }
}
