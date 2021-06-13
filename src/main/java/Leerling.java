import java.util.Scanner;

public class Leerling extends Persoon{
    private Integer leeftijd;

    public Leerling(String naam, Integer leeftijd){
        super(naam);
        this.leeftijd = leeftijd;
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
        System.out.println(this.leeftijd);
    }



    public String getNaam() {
        return super.getNaam();
    }

    public Integer getLeeftijd() {
        return leeftijd;
    }
}
