import java.sql.SQLOutput;

public class Vezba_15 {

    public void car(){

        String carModel = "Ford";
        int doors = 4;

        if(carModel=="Ford"){
            System.out.println("Model auta " + carModel + " ima " + doors + " vrata.");
        }else{
            System.out.println("Nepoznat model automobila.");
        }

    }
}
