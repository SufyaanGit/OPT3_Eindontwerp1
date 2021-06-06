import java.util.Scanner;
public class Menu {
    private School school;
    private Leerling leerling;
    private Werknemer werknemer;

    public Menu(School school, Leerling leerling, Werknemer werknemer){
        this.school = school;
        this.leerling = leerling;
        this.werknemer = werknemer;
    }
    public void toonMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer uw gebruikersnaam?");
        String gebruikersnaam = scanner.nextLine();
        System.out.println("Voer uw wachthwoord?");
        String wachtwoord = scanner.nextLine();
        if(Login.getInstance().loginCheck(gebruikersnaam, wachtwoord)==true);
        System.out.println("1) Leerling inschrijven");
        System.out.println("2) toon gegevens van leerling");
        System.out.println("3) toon gegevens van werknemer");
        Integer keuze = scanner.nextInt();

        while(keuze > 3){
            System.out.print("Maak uw keuze:");
            keuze = scanner.nextInt();
        }
        System.out.println();
        switch (keuze) {
            case 1:
                this.school.inschrijven();
                break;
            case 2:
                this.leerling.printGegevens();
                break;
            case 3:
                this.werknemer.printGegevens();
                break;
        }

    }
}
