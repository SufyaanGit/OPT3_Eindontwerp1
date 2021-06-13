import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private String naam;
    private ArrayList<Klas> klassen;

    public School(String naam) {
        this.naam = naam;
        this.klassen = new ArrayList<>();
        Klas klas1 = new Klas(1);
        Klas klas2 = new Klas(2);
        Klas klas3 = new Klas(3);
        klassen.add(klas1);
        klassen.add(klas2);
        klassen.add(klas3);
    }

    Klas k = new Klas(0);
    Scanner scanner = new Scanner(System.in);

    public void leerlingInschrijven() {
        System.out.println("Hoe heet je?");
        String lnaam = scanner.nextLine();
        System.out.println("Hoe oud ben je?");
        Integer lleeftijd = scanner.nextInt();
        Integer klas = k.geefKlas(lleeftijd);
        for (Klas Klas : klassen) {
            if (klas == Klas.getNummer()) {
                Klas.getPersonen().add(new Leerling("pnaam", lleeftijd));
            }
        }
        System.out.println("Je bent succesvol ingeschreven");
    }

    public void werknemerInschrijven(){
        System.out.println("Hoe heet u?");
        String wnaam = scanner.nextLine();
        System.out.println("Wat is uw taak?");
        String taak = scanner.nextLine();
        k.getPersonen().add(new Werknemer(wnaam, taak));
        System.out.println("U bent succesvol ingeschreven");
    }

        public String getNaam () {
            return naam;
        }

        public ArrayList<Klas> getKlassen () {
            return klassen;
        }
    }




