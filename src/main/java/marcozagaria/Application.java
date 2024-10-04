package marcozagaria;

import marcozagaria.Classi.Collezione;
import marcozagaria.Classi.GiocoDaTavolo;
import marcozagaria.Classi.Videogioco;
import marcozagaria.Enum.Genere;

import java.util.Date;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Collezione giochilist = new Collezione();
        giochilist.agiungiGioco(new Videogioco(1, 50, new Date(2024, 10, 11), "Dragon Ball Sparking 0", "xbox", 100, Genere.AZIONE));
        giochilist.agiungiGioco(new GiocoDaTavolo(2, 25.9, new Date(2020, 5, 17), "Munchkin", 5, 2));
        System.out.println(giochilist);

        System.out.println("inserisci un numero id");
        int n = scanner.nextInt();
        giochilist.ricercaId(n);
    }

}
