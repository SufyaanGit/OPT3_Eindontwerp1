import java.util.ArrayList;

public class Werknemer extends Persoon {

    private String taak;

    public Werknemer(String naam, String taak){
        this.naam = naam;
        this.taak = taak;
    }

    @Override
    public void printGegevens() {
        geefNaam();
        geefExtraGegevens();
    }

    @Override
    public void geefNaam() {
        System.out.println(this.naam);
    }

    @Override
    public void geefExtraGegevens() {
        System.out.println(this.taak);
    }

    @Override
    public String getNaam() {
        return super.getNaam();
    }

    public String getTaak() {
        return taak;
    }
}

