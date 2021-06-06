import java.util.ArrayList;

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

    public boolean loginCheck(String gebruikersnaam, String wachtwoord){
        for(Gebruiker gebruiker : gebruikers){
            if(gebruikersnaam.equals(gebruiker.getGebruikersnaam()) && wachtwoord.equals(gebruiker.getWachtwoord())){
                ingelogdeGebruiker = gebruiker;
                return true;
            }
        }
        return false;
    }
}
