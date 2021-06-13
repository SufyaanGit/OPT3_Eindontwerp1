import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    private static Login singleton;
    private Gebruiker ingelogdeGebruiker;
    private ArrayList<Gebruiker> gebruikers;

    private Login(){
        ingelogdeGebruiker = null;
        this.gebruikers = new ArrayList<>();
    }

    public static Login getInstance(){
        if(singleton == null){
            return singleton = new Login();
        }
        return singleton;
    }

    public boolean loginCheck(String gn, String ww){
        for(Gebruiker gebruiker : gebruikers){
            if(gn.equals(gebruiker.getGebruikersnaam()) && ww.equals(gebruiker.getWachtwoord())){
                ingelogdeGebruiker = gebruiker;
                return true;
            }
        }
        return false;
    }

    public ArrayList<Gebruiker> getGebruikers() {
        return gebruikers;
    }

    public Gebruiker getIngelogdeGebruiker() {
        return ingelogdeGebruiker;
    }
}
