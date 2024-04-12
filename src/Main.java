import java.util.Random;

        public class Main {
            public static void main(String[] args) {
                String[] words = {"Heart", "Cherry", "Coin", "Melon", "Joker"};
                int numberOfCombinations = 5;
                generateRandomCombinations(words, numberOfCombinations);
            }

            public static void generateRandomCombinations(String[] words, int numberOfCombinations) {
                Random random = new Random();

                for (int i = 0; i < numberOfCombinations; i++) {
                    StringBuilder combination = new StringBuilder();
                    for (int j = 0; j < words.length; j++) {
                        int randomIndex = random.nextInt(words.length);
                        combination.append(words[randomIndex]).append(" ");
                    }
                    System.out.println(combination.toString().trim());
                }
            }
        }