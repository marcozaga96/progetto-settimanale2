package marcozagaria.Classi;

import java.util.Date;

public abstract class Gioco {
    protected int idGioco;
    protected String titolo;
    protected Date annoPubblicazione;
    protected double prezzo;

    public Gioco(int idGioco, double prezzo, Date annoPubblicazione, String titolo) {
        this.idGioco = idGioco;
        this.prezzo = prezzo;
        this.annoPubblicazione = annoPubblicazione;
        this.titolo = titolo;
    }

    public int getIdGioco() {
        return idGioco;
    }

    public void setIdGioco(int idGioco) {
        this.idGioco = idGioco;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Date getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(Date annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Gioco{" +
                "idGioco=" + idGioco +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", prezzo=" + prezzo +
                '}';
    }
}
