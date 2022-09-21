package Odevler;

public class SwitchBlock {
    public void run(){
        // ders 10 - swtich
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Muhteşem, geçtin!");
                break;
            case 'B':
                System.out.println("Çok güzel, geçtin!");
                break;
            case 'C':
                System.out.println("İyi, geçtin!");
                break;
            case 'D':
                System.out.println("Fena değil, geçtin!");
                break;
            case 'F':
                System.out.println("Sınıfta kaldın, tekrar");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}
