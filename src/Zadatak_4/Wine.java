package Zadatak_4;

    public class Wine extends Product {
        double dodatniPorez;
        double zapreminaBoce;

        public Wine(String nazivProizvoda, long barKod, double osnovnaCena, double porez, double dodatniPorez, double zapreminaBoce) {
            super(nazivProizvoda, barKod, osnovnaCena, porez);
            this.dodatniPorez = dodatniPorez;
            this.zapreminaBoce = zapreminaBoce;
        }

        @Override
        public double cenaSaPDV_om() {
            double punaCena = osnovnaCena + (osnovnaCena * porez);
            double cenaMarzirana = punaCena + (punaCena * dodatniPorez);
            return cenaMarzirana;
        }


        @Override
        public String toString() {
            return super.toString() + ", Dodatni porez: " + dodatniPorez + ", Zapremina boce: " + zapreminaBoce;
        }
    }

