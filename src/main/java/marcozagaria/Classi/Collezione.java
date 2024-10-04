package marcozagaria.Classi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collezione {
    protected List<Gioco> giochilist;

    public Collezione() {
        this.giochilist = new ArrayList<>();
    }

    public List<Gioco> getGiochilist() {
        return giochilist;
    }

    public void setGiochilist(List<Gioco> giochilist) {
        this.giochilist = giochilist;
    }

    public void agiungiGioco(Gioco gioco) throws Exception {
        if (giochilist.stream().anyMatch(gioco1 -> gioco1.getIdGioco() == gioco.getIdGioco())) {
            throw new Exception("gioco con id " + gioco.getIdGioco() + " gia esistente");
        }
        giochilist.add(gioco);
    }

    public Gioco ricercaId(int idGioco) throws Exception {
        for (Gioco gioco : giochilist) {
            if (gioco.getIdGioco() == idGioco) {
                System.out.println("l'id " + idGioco + " corrisponde a: " + gioco);
                return gioco;
            }
        }
        throw new Exception("gioco con id " + idGioco + " non trovato.");
    }

    public List<Gioco> ricercaPerPrezzo(double prezzo) throws Exception {
        List<Gioco> giochiFiltrati = giochilist.stream()
                .filter(gioco -> gioco.getPrezzo() < prezzo).collect(Collectors.toList());
        if (giochiFiltrati.isEmpty()) {
            throw new Exception("nessun gioco con prezzo inferiore a " + prezzo);
        } else {
            giochiFiltrati.forEach(gioco -> System.out.println("i giochi di prezzo inferiore a " + prezzo + " sono: " + gioco));
            return giochiFiltrati;
        }
    }

    public List<GiocoDaTavolo> ricercaPerGiocatori(int giocatori) throws Exception {
        List<GiocoDaTavolo> giochiFiltrati = giochilist.stream()
                .filter(gioco -> gioco instanceof GiocoDaTavolo)
                .map(gioco -> (GiocoDaTavolo) gioco)
                .filter(gioco -> gioco.getNumeroGiocatori() == giocatori)
                .collect(Collectors.toList());
        if (giochiFiltrati.isEmpty()) {
            throw new Exception("nessun gioco da tavolo trovato con " + giocatori + " giocatori.");
        } else {
            giochiFiltrati.forEach(gioco -> System.out.println("i giochi con " + giocatori + " giocatori sono: " + gioco));
        }
        return giochiFiltrati;
    }

    public void rimuoviGioco(int idGioco) throws Exception {
        List<Gioco> giochiDaEliminare = giochilist.stream()
                .filter(gioco -> gioco.getIdGioco() == idGioco)
                .collect(Collectors.toList());
        if (!giochiDaEliminare.isEmpty()) {
            giochilist.removeAll(giochiDaEliminare);
            System.out.println("gioco con id " + idGioco + " eliminato");
        } else {
            throw new Exception("non esiste un gioco da eliminare con questo id " + idGioco);
        }
    }

    @Override
    public String toString() {
        return "Collezione{" +
                "giochilist=" + giochilist +
                '}';
    }
}
