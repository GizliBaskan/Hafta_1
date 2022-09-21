package Odevler;

public class IfBlocks {
    public void run(){
        //ders 8 - if blokları
        int requiredAge = 18;
        int age = 17;
        if (age < requiredAge) {
            System.out.println("Yaşınız tutmuyor. Gereken yaş: " + requiredAge);
        } else if (age >= requiredAge) {
            System.out.println("Yaşınız tutuyor.");
        }
    }
}
