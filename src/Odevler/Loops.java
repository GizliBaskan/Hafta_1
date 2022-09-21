package Odevler;

public class Loops {
    public void run() {
        //Ders 11 - For loop
        for (int i = 0; i <= 50; i+=3) {
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");

        //ders 12 - while loop
        int i = 1;
        while (i<10){
            System.out.println(i);
            i+=2;
            System.out.println("While döngüsü bitti");
        }
        //ders 13 - do-while loop
        int j = 1;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-while döngüsü bitti");
    }
}
