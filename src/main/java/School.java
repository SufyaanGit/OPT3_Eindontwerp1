import java.util.ArrayList;
import java.util.Scanner;

public class School {
        private String naam;
        private ArrayList<Klas> klassen;

        public School(String naam){
            this.naam = naam;
            this.klassen = new ArrayList<Klas>();
            Klas klas1 = new Klas(1);
            Klas klas2 = new Klas(2);
            Klas klas3 = new Klas(3);
            klassen.add(klas1 );
            klassen.add(klas2);
            klassen.add(klas3);
        }

        public void inschrijven(){
            Klas k = new Klas(0);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hoe heet je?");
            String pnaam = scanner.nextLine();
            System.out.println("1.Werknemer of 2.leerling?");
            Integer antw = scanner.nextInt();
            if(antw == 1){
                scanner.nextLine();
                System.out.println("wat is je taak?");
                String taak  = scanner.nextLine();
                k.getPersonen().add(new Werknemer(pnaam, taak));
            }
            else if (antw == 2){
                System.out.println("Hoe oud ben je?");
                Integer lrlngleeftijd = scanner.nextInt();
                Integer klas = k.geefKlas(lrlngleeftijd);
                for (Klas Klas : klassen) {
                    if(klas == Klas.getNummer()){
                        Klas.getPersonen().add(new Leerling("pnaam", lrlngleeftijd));
                    }
                }
            }
            System.out.println("Succesvol ingeschreven");
        }



        public String getNaam() {
            return naam;
        }

    public ArrayList<Klas> getKlassen() {
        return klassen;
    }
}


