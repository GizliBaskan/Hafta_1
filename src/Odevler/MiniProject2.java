package Odevler;

public class MiniProject2 {
    public void run(){
        //ders 20- mini proje 2 sesli harf
        char harf = 'Z';
        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(harf+" bir kalın sesli harftir");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println(harf+" bir ince sesli harftir");
                break;
            default:
                System.out.println(harf+" kalın veya ince sesli bir harf değlidir");
        }
    }
}
