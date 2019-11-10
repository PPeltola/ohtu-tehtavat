package ohtuesimerkki;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class StatisticsTest {

    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    Statistics stats;

    @Before
    public void setUp(){
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
    }

    @Test
    public void hakeePelaajan() {
        assertEquals(null, stats.search("tapio"));
        assertEquals(new Player("Semenko", "EDM", 4, 12). toString(), stats.search("Semenko"));
    }

    @Test
    public void hakeeJoukkueen() {
        ArrayList<Player> players = new ArrayList<>();

        players.add(new Player("Semenko", "EDM", 4, 12));
        players.add(new Player("Kurri",   "EDM", 37, 53));
        players.add(new Player("Gretzky", "EDM", 35, 89));

        for (Player p : stats.team("EDM")) {

        }
    }
}
