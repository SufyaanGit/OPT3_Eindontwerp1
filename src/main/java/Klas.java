import java.util.ArrayList;

public class Klas {
        private Integer nummer;
        private ArrayList<Persoon> personen;

        public Klas(Integer nummer){
            this.nummer = nummer;
            this.personen = new ArrayList<>();
        }

        public Integer geefKlas(Integer leeftijd){
            Integer klas = 0;
            if(leeftijd <= 12){
                klas = 1;
            }
            else if(leeftijd <=17){
                klas = 2;
            }
            else if(leeftijd >= 18){
                klas = 3;

            }
            return klas;
        }
        public Integer getNummer() {
            return nummer;
        }

        public ArrayList<Persoon> getPersonen() {
            return personen;
        }
    }



