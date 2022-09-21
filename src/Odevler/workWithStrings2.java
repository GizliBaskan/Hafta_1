package Odevler;

public class workWithStrings2 {
    public void run(){
        //ders 18 - stringlerle çalışmak 2

        String message = "     Bugün hava çok güzel    ";
        String newMessage = "Bugün hava çok güzel";
        System.out.println(newMessage.replace(' ', '-'));
        System.out.println(message.substring(2)); //mesajı 2. indexinden itibaren ver
        System.out.println(message.substring(2, 5)); //mesajı x ve y. indexe kadar ver

        for (String word : message.split(" ")) { //alt alta yaz
            System.out.println(word);
        }
        System.out.println(message.toUpperCase());
        System.out.println(message.trim()); //boşlukları düzelt
    }
}
