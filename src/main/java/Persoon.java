public class Persoon {
    protected String naam;

    public Persoon(String naam){
        this.naam = naam;
    }
    public void printGegevens(){
        geefNaam();
        geefExtraGegevens();
    }

    public void geefNaam(){

    }

    public void geefExtraGegevens(){

    }

    public String getNaam() {
        return naam;
    }
}
