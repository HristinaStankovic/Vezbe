import Zadatak_4.Chocolate;
import Zadatak_4.Product;
import Zadatak_4.Wine;

public class Main {
            public static void main(String[] args) {
                Nizovi1 nizovi = new Nizovi1();
                nizovi.generateSentences(nizovi.random_stvari, nizovi.modeli, nizovi.cene, nizovi.numberOfCombinations);

                System.out.println("---------------------------------------------------------------------------------------------");

                Nizovi2 nizovi2 = new Nizovi2();
                nizovi2.generateRandomCombinations(nizovi2.words, nizovi2.numberOfCombinations);

                System.out.println("---------------------------------------------------------------------------------------------");

                Kalkulator kalkulator = new Kalkulator();

                System.out.println(kalkulator.sub());
                System.out.println( kalkulator.add());
                System.out.println(kalkulator.div());
                System.out.println(kalkulator.mul());

                System.out.println("----------------------------------------------------------------------------------------------");

                Vezba_11 vezba11 = new Vezba_11();
                vezba11.performSwitch();

                System.out.println("-----------------------------------------------------------------------------------------------");

                Vezba_14 vezba14 = new Vezba_14();
                vezba14.modulo();

                System.out.println("-----------------------------------------------------------------------------------------------");

                Vezba_15 vezba15 = new Vezba_15();
                vezba15.car();

                System.out.println("----------------------------------------------------------------------------------------------");

                Product product = new Product("Proizvod", 111111111111111L,00,0.2);
                System.out.println(product);
                Wine wine = new Wine("Plavac", 381361831878738L,700,0.2,0.1,0.7);
                System.out.println(wine);
                Chocolate chocolate = new Chocolate("Ferrero Dark",76478647746767L,879,0.2,100);
                System.out.println(chocolate);

            }

            }
