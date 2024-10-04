package marcozagaria.Classi;

import marcozagaria.Enum.Genere;

import java.util.Date;

public class Videogioco extends Gioco {
    protected String piattaforma;
    protected int durataGioco;
    protected Genere genere;

    public Videogioco(int idGioco, double prezzo, Date annoPubblicazione, String titolo, String piattaforma, int durataGioco, Genere genere) {
        super(idGioco, prezzo, annoPubblicazione, titolo);
        this.piattaforma = piattaforma;
        this.durataGioco = durataGioco;
        this.genere = genere;
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }

    public int getDurataGioco() {
        return durataGioco;
    }

    public void setDurataGioco(int durataGioco) {
        this.durataGioco = durataGioco;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Videogioco{" +
                "piattaforma='" + piattaforma + '\'' +
                ", durataGioco=" + durataGioco +
                ", genere=" + genere +
                ", idGioco=" + idGioco +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", prezzo=" + prezzo +
                '}';
    }
}
