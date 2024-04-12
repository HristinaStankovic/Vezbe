import java.util.Random;

public class Nizovi1 {
            String[] random_stvari = {"Bicycle", "Car", "Mobile Phone"};
            String[] modeli = {"BMX", "Renault 4", "iPhone"};
            double[] cene = {150.55, 100.00, 500.00};
            int numberOfCombinations = 3;


    public static void generateSentences(String[] random_stvari, String[] modeli, double[] cene, int numberOfCombinations) {
            Random random = new Random();

            for (int i = 0; i < numberOfCombinations; i++) {
                int randomIndex = random.nextInt(random_stvari.length);
                String random_stvar = random_stvari[randomIndex];
                String model = modeli[randomIndex];
                double cena = cene[randomIndex];

                System.out.println(model + " is type " + random_stvar.toLowerCase() + " and it costs " + cena + ".");
            }
        }
    }