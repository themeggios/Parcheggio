package parcheggio;

import java.util.regex.*;

public class Auto {
    private String targa;
    private String marca;
    private String modello;

    public Auto(String targa, String marca, String modello) {
        controlloTarga(targa);
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

    public boolean controlloTarga(String targa){

        Pattern pattern = Pattern.compile("^[A-Z]{2}\\d{3}[A-Z]{2}$");

        Matcher matcher = pattern.matcher(targa);

        if(!matcher.matches())
            throw new IllegalArgumentException("La targa " + targa + "non è valida!");
        return true;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "Targa='" + targa + '\'' +
                ", Marca='" + marca + '\'' +
                ", Modello='" + modello + '\'' +
                '}';
    }
}
