import java.util.Scanner;

public class Vezba_11 {

    public void performSwitch() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        double a = scanner.nextDouble();
        System.out.println("Unesite drugi broj: ");
        double b = scanner.nextDouble();
        System.out.println("Unesi operator: ");
        String c = scanner.next();

        switch (c){
            case "+": {
                System.out.println("Zbir je: "+ (a+b));

            }break;
            case "-":{
                System.out.println("Razlika je: " + (a-b));
            }break;
            case "/": {
                if (b != 0 && a != 0) {
                    System.out.println("Kolicnik je: " + (a / b));
                }else{
                    System.out.println("Deljenje nulom nije dozvoljeno.");}
            }break;
            case "*":{
                System.out.println("Proizvod je: " + (a*b));
            }

        }
    }

}
