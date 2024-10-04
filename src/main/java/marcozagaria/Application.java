package marcozagaria;

import marcozagaria.Classi.Gioco;
import marcozagaria.Classi.GiocoDaTavolo;
import marcozagaria.Classi.Videogioco;
import marcozagaria.Enum.Genere;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Gioco> giochilist = new ArrayList<>();
        giochilist.add(new Videogioco(1, 50, new Date(2024, 10, 11), "Dragon Ball Sparking 0", "xbox", 100, Genere.AZIONE));
        giochilist.add(new GiocoDaTavolo(2, 25.9, new Date(2024, 5, 17), "Munchkin", 5, 2));
        System.out.println(giochilist);
    }

}
