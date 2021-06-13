public class Gebruiker {
    private String gebruikersnaam;
    private String wachtwoord;

    public Gebruiker(String gebruikersnaam, String wachtwoord){
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        Login.getInstance().getGebruikers().add(this);
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }
}

