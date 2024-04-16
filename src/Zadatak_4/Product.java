package Zadatak_4;

public class Product {
        String nazivProizvoda;
        long barKod;
        double osnovnaCena;
        double porez;

        public Product(String nazivProizvoda, long barKod, double osnovnaCena, double porez) {
            this.nazivProizvoda = nazivProizvoda;
            this.barKod = barKod;
            this.osnovnaCena = osnovnaCena;
            this.porez = porez;
        }

        public double cenaSaPDV_om() {

             double punaCena = osnovnaCena *  porez;
            return punaCena;
        }

        @Override
        public String toString() {
            return "Naziv proizvoda: " + nazivProizvoda + ", Barkod: " + barKod + ", Cena sa PDV-om: " + cenaSaPDV_om();
        }
    }

