package Odevler;

public class greatestNumber {
    public void run(){
        //ders 9 - en büyük sayı
        int number1 = 20;
        int number2 = 20;
        int number3 = 20;

        int largestNumber = number1;

        if (largestNumber < number2) {
            largestNumber = number2;
        }
        if (largestNumber < number3) {
            largestNumber = number3;
        } else {
            System.out.println("NOT: Tüm sayılar eşit");
        }
        System.out.println("En büyük sayı: " + largestNumber);
    }
}
