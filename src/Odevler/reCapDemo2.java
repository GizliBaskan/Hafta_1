package Odevler;

public class reCapDemo2 {
    public void run(){
        //Ders 15 - Recap Demo 2

        double[] myList = {14.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number){
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Total: " + total);
        System.out.println("Max: " + max);
    }
}
