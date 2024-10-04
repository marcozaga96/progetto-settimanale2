package marcozagaria.Classi;

import java.util.ArrayList;
import java.util.List;

public class Collezione {
    protected List<Gioco> giochilist;

    public Collezione() {
        this.giochilist = new ArrayList<>();
    }

    public List<Gioco> getGiochi() {
        return giochilist;
    }

    public void setGiochi(List<Gioco> giochi) {
        this.giochilist = giochi;
    }

    public void agiungiGioco(Gioco gioco) throws Exception {
        if (giochilist.stream().anyMatch(gioco1 -> gioco1.getIdGioco() == gioco.getIdGioco())) {
            throw new Exception("gioco con id " + gioco.getIdGioco() + " gia esistente");
        }
        giochilist.add(gioco);
    }

    @Override
    public String toString() {
        return "Collezione{" +
                "giochilist=" + giochilist +
                '}';
    }
}
