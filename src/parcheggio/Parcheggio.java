package parcheggio;

import java.util.ArrayList;

public class Parcheggio {
    private ArrayList<Auto> arrayAuto;
    private String nome;

    public Parcheggio(String nome) {
        this.arrayAuto = new ArrayList<>();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public boolean inserisciAuto(String targa, String marca, String modello){
        try {
            if(!trovaAuto(targa))
                return arrayAuto.add(new Auto(targa, marca, modello));
            throw new AlreadyExistingPlate(targa);
        } catch (IllegalArgumentException | AlreadyExistingPlate e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean rimuoviAuto(String targa){
        for(Auto auto : arrayAuto){
            if(auto.getTarga().equals(targa))
                return arrayAuto.remove(auto);
        }
        return false;
    }

    public boolean trovaAuto(String targa){
        for(Auto auto : arrayAuto){
            if(auto.getTarga().equals(targa))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Parcheggio{" +
                "arrayAuto=" + arrayAuto +
                ", nome='" + nome + '\'' +
                '}';
    }
}
