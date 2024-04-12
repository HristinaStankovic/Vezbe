
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
            }

            }
