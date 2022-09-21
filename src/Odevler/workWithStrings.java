package Odevler;

public class workWithStrings {
    public void run(){
        //Ders 17 - Stringlerle çalışmak

        String message = "Bugün hava çok güzel";
        System.out.println(message.charAt(2));
        System.out.println("Eleman sayısı: " + message.length());
        System.out.println(message.concat(". Yaşasın"));
        System.out.println(message.startsWith("B")); // ile başlıyor mu
        System.out.println(message.endsWith("a")); //ile bitiyor mu
        char[] characters = new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf('a')); //karakterin kaçıncı indexte olduğunu bul - soldan
        System.out.println(message.lastIndexOf('a'));
    }
}
