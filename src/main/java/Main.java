public class Main {

    public static void main(String[] args) {
	School weekendschool = new School("weekendschool");
	Leerling leerling = new Leerling("sufyaan", 17);
	Werknemer werknemer = new Werknemer("Jan", "schoonmaker");
	Gebruiker gebruiker = new Gebruiker("sufyaan", "ww");
	Menu menu = new Menu(weekendschool, leerling, werknemer);
	menu.toonMenu();
    }
}
