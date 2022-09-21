package Odevler;

public class Arrays {
    public void run(){
        //Ders 14 - Arrays

        String[] students = {"Furkan", "Engin", "Mehmet", "Kenan"};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("------------------------------------------------");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
