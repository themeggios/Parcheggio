package parcheggio;

public class AlreadyExistingPlate extends RuntimeException {

    public AlreadyExistingPlate() {
        super("La targa esiste già");
    }
    public AlreadyExistingPlate(String targa) {
        super("La targa " + "esiste già");
    }
}
