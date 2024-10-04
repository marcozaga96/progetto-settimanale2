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
            giochiFiltrati.forEach(gioco -> System.out.println("i giochi di prezzo inferiore a: " + prezzo + " sono: " + gioco));
            return giochiFiltrati;
        }
    }

    @Override
    public String toString() {
        return "Collezione{" +
                "giochilist=" + giochilist +
                '}';
    }
}
