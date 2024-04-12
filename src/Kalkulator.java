import java.util.Date;
import java.util.Scanner;

public class Kalkulator {

    Scanner scanner = new Scanner(System.in);

    double operand1 = 5;
    double operand2 = 10;

    public double add(){
        double suma = operand1 + operand2;
        return suma;
    }

    public double sub(){
        double subtraction = operand1 - operand2;
        return subtraction;
    }

    public double mul (){
        double multiplication = operand1 * operand2;
        return multiplication;
    }

    public double div(){
        double division = operand1 / operand2;
        return division;
    }
}
