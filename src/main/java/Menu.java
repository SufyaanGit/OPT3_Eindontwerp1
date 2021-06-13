import java.util.Scanner;
public class Menu {
    private School school;
    private Leerling leerling;
    private Werknemer werknemer;

    public Menu(School school, Leerling leerling, Werknemer werknemer) {
        this.school = school;
        this.leerling = leerling;
        this.werknemer = werknemer;
    }

    public void toonMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer uw gebruikersnaam?");
        String gn = scanner.nextLine();
        System.out.println("Voer uw wachthwoord?");
        String ww = scanner.nextLine();
        if (Login.getInstance().loginCheck(gn, ww) == true) {
            System.out.println("1) Leerling inschrijven");
            System.out.println("2) Werknemer inschrijven");
            System.out.println("3) toon gegevens van leerling");
            System.out.println("4) toon gegevens van werknemer");
            Integer keuze = scanner.nextInt();

            while (keuze > 3) {
                System.out.print("Maak uw keuze:");
                keuze = scanner.nextInt();
            }
            System.out.println();
            switch (keuze) {
                case 1:
                    this.school.leerlingInschrijven();
                    break;
                case 2:
                    this.school.werknemerInschrijven();
                case 3:
                    this.leerling.printGegevens();
                    break;
                case 4:
                    this.werknemer.printGegevens();
                    break;
            }
        }
        else System.out.println("Verkeerde gebruikersnaam of wachtwoord");
    }
}

