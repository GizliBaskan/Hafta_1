package Odevler;

public class MiniProject1 {
    public void run(){
        //ders 19 - mini proje 1 asal sayi

        int number = 1;
        boolean isPrime = true;

        if (number ==1){
            System.out.println("Sayı asal değildir: "+number);
            return;
        }
        if (number<1){
            System.out.println("Geçersiz sayı");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("Sayı asaldır: " + number);
        }else {
            System.out.println("Sayı asal değildir: "+number);
        }
    }
}
