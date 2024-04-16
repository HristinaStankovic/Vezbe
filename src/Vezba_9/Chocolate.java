package Vezba_9;

    public class Chocolate extends Product {
        double tezina;

        public Chocolate(String nazivProizvoda, long barKod, double osnovnaCena, double porez, double tezina) {
            super(nazivProizvoda, barKod, osnovnaCena, porez);
            this.tezina = tezina;
        }

        @Override
        public String toString() {
            return super.toString() + ", Tezina: " + tezina;
        }
    }
