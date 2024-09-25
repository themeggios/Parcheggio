package parcheggio;

public class Main {

    public static void main(String[] args) {
	Parcheggio parcheggio = new Parcheggio("Meggio's Park");
	parcheggio.inserisciAuto("AA111BB", "Opel", "Corsa");
	parcheggio.inserisciAuto("AA1111B", "Opel", "Corsa");
	parcheggio.inserisciAuto("AA111BB", "Opel", "Corsa");
        System.out.println(parcheggio);
    }
}
