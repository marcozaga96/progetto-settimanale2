package marcozagaria.Classi;

import java.util.Date;

public class GiocoDaTavolo extends Gioco {
    protected int numeroGiocatori;
    protected int durataMediaPartita;

    public GiocoDaTavolo(int idGioco, double prezzo, Date annoPubblicazione, String titolo, int numeroGiocatori, int durataMediaPartita) {
        super(idGioco, prezzo, annoPubblicazione, titolo);
        this.numeroGiocatori = numeroGiocatori;
        this.durataMediaPartita = durataMediaPartita;
    }

    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }

    public void setNumeroGiocatori(int numeroGiocatori) {
        this.numeroGiocatori = numeroGiocatori;
    }

    public int getDurataMediaPartita() {
        return durataMediaPartita;
    }

    public void setDurataMediaPartita(int durataMediaPartita) {
        this.durataMediaPartita = durataMediaPartita;
    }

    @Override
    public String toString() {
        return "GiocoDaTavolo{" +
                "numeroGiocatori=" + numeroGiocatori +
                ", durataMediaPartita=" + durataMediaPartita +
                ", prezzo=" + prezzo +
                ", annoPubblicazione=" + annoPubblicazione +
                ", titolo='" + titolo + '\'' +
                ", idGioco=" + idGioco +
                '}';
    }
}
