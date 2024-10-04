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
        boolean exit = false;
        Collezione giochilist = new Collezione();
        giochilist.agiungiGioco(new Videogioco(1, 50, new Date(2024, 10, 11), "Dragon Ball Sparking 0", "xbox", 100, Genere.AZIONE));
        giochilist.agiungiGioco(new GiocoDaTavolo(2, 25.9, new Date(2020, 5, 17), "Munchkin", 5, 2));
        giochilist.agiungiGioco(new Videogioco(3, 70, new Date(2023, 10, 11), "Fifa", "xbox", 200, Genere.SPORT));
        giochilist.agiungiGioco(new GiocoDaTavolo(4, 35.9, new Date(2018, 5, 17), "MonopolY", 4, 3));
        System.out.println(giochilist);


        while (!exit) {
            System.out.println("Scegli un'operazione:");
            System.out.println("1.cerca con id, 2.cerca per prezzo, 3.cerca per n di giocatori, 4.elimina tramite id, 5.guarda le statistiche, 0.per uscire");
            int number = scanner.nextInt();
            try {
                switch (number) {
                    case 1:
                        System.out.println("inserisci l'id del gioco che vuoi cercare");
                        int n = scanner.nextInt();
                        giochilist.ricercaId(n);
                        break;
                    case 2:
                        System.out.println("inserisci il prezzo massimo");
                        double prezzo = scanner.nextDouble();
                        giochilist.ricercaPerPrezzo(prezzo);
                        break;
                    case 3:
                        System.out.println("con quanti giocatori vuoi che sia il tuo gioco?");
                        int numeroGiocatori = scanner.nextInt();
                        giochilist.ricercaPerGiocatori(numeroGiocatori);
                        break;
                    case 4:
                        System.out.println("inserisci l'id del gioco da eliminare");
                        int idDaEliminare = scanner.nextInt();
                        giochilist.rimuoviGioco(idDaEliminare);
                        System.out.println("lista di giochi aggiornata " + giochilist);
                        break;
                    case 5:
                        giochilist.stampaStatistiche();
                        break;
                    case 0:
                        exit = true;
                        System.out.println("uscita in corso");
                        break;
                    default:
                        System.out.println("Scelta non valida. Riprova.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Errore: " + e.getMessage());
            }
        }
        scanner.close();
    }

}
